/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgvoid.java;

/**
 *
 * @author Karen
 */
public class VoidJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        imprimirSimbolo('x', 5);
        imprimirSimbolo('@', 8);
        imprimirSimbolo('3', 3);
        
        String s = sucesionDeSimbolos('#', 7);
    }
    
    static void imprimirSimbolo(char simbolo, int veces) {
        System.out.println(sucesionDeSimbolos(simbolo,veces));
    }
    
    static String sucesionDeSimbolos(char simbolo, int veces) {
        String sucesion = "";
        for (int i = 0; i < veces; i++) {
            sucesion += simbolo;
        }
        return sucesion;
    }
    
}
