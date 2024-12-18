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
public class Vehiculo implements Bien {
    private double valor;
    private final double valor_min = 1;
    private final double valor_max = 50000;
    
    public Vehiculo(double valor) {
        this.valor = valor;
    }
    
    @Override
    public double devolver_valor() {
        return this.valor;
    }
    
    @Override
    public void modificar_valor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public Boolean verificar_rango(double valor) {
        return (valor >= this.valor_min && valor <= this.valor_max);
    }
}
