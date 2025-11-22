/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclo.pkgdo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Karen
 */
public class CicloDoWhile {

    static final int CORTE = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, cont = 0;
        
        do {
            System.out.print("Ingresá un número (" + CORTE + " para cortar): ");
            num = Integer.parseInt(input.nextLine());
            cont++;
        } while (num != CORTE);
        
        System.out.print("Cantidad de valores leídos: " + cont);
    }
    
}
