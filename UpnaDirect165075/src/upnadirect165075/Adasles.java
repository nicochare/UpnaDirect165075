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
public class Adasles implements Aseguradora {
    private final String nombre;
    
    public Adasles() {
        this.nombre = "Adasles";
    }
    
    @Override
    public double calcular_importe(Bien b, Cliente c) {
        double porcentaje = 0.02;
        if (b instanceof Vehiculo && (c.calcular_edad() < 20 || c.calcular_edad() > 60)) {
            porcentaje = 0.06;
        }
        return b.devolver_valor()*porcentaje;
    }
    
    @Override
    public int calcular_comision(double importe) {
        if (importe <= 1000) {
            return (int) floor(importe*0.01);
        } else {
            return (int) floor(importe*0.05);
        }
    }
    
    @Override
    public String devolver_nombre() {
        return this.nombre;
    }
}