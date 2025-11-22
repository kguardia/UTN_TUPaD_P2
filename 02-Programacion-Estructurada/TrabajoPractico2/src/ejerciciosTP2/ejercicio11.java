package ejerciciosTP2;

import java.util.Scanner;

public class ejercicio11 {
    
    // Declaramos la variable global
    public static final double DESCUENTO_ESPECIAL = 0.10;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto");
        double precio = input.nextDouble();
        
        calcularDescuentoEspecial(precio);
    }
    
    /**
     * Calcula y muestra el descuento especial aplicado a un producto, junto con
     * el precio final.
     *
     * Usa la constante global DESCUENTO_ESPECIAL (10%) para calcular el
     * descuento. Imprime por pantalla: - El monto del descuento aplicado. - El
     * precio final del producto después de aplicar el descuento.
     *
     * @param precio El precio original del producto antes de aplicar el
     * descuento.
     */
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento aplicado es de: " + descuentoAplicado);
        System.out.println("El precio final del producto es: " + precioFinal);
    }
}
