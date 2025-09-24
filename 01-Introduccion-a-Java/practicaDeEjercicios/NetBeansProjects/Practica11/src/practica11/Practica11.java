/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica11;

import java.util.Scanner;

/**
 *
 * @author Karen
 */
public class Practica11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total, aprobados;
        double porcAprobados;
        
        System.out.print("Cantidad total de alumnos: ");
        total = Integer.parseInt(input.nextLine());
        
        System.out.print("Cantidad de aprobados: ");
        aprobados = Integer.parseInt(input.nextLine());
        
        porcAprobados = ((double) aprobados / total) * 100; // Usando casting
        
        System.out.println("Aprobó el " + porcAprobados + "% de alumnos.");
    }
    
}
