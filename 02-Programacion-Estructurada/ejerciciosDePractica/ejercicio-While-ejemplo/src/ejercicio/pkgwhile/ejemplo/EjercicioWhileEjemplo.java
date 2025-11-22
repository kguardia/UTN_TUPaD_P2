/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkgwhile.ejemplo;

import java.util.Scanner;

/**
 *
 * @author Karen
 */
public class EjercicioWhileEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("Ingresá un número positivo: ");
        num = Integer.parseInt(input.nextLine());
        
        if (num > 0) {
            if (num % 2 != 0) {
                num--;
            }
            int cont = num;
            while (cont >= 0) {
                System.out.print(cont + " ");
                cont -= 2;
            }
            
            System.out.println();
        } else {
            System.out.println("El número debía ser positivo");
        }
    }
    
}
