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
public interface Aseguradora {
    double calcularImporte(Bien b, Cliente c);
    int calcularComision(double importe);
    String devolverNombre();
}
