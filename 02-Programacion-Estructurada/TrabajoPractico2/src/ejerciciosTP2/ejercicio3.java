package ejerciciosTP2;

import java.util.Scanner;

public class ejercicio3 {
    
    public static void main(String[] args) {
        // Declaramos input para leer los datos
        Scanner input = new Scanner(System.in);
        
        // Declaramos variable para alojar la edad ingresada por el usuario y una variable para alojar la clasificacion de su etapa de vida.
        int edad; 
        String etapaVida = "";
        
        // Le pedimos al usuario que ingrese su edad.
        System.out.println("Ingrese su edad:");
        edad = Integer.parseInt(input.nextLine());
        
        if(edad < 12) {
            etapaVida = "Niño";
        } else if (edad >= 12 && edad <= 17) {
            etapaVida = "Adolescente";
        } else if (edad >= 18 && edad <= 59) {
            etapaVida = "Adulto";
        } else if (edad >= 60 ) {
            etapaVida = "Adulto mayor";
        } 
            
        System.out.println("Eres un " + etapaVida);
    }
}
