/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package correccion.error;

import java.util.Scanner;

/**
 *
 * @author Karen
 */
public class CorreccionError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = input.nextLine(); // CORREGIDO
        System.out.println("Hola, " + nombre);
    }
    
}
