/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect165075;
import static java.lang.Math.floor;

/**
 *
 * @author n
 */
public class LineaIndirecta implements Aseguradora{
    private final String nombre;
    
    public LineaIndirecta() {
        this.nombre = "LINEAINDIRECTA";
    }
    
    @Override
    public double calcularImporte(Bien b, Cliente c) {
        double porcentaje = 0.03;
        if ( (b instanceof Vehiculo && b.devolverValor() < 20000) || 
             (b instanceof Vivienda && b.devolverValor() < 150000) ) {
            porcentaje = 0.04;
        } else if (b instanceof Vehiculo && b.devolverValor() >= 20000 && c.calcularEdad() > 60) {
            porcentaje = 0.06;
        }
        return b.devolverValor()*porcentaje;
    }
    
    @Override
    public int calcularComision(double importe) {
        if (importe <= 1000) {
            return (int) floor(importe*0.01);
        } else {
            return (int) floor(importe*0.04);
        }
    }
    
    @Override
    public String devolverNombre() {
        return this.nombre;
    }
}
