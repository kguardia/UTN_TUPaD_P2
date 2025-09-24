/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica08;

import java.util.Scanner;

/**
 *
 * @author Karen
 */
public class Practica08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anioDeNacimiento, anioActual, edadDelUsuario;
        
        anioActual = 2025;
        
        System.out.print("Ingrese su año de nacimiento: ");
        anioDeNacimiento = Integer.parseInt(input.nextLine());
        
        edadDelUsuario = anioActual - anioDeNacimiento;
        
        System.out.println("Su edad es " + edadDelUsuario + " ó " + (edadDelUsuario-1) + " años.");
    }
    
}
