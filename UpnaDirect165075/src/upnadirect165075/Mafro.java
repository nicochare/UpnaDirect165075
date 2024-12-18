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
public class Mafro implements Aseguradora{
    private final String nombre;
    
    public Mafro() {
        this.nombre = "MAFRO";
    }
    
    @Override
    public double calcular_importe(Bien b, Cliente c) {
        double porcentaje = 0.03;
        if (b instanceof Vehiculo && c.calcular_edad() < 20) {
            porcentaje = 0.05;
        } else if (b instanceof Vivienda && b.devolver_valor() > 200000 && c.devolver_salario() < 20000) {
            porcentaje = 0.02;
        }
        return b.devolver_valor()*porcentaje;
    }
    
    @Override
    public int calcular_comision(double importe) {
        if (importe <= 1000) {
            return (int) floor(importe*0.01);
        } else {
            return (int) floor(importe*0.03);
        }
    }
    
    @Override
    public String devolver_nombre() {
        return this.nombre;
    }
}

