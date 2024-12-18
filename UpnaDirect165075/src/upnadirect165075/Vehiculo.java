/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect165075;

/**
 *
 * @author n
 */
public class Vehiculo extends Bien {
    private final double valor_min = 1;
    private final double valor_max = 50000;
    
    public Vehiculo(double valor) {
        super(valor);
    }
    
    public Boolean verificar_rango(double valor) {
        return (valor >= this.valor_min && valor <= this.valor_max);
    }
}
