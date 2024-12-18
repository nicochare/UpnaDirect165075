/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect165075;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author n
 */
public class Cliente {
    private float salario;
    private Date fecha_nacimiento;
    
    public Cliente(float salario, Date fecha) {
        this.salario = salario;
        this.fecha_nacimiento = fecha;
    }
    
    public int calcular_edad() {
        Calendar fechaActual = Calendar.getInstance();
        
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.setTime(this.fecha_nacimiento);

        int edad = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        
        return edad;
    }
    
    public float devolver_salario() {
        return this.salario;
    }
}
