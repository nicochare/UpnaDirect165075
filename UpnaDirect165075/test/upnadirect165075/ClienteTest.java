/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect165075;

import java.util.Calendar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author n
 */
public class ClienteTest {
    
    public ClienteTest() {
    }

    @Test
    public void dado_un_cliente_nacido_en_2003_su_edad_es_21() {
        // Dado un cliente nacido en 2003
        Cliente c = new Cliente(1, 2003);
        
        // Cuando calculo su edad
        int edad = c.calcularEdad();
        
        // Entonces debe devolver verdadero a edad == 21
        assertEquals(21, edad);
    }

    @Test
    public void dado_un_cliente_de_salario_30000_devolverSalario_devuelve_30000() {
        // Dado un cliente con salario 30000
        Cliente c = new Cliente(30000, 2000);
        
        // Cuando uso devolverSalario()
        double salario = c.devolverSalario();

        // Entonces debe devolver verdadero
        assertEquals(30000.0, salario, 0.01);
    }
    
    @Test
    public void dado_un_cliente_nacido_en_el_anio_actual_su_edad_es_0() {
        // Dado un cliente nacido en el anio actual
        Calendar fechaActual = Calendar.getInstance();
        int anioActual = fechaActual.get(Calendar.YEAR);
        Cliente c = new Cliente(1, anioActual);
        
        // Cuando calculo su edad
        int edad = c.calcularEdad();
        
        // Entonces debe devolver verdadero
        assertEquals(0, edad);
    }
    
}
