/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad.simple;

/**
 *
 * @author Karen
 */
public class RecursividadSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fact(5));
    }
    
    static int factorial(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f *= i;
        }
        return f;
    }
    
    static int fact(int x) {
        return x == 0 ? 1 : x * fact(x-1);
    }
}
