/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solicitud.de.datos;

import java.util.Scanner;

/**
 *
 * @author Karen
 */
public class SolicitudDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declaración del tipo de variable
        String nombre;
        int edad;
        
        //Solicitud de información
        System.out.print("Ingresá tu nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingresá tu edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        //Imprimir los resultaos
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Y tu edad es: " + edad + " años.");
    }
    
}
