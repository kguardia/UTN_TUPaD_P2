package ejerciciosTP2;

import java.util.Scanner;

public class ejercicio6 {
 
    public static void main(String[] args) {
        // Declaramos input para leer los datos
        Scanner input = new Scanner(System.in);
           
        // Declaramos e iniciliamos contadores en 0, y declaramos num para alojar el numero del usuario
        int contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0, num;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el numero " + i + ": ");
            num = Integer.parseInt(input.nextLine());
            
            // Verificamos si es igual a 0, menor a 0 o mayor a 0
            if(num > 0) {
                contadorPositivos++; 
            } else if (num < 0) {
                contadorNegativos++;
            } else if (num == 0){
                contadorCeros++;
            }
        }
        
        System.out.println("Resultados");
        System.out.print("Positivos: " + contadorPositivos + "\n");
        System.out.print("Negativos: " + contadorNegativos + "\n");
        System.out.print("Ceros: " + contadorCeros);
        
    }
}
