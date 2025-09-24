/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica04;

import java.util.Scanner;

/**
 *
 * @author Karen
 */
public class Practica04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        System.out.println("Ingresá tu edad: ");
        edad = input.nextInt();
        String nombre;
        nombre = "Karen";
        System.out.println("Hola " + nombre);
        System.out.println("Tu edad es " + edad + " años.");
    }
    
}
