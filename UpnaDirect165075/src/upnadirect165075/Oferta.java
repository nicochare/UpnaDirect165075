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
public class Oferta {
    private double importe;
    private int comision;
    private Aseguradora aseguradora;
    private Bien bien;
    private Cliente cliente;
    
    public Oferta(double importe, int comision, Aseguradora as, Bien b, Cliente c) {
        this.importe = importe;
        this.comision = comision;
        this.aseguradora = as;
        this.bien = b;
        this.cliente = c;
    }
    
    public double devolverImporte() {
        return this.importe;
    }
    
    public float devolverComision() {
        return this.comision;
    }
    
    public Aseguradora devolverAseguradora() {
        return this.aseguradora;
    }
    
    public Bien devolverBien() {
        return this.bien;
    }
    
    public Cliente devolverCliente() {
        return this.cliente;
    }
}
