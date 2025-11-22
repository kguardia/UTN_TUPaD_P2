package ejerciciosTP2;

import java.util.Scanner;

public class ejercicio1 {
    
    public static void main(String[] args) {
        // Declaramos input para leer los datos
        Scanner input = new Scanner(System.in);
        int anio; // Declaramos la variable anio, es donde vamos a guardar el valor ingresado por el usuario
        
        // Le pedimos el valor al usuario
        System.out.println("Ingrese un año para verficar si es bisiesto");
        anio = Integer.parseInt(input.nextLine());
        
        // Verificamos en el condicional que sea divisible por 4 y no por 100 a excepcion que el año tambien sea divisible por 400.
        if((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)){
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
            
    }
}
