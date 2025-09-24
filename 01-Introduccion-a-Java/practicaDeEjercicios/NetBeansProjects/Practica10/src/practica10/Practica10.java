/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica10;

import java.util.Scanner;

public class Practica10 {

    final static int CANT_PASADAS = 3;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ancho, largo, superficie, perimetro, cantAlambre;
        double precioM2, valorTerreno;
        
        System.out.print("Ingrese el ancho del terreno: ");
        ancho = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el largo del terreno: ");
        largo = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el precio del M2: ");
        precioM2 = Double.parseDouble(input.nextLine());
        
        // Cálculos
        superficie = ancho * largo;
        valorTerreno = superficie * precioM2;
        
        perimetro = 2 * ancho + 2 * largo;
        cantAlambre = perimetro * CANT_PASADAS;
        
        // Resultados
        System.out.println("El valor del terreno es de $" + valorTerreno + " USD.");
        System.out.println("La cantidad de alambre para " + CANT_PASADAS + " pasadas es de " + cantAlambre + " metros.");
    }
    
}
