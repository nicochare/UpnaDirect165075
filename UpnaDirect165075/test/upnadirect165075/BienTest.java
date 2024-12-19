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
public class BienTest {
    
    public BienTest() {
    }

    @Test
    public void dado_un_vehiculo_de_valor_15000_el_vehiculo_tiene_valor_valido() {
        // Dado un vehiculo de valor 15000
        Bien b = new Vehiculo(15000);
        
        // Cuando verifico su valor
        Boolean valido = b.verificarRango(b.devolverValor());
        
        // Entonces debe devolver verdadero
        assertTrue(valido);
    }
    
    @Test
    public void dado_un_vehiculo_de_valor_55000_el_vehiculo_tiene_valor_invalido() {
        // Dado un vehiculo de valor 55000
        Bien b = new Vehiculo(55000);
        
        // Cuando verifico su valor
        Boolean valido = b.verificarRango(b.devolverValor());
        
        // Entonces debe devolver falso
        assertFalse(valido);
    }
    
    @Test
    public void dada_una_vivienda_de_valor_55000_la_vivienda_tiene_valor_valido() {
        // Dado un vehiculo de valor 55000
        Bien b = new Vivienda(55000);
        
        // Cuando verifico su valor
        Boolean valido = b.verificarRango(b.devolverValor());
        
        // Entonces debe devolver verdadero
        assertTrue(valido);
    }

    @Test
    public void dada_una_vivienda_de_valor_45000_la_vivienda_tiene_valor_invalido() {
        // Dado un vehiculo de valor 45000
        Bien b = new Vivienda(45000);
        
        // Cuando verifico su valor
        Boolean valido = b.verificarRango(b.devolverValor());
        
        // Entonces debe devolver falso
        assertFalse(valido);
    }
}
