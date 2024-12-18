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
    
    public String pedir_fecha_nacimiento() {
        System.out.println("Introduce el año de nacimiento del cliente: ");
        String fnac = scanner.nextLine();
        return fnac;
    }
    
    public Double pedir_salario_cliente() {
        System.out.println("Introduce el salario del cliente: ");
        Double salario = scanner.nextDouble();
        return salario;
    }
    
    public int pedir_tipo_bien() {
        System.out.println("Introduce el tipo del bien");
        System.out.println("    - 1: Vehiculo");
        System.out.println("    - 2: Vivienda");
        int tipo = scanner.nextInt();
        return tipo;
    }
    
    public double pedir_valor_bien(int tipo_bien) {
        if (tipo_bien == 1) {
            System.out.println("Introduce el valor del bien (1-50000): ");
        } else {
            System.out.println("Introduce el valor del bien (>=50000): ");
        }
        Double valor = scanner.nextDouble();
        return valor;
    }
    
    public void mostrar_mensaje(String msg) {
        System.out.println(msg);
    }
}
