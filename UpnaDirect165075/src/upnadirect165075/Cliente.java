/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect165075;
import java.util.Calendar;

/**
 *
 * @author n
 */
public class Cliente {
    private double salario;
    private int anioNacimiento;
    
    public Cliente(double salario, int anioNacimiento) {
        this.salario = salario;
        this.anioNacimiento = anioNacimiento;
    }
    
    public int calcularEdad() {
        Calendar fechaActual = Calendar.getInstance();
        return fechaActual.get(Calendar.YEAR) - this.anioNacimiento;
    }
    
    public double devolverSalario() {
        return this.salario;
    }
}
