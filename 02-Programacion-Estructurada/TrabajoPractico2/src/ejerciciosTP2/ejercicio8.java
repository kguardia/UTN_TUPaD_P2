package ejerciciosTP2;

import java.util.Scanner;

public class ejercicio8 {
    
    public static void main(String[] args) {
        // Declaramos input para leer los datos
        Scanner input = new Scanner(System.in);
        
        // Declaramos la varibales para guardar los datos ingresados por el usuario
        double precio, impuesto, descuento;
        
        // Le pedimos al usuario el precio del producto
        System.out.println("Ingrese el precio base del producto:");
        precio = input.nextDouble();
        
        // Le pedimos al usuario el porcentaje de impuesto
        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%):");
        impuesto = input.nextDouble();
        
        // Le pedimos al usuario el porcentaje de descuento
        System.out.println("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%):");
        descuento = input.nextDouble();
        
        // Alojamos el retorno del metodo en una variable
        double precioFinal = calcularPrecioFinal(precio, impuesto, descuento);
        
        System.out.println("El precio final del producto es: $" + precioFinal);
    }
    
    /**
     * Calcula el precio final de un producto aplicando un impuesto y un descuento.
     *
     * @param precioBase El precio base del producto (sin impuesto ni descuento).
     * @param impuesto El porcentaje de impuesto a aplicar (por ejemplo, 21 para 21%).
     * @param descuento El porcentaje de descuento a aplicar (por ejemplo, 15 para 15%).
     * @return El precio final del producto con el impuesto sumado y el descuento restado.
    */
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
        double precioFinal = precioBase + ((precioBase * impuesto)/100) - ((precioBase * descuento)/100);
        return precioFinal;
    }
}
