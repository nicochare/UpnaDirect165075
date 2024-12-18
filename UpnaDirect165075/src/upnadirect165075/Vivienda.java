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
public class Vivienda implements Bien {
    private double valor;
    private final double valor_min = 50000;
    
    public Vivienda(double valor) {
        this.valor = valor;
    }
    
    @Override
    public double devolverValor() {
        return this.valor;
    }
    
    @Override
    public void modificarValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public Boolean verificarRango(double valor) {
        return (valor >= this.valor_min);
    }
}
