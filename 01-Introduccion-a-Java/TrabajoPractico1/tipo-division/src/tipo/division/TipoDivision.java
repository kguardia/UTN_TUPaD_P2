/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipo.division;

import java.util.Scanner;

/**
 *
 * @author Karen
 */
public class TipoDivision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        double resultadoDecimal;
        int resultadoEntero;
        
        // Pedir los números
        System.out.print("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextInt();
        
        // División entera
        resultadoEntero = num1 / num2;
        // División con decimales (casting)
        resultadoDecimal = (double) num1 / num2;
        
        // Mostrar resultados
        System.out.println("Resultado de la división entera: " + resultadoEntero);
        System.out.println("Resultado de la división con decimales: " + resultadoDecimal);
        
    }
    
}
