/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.de.ejemplos;

import java.util.Scanner;

/**
 *
 * @author Karen
 */
public class CompararStrings {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresá tu nombre: ");
        String nombreDePersona = input.nextLine();
        
        String nombreEsperado = "Juan";
        
        System.out.println(nombreDePersona.equalsIgnoreCase(nombreEsperado));
    }
    
}
