/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica01;

/**
 *
 * @author Karen
 */
public class Practica01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("¡Hola, Java!");
        System.out.print("sin salto");
        System.out.println("con salto");
        int edad = 18;
        double precio = 99.987;
        System.out.printf("Edad: %d, precio: %.2f%n", edad, precio);
        // %d entero, %f decimal (%.2f → 2 decimales), %s texto, %n salto portable
        // Ejemplo de alineación:
        System.out.printf("%-10s %8.2f%n", "Total:", 1234.5);
    }
    
}
