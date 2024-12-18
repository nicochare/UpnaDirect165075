/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect165075;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author n
 */
public class PresentadorOfertas {
    private final VistaOfertas vista;
    
    public PresentadorOfertas(VistaOfertas vista) {
        this.vista = vista;
    }    
    
    private List<Oferta> calcularOfertas(Cliente c, Bien b, List<Aseguradora> aseguradoras) {
        List<Oferta> ofertas = new ArrayList<>();
        Oferta of;
        for (Aseguradora as : aseguradoras) {
            double importe = as.calcularImporte(b, c);
            of = new Oferta(importe, as.calcularComision(importe), as, b, c);
            ofertas.add(of);
        }
        
        return ofertas;
    }
    
    private Oferta seleccionarMejorOferta(List<Oferta> ofertas) {
        Oferta minOferta = ofertas.get(0);
        ofertas.remove(0);
        
        for (Oferta of : ofertas) {
            if (of.devolverImporte() < minOferta.devolverImporte()) {
                minOferta = of;
            } else if (of.devolverImporte() == minOferta.devolverImporte()){
                if (of.devolverComision() > minOferta.devolverComision()) {
                    minOferta = of;
                }
            }
        }
        
        return minOferta;
    }
    
    private Cliente pedirDatosCliente() {
        Cliente c;
        int anioNac;
        double salario;
        Calendar fechaActual = Calendar.getInstance();
                
        anioNac = this.vista.pedirFechaNacimiento();
        while (anioNac < 1900 || anioNac > fechaActual.get(Calendar.YEAR)){
            anioNac = this.vista.pedirFechaNacimiento();
        }
        
        salario = this.vista.pedirSalarioCliente();
        while (salario < 1) {
            this.vista.mostrarMensaje("[ERROR] El salario del cliente no puede ser menor a 1. Por favor, introducelo nuevamente.\n");
            salario = this.vista.pedirSalarioCliente();
        }
        
        c = new Cliente(salario, anioNac);
        return c;
    }
    
    private Bien pedirDatosBien() {
        Bien b;
        int tipoBien;
        double valor;
        
        tipoBien = this.vista.pedirTipoBien();
        while (tipoBien != 1 && tipoBien != 2) {
            this.vista.mostrarMensaje("[ERROR] Tipo de bien incorrecto. Por favor introducelo nuevamente.\n");
            tipoBien = this.vista.pedirTipoBien();
        }
        
        
        if (tipoBien == 1) {
            b = new Vehiculo(10);
        } else {
            b = new Vivienda(50001);
        } 
        
        valor = this.vista.pedirValorBien(tipoBien);
        while (!b.verificarRango(valor)) {
            this.vista.mostrarMensaje("[ERROR] Valor de bien incorrecto. Por favor introducelo nuevamente.\n");
            valor = this.vista.pedirValorBien(tipoBien);
        }
        b.modificarValor(valor);
        
        return b;
    }
    
    public String ofrecerOfertaMasVentajosa() {
        Cliente c = pedirDatosCliente();
        Bien b = pedirDatosBien();
        
        List<Aseguradora> aseguradoras = new ArrayList<>();
        aseguradoras.add(new Mafro());
        aseguradoras.add(new Adasles());
        aseguradoras.add(new LineaIndirecta());

        Oferta o = seleccionarMejorOferta(calcularOfertas(c,b,aseguradoras));
        
        String nombreAseguradora = o.devolverAseguradora().devolverNombre();
        String oferta = nombreAseguradora + " | " + (int)o.devolverImporte() + " | " + (int)o.devolverComision();
        this.vista.mostrarMensaje(oferta);
        
        return oferta;
    }
}