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
    public double calcularImporte(Bien b, Cliente c) {
        double porcentaje = 0.03;
        if (b instanceof Vehiculo && c.calcularEdad() < 20) {
            porcentaje = 0.05;
        } else if (b instanceof Vivienda && b.devolverValor() > 200000 && c.devolverSalario() < 20000) {
            porcentaje = 0.02;
        }
        return b.devolverValor()*porcentaje;
    }
    
    @Override
    public int calcularComision(double importe) {
        if (importe <= 1000) {
            return (int) floor(importe*0.01);
        } else {
            return (int) floor(importe*0.03);
        }
    }
    
    @Override
    public String devolverNombre() {
        return this.nombre;
    }
}

