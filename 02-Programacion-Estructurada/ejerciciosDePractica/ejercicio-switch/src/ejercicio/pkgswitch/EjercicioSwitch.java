/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkgswitch;

import java.util.Scanner;

/**
 *
 * @author Karen
 */
public class EjercicioSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        char simbolo;
        
        System.out.println("Ingresá número 1: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresá número 2: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresá una operación: ");
        
        System.out.println("[+] Sumar A + B");
        System.out.println("[-] Restar A - B");
        System.out.println("[*] Multiplicar A * B");
        System.out.println("[/] Dividir A / B");
        System.out.print("Ingresá una operación: ");
        simbolo = input.nextLine().charAt(0);
        
        switch (simbolo) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 'x':
            case 'X':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + ((double)num1 / num2));
                } else {
                    System.out.println("No se puede dividir por 0.");
                }
                break;
            default:
                System.out.println("Operación inválida."); 
        }
    }
    
}
