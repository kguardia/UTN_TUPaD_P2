/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package  ar.kguardia.ejemplos;

import java.util.Scanner;

/**
 *
 * @author Karen
 */
public class Utils {
    static int LeerEnteroEntre(String mensaje, int min, int max) {
        Scanner input = new Scanner(System.in);
        System.out.print(mensaje + ": ");
        int x = Integer.parseInt(input.nextLine());
        while (x < min || x > max) {
            System.out.print("ERROR. " + mensaje + ": ");
            x = Integer.parseInt(input.nextLine());
        }
        return x;
    }
    
    /**
     * Retorna true si el primer argumento es múltiplo del segundo argumento
     * @param a Un número entero que será dividido por <code>b</code>
     * @param b Un número entero que dividirá a <code>a</code>
     * @return  true si <code>a</code> es múltiplo de <code>b</code>
     */
    static boolean esMultiplo(int a, int b) {
        return obtenerResto(a, b) == 0;
    }
    
    static int obtenerResto(int num1, int num2) {
        return num1 - num2 * (num1 / num2);
    }
}
