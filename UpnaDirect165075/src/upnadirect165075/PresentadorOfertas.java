/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect165075;

import java.text.SimpleDateFormat;
import java.text.ParseException;    
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author n
 */
public class PresentadorOfertas {
    private VistaOfertas vista;
    
    public PresentadorOfertas(VistaOfertas vista) {
        this.vista = vista;
    }    
    
    private List<Oferta> calcular_ofertas(Cliente c, Bien b, List<Aseguradora> aseguradoras) {
        List<Oferta> ofertas = new ArrayList<>();
        Oferta of;
        for (Aseguradora as : aseguradoras) {
            double importe = as.calcular_importe(b, c);
            of = new Oferta(importe, as.calcular_comision(importe), as, b, c);
            ofertas.add(of);
        }
        
        return ofertas;
    }
    
    private Oferta seleccionar_mejor_oferta(List<Oferta> ofertas) {
        Oferta min_oferta = ofertas.get(0);
        ofertas.remove(0);
        
        for (Oferta of : ofertas) {
            if (of.devolver_importe() < min_oferta.devolver_importe()) {
                min_oferta = of;
            } else if (of.devolver_importe() == min_oferta.devolver_importe()){
                if (of.devolver_comision() > min_oferta.devolver_comision()) {
                    min_oferta = of;
                }
            }
        }
        
        return min_oferta;
    }
    
    private Date transformar_string_date(String fecha_string) {
        Date fecha_date = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            fecha_date = formatoFecha.parse(fecha_string);
        } catch (ParseException e) {
            this.vista.mostrar_mensaje("[ERROR] Formato de fecha inválido. Use DD/MM/YYYY.\n");
        }
        return fecha_date;
    }
    
    private Cliente pedir_datos_cliente() {
        Cliente c;
        String fnac;
        Date fecha;
        double salario;
                
        
        salario = this.vista.pedir_salario_cliente();
        while (salario < 1) {
            this.vista.mostrar_mensaje("[ERROR] El salario del cliente no puede ser menor a 1. Por favor, introducelo nuevamente.\n");
            salario = this.vista.pedir_salario_cliente();
        }
        
        fnac = this.vista.pedir_fecha_nacimiento();
        fecha = transformar_string_date(fnac);

        while (fecha == null){
            fnac = this.vista.pedir_fecha_nacimiento();
            fecha = transformar_string_date(fnac);
        }
        
        c = new Cliente(salario, fecha);
        return c;
    }
    
    private Bien pedir_datos_bien() {
        Bien b;
        int tipo_bien;
        double valor;
        
        tipo_bien = this.vista.pedir_tipo_bien();
        while (tipo_bien != 1 && tipo_bien != 2) {
            this.vista.mostrar_mensaje("[ERROR] Tipo de bien incorrecto. Por favor introducelo nuevamente.\n");
            tipo_bien = this.vista.pedir_tipo_bien();
        }
        
        
        if (tipo_bien == 1) {
            b = new Vehiculo(10);
        } else {
            b = new Vivienda(50001);
        } 
        
        valor = this.vista.pedir_valor_bien(tipo_bien);
        while (!b.verificar_rango(valor)) {
            this.vista.mostrar_mensaje("[ERROR] Valor de bien incorrecto. Por favor introducelo nuevamente.\n");
            valor = this.vista.pedir_valor_bien(tipo_bien);
        }
        b.modificar_valor(valor);
        
        return b;
    }
    
    public String ofrecer_oferta_mas_ventajosa() {
        Cliente c = pedir_datos_cliente();
        Bien b = pedir_datos_bien();
        
        List<Aseguradora> aseguradoras = new ArrayList<>();
        aseguradoras.add(new Mafro());
        aseguradoras.add(new Adasles());
        aseguradoras.add(new LineaIndirecta());

        Oferta o = seleccionar_mejor_oferta(calcular_ofertas(c,b,aseguradoras));
        
        String oferta = o.devolver_aseguradora() + " | " + o.devolver_importe() + " | " + o.devolver_comision();
        this.vista.mostrar_mensaje(oferta);
        
        return oferta;
    }
}