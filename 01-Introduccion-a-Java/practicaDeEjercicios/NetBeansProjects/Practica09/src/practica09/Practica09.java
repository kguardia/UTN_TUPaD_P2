/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica09;

import java.util.Scanner;

/**
 *
 * @author Karen
 */
public class Practica09 {
    final static double CANT_JORNADAS_TRABAJADAS = 5.5;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sueldoDiario, sueldoSemanal;
        
        System.out.println("Ingresá tu sueldo diario: ");
        sueldoDiario = Double.parseDouble(input.nextLine());
        
        sueldoSemanal = sueldoDiario * CANT_JORNADAS_TRABAJADAS;
        
        System.out.println("Tu sueldo semanal es de: " + sueldoSemanal);
    }
   
}
