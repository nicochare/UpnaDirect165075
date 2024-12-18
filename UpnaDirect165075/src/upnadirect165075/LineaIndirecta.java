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
        this.nombre = "LineaIndirecta";
    }
    
    @Override
    public double calcular_importe(Bien b, Cliente c) {
        double porcentaje = 0.03;
        if ( (b instanceof Vehiculo && b.devolver_valor() < 20000) || 
             (b instanceof Vivienda && b.devolver_valor() < 150000) ) {
            porcentaje = 0.04;
        } else if (b instanceof Vehiculo && b.devolver_valor() >= 20000 && c.calcular_edad() > 60) {
            porcentaje = 0.06;
        }
        return b.devolver_valor()*porcentaje;
    }
    
    @Override
    public int calcular_comision(double importe) {
        if (importe <= 1000) {
            return (int) floor(importe*0.01);
        } else {
            return (int) floor(importe*0.04);
        }
    }
    
    @Override
    public String devolver_nombre() {
        return this.nombre;
    }
}
