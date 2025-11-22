/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.ciclos.anidados.pkg13;

import java.util.Scanner;

/**
 *
 * @author Karen
 */
public class EjerciciosCiclosAnidados13 {

    final static char CARACTER = 'X';
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ancho, alto;
        
        System.out.print("Ingresá el ancho: ");
        ancho = Integer.parseInt(input.nextLine());
        
        while (ancho <= 0) {
            System.out.print("ERROR. Ingresá el ancho: ");
            ancho = Integer.parseInt(input.nextLine());
        }
        
        System.out.print("Ingresá el alto: ");
        alto = Integer.parseInt(input.nextLine());
        
        while (alto <= 0) {
            System.out.print("ERROR. Ingresá el alto: ");
            alto = Integer.parseInt(input.nextLine());
        }

        for (int i = 1; i <= alto; i++) {
            for (int j = 1; j <= ancho; j++) {
                System.out.print(CARACTER);
            }
            System.out.println();
        }
        
        int suma = 0;
    
        
        for (int c = 9; c >= 1; c-=2) {
            suma += c;
        }
        System.out.println("Resultado: " + suma);
        
    }
}
