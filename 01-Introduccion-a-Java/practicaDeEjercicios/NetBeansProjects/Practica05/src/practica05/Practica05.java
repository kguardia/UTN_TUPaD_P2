/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica05;

import java.util.Scanner;

/**
 *
 * @author Karen
 */
public class Practica05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        double estatura;
        
        System.out.print("Ingresá tu edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresá tu estatura: ");
        estatura = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingresá tu nombre: ");
        nombre = input.nextLine();
        
        System.out.println("Tu nombre es " + nombre);
        System.out.println("Tu edad es " + edad);
        System.out.println("Tu estatura es " + estatura);
    }
    
}
