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
public class PresentadorOfertasTest {
    
    public PresentadorOfertasTest() {
    }

    @Test
    public void dado_un_cliente_nacido_en_2005_con_salario_15000_y_vehiculo_de_valor_30000_su_oferta_es_lineaindirecta_900_importe_9_comision() {
        // Dado un cliente nacido en 2005 con salario 15000
        // Y un bien de tipo vehículo de valor 30000
        PresentadorOfertas prOf = new PresentadorOfertas(new VistaOfertas());
        Cliente c = new Cliente(15000, 2005);
        Bien b = new Vehiculo(30000);
        
        // Cuando calculo su oferta más ventajosa
        String respuesta = prOf.ofrecerOfertaMasVentajosa(c, b);
        
        // Assert
        assertEquals(respuesta, "LINEAINDIRECTA | 900 | 9");
    }
    
}
