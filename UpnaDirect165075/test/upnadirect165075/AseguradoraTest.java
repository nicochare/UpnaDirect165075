/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect165075;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author n
 */
public class AseguradoraTest {
    
    public AseguradoraTest() {
    }

    @Test
    public void dado_un_cliente_nacido_en_2005_de_salario_15000_y_un_vehiculo_de_valor_30000_mafro_oferta_importe_1500() {
        // Dado un cliente nacido en 2005 con salario 15000
        // Y un vehiculo de valor 30000
        // Y la aseguradora Mafro
        Cliente c = new Cliente (15000, 2005);
        Bien b = new Vehiculo(30000);
        Aseguradora a = new Mafro();
        
        // Cuando calculo el importe
        double importe = a.calcularImporte(b,c);

        // Entonces debe devolver verdadero
        assertEquals(1500, importe, 0.01);
    }

    @Test
    public void dado_un_cliente_nacido_en_2005_de_salario_15000_y_un_vehiculo_de_valor_30000_mafro_oferta_comision_45() {
        // Dado un cliente nacido en 2005 con salario 15000
        // Y un vehiculo de valor 30000
        // Y la aseguradora Mafro
        Cliente c = new Cliente (15000, 2005);
        Bien b = new Vehiculo(30000);
        Aseguradora a = new Mafro();
        
        // Cuando calculo el importe
        double importe = a.calcularImporte(b,c);
        int comision = a.calcularComision(importe);

        // Entonces debe devolver verdadero
        assertEquals(comision, 45);
    }

    @Test
    public void dado_un_cliente_nacido_en_2005_de_salario_15000_y_un_vehiculo_de_valor_30000_lineaindirecta_oferta_importe_900() {
        // Dado un cliente nacido en 2005 con salario 15000
        // Y un vehiculo de valor 30000
        // Y la aseguradora Linea Indirecta
        Cliente c = new Cliente (15000, 2005);
        Bien b = new Vehiculo(30000);
        Aseguradora a = new LineaIndirecta();
        
        // Cuando calculo el importe
        double importe = a.calcularImporte(b,c);

        // Entonces debe devolver verdadero
        assertEquals(900, importe, 0.01);
    }

    @Test
    public void dado_un_cliente_nacido_en_2005_de_salario_15000_y_un_vehiculo_de_valor_30000_lineaindirecta_oferta_comision_9() {
        // Dado un cliente nacido en 2005 con salario 15000
        // Y un vehiculo de valor 30000
        // Y la aseguradora Linea Indirecta
        Cliente c = new Cliente (15000, 2005);
        Bien b = new Vehiculo(30000);
        Aseguradora a = new LineaIndirecta();
        
        // Cuando calculo el importe
        double importe = a.calcularImporte(b,c);
        int comision = a.calcularComision(importe);

        // Entonces debe devolver verdadero
        assertEquals(comision, 9);
    }
    
    @Test
    public void dado_un_cliente_nacido_en_2005_de_salario_15000_y_un_vehiculo_de_valor_30000_adasles_oferta_importe_1800() {
        // Dado un cliente nacido en 2005 con salario 15000
        // Y un vehiculo de valor 30000
        // Y la aseguradora Adasles
        Cliente c = new Cliente (15000, 2005);
        Bien b = new Vehiculo(30000);
        Aseguradora a = new Adasles();
        
        // Cuando calculo el importe
        double importe = a.calcularImporte(b,c);

        // Entonces debe devolver verdadero
        assertEquals(1800, importe, 0.01);
    }

    @Test
    public void dado_un_cliente_nacido_en_2005_de_salario_15000_y_un_vehiculo_de_valor_30000_adasles_oferta_comision_90() {
        // Dado un cliente nacido en 2005 con salario 15000
        // Y un vehiculo de valor 30000
        // Y la aseguradora Adasles
        Cliente c = new Cliente (15000, 2005);
        Bien b = new Vehiculo(30000);
        Aseguradora a = new Adasles();
        
        // Cuando calculo el importe
        double importe = a.calcularImporte(b,c);
        int comision = a.calcularComision(importe);

        // Entonces debe devolver verdadero
        assertEquals(comision, 90);
    }
    
}
