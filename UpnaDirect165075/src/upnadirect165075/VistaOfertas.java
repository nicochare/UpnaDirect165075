/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect165075;

import java.util.Scanner;

/**
 *
 * @author n
 */
public class VistaOfertas {
    private final Scanner scanner = new Scanner(System.in);
    
    public int pedirFechaNacimiento() {
        System.out.println("Introduce el año de nacimiento del cliente: ");
        return scanner.nextInt();
    }
    
    public Double pedirSalarioCliente() {
        System.out.println("Introduce el salario del cliente: ");
        return scanner.nextDouble();
    }
    
    public int pedirTipoBien() {
        System.out.println("Introduce el tipo del bien");
        System.out.println("    - 1: Vehiculo");
        System.out.println("    - 2: Vivienda");
        return scanner.nextInt();
    }
    
    public double pedirValorBien(int tipoBien) {
        if (tipoBien == 1) {
            System.out.println("Introduce el valor del bien (1-50000): ");
        } else {
            System.out.println("Introduce el valor del bien (>=50000): ");
        }
        return scanner.nextDouble();
    }
    
    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
