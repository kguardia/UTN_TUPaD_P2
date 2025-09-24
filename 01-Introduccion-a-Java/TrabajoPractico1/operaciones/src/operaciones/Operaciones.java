/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones;

import java.util.Scanner;

/**
 *
 * @author Karen
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declarar tipo de variable
        int a, b, suma, resta, multiplicacion;
        double division;
        
        // Solicitar los datos
        System.out.println("Ingrese un número entero: ");
        a = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese otro número entero: ");
        b = Integer.parseInt(input.nextLine());
        
        //Cálculos
        
        suma = a + b;
        resta = a - b;
        multiplicacion = a * b;
        division = a / b;
        
        //Mostrar resultados
        System.out.println("El resultado de " + a + " + " + b + " = " + suma);
        System.out.println("El resultado de " + a + " - " + b + " = " + resta);
        System.out.println("El resultado de " + a + " * " + b + " = " + multiplicacion);
        System.out.println("El resultado de " + a + " / " + b + " = " + division);
    }
    
}
