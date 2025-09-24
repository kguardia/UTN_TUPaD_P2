/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica02;
import java.util.Scanner;
import java.util.Locale;
public class Practica02 {
 private static final double CIEN = 100.0;
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in).useLocale(Locale.US);
 System.out.print("Precio base (double, ej. 199.99): ");
 double precioBase = Double.parseDouble(sc.nextLine().trim());
 System.out.print("Descuento en % (int, ej. 15): ");
 int descuento = Integer.parseInt(sc.nextLine().trim());
 double precioConDesc = precioBase * (1 - descuento / CIEN);
 int precioEntero = (int) precioConDesc; // demostrativo: trunca decimales
 System.out.printf("Precio final: %.2f (entero: %d)%n",
precioConDesc, precioEntero);
 }
}