package ejerciciosTP2;

import java.util.Scanner;

public class ejercicio5 {
    
    public static void main(String[] args) {
        // Declaramos input para leer los datos
        Scanner input = new Scanner(System.in);
            
        // Declaramos num e inicilizamos en 1 para entrar al menos una vez al ciclo
        int num = 1;
        
        // Declaramos sumaPares e inicilizamos en 0 para acumular la sumatoria de los numeros pares 
        int sumaPares = 0;
        
        while(num != 0){
            System.out.println("Ingrese un numero(0 para terminar)");
            num = Integer.parseInt(input.nextLine());
            
            // Si el resto de la division entre el numero y 2 nos da 0 entonces el numero es par
            if(num % 2 == 0){
                sumaPares = sumaPares + num; // Acumulamos la suma de numeros pares
            }
        }
        
        System.out.println("La suma de los numeros pares es: " + sumaPares);
        
    }
}
