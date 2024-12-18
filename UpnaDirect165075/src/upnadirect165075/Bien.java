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
public class Bien {
    private double valor;
    
    public Bien(double valor) {
        this.valor = valor;
    }
    
    public double devolver_valor() {
        return this.valor;
    }
    
    private void modificar_valor(float valor) {
        this.valor = valor;
    }
}
