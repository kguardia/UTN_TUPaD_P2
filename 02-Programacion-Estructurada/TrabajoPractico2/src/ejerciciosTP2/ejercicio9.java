package ejerciciosTP2;

import java.util.Scanner;

public class ejercicio9 {
    
    public static void main(String[] args) {
        // Declaramos input para leer los datos
        Scanner input = new Scanner(System.in);
        
        // Declaramos variables para guardar los datos que pedimos al usuario
        double peso, precioProducto;
        String zona;
        
        // Le solicitamos el precio del producto al usuario
        System.out.println("Ingrese el precio del producto");
        precioProducto = input.nextDouble();
        
        
        // Le solicitamos el peso del paquete al usuario
        System.out.println("Ingrese el peso del paquete");
        peso = input.nextDouble();
        input.nextLine(); // Consumimos el Enter que quedó pendiente
        
        // Le solicitamos la zona de envio al usuario
        System.out.println("Ingrese la zona de envio(Nacional/Internacional)");
        zona = input.nextLine();
        
        // Llamamos al metodo para calcular costo de envio y alojamos el retorno en una variable
        double costoEnvio = calcularCostoEnvio(peso, zona);
        
        // Llamammos al metodo para calcular el precio total de la compra y alojamos el retorno en una variable
        double precioFinal = calcularTotalCompra(precioProducto, costoEnvio);
        
        // Mostramos los resultados por pantalla
        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + precioFinal);
    }
    
    /**
     * Calcula el costo de envío en función del peso y la zona de destino.
     *
     * @param peso Peso del paquete en kilogramos.
     * @param zona Zona de envío: puede ser "Nacional" o "Internacional" (no
     * distingue mayúsculas).
     * @return El costo de envío calculado: $5 por kilo para envíos nacionales,
     * $10 por kilo para internacionales.
     */
    public static double calcularCostoEnvio(double peso, String zona){
        double costoEnvio = 0;
        if(zona.equalsIgnoreCase("Nacional")){
            costoEnvio = peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")){
            costoEnvio = peso * 10;
        }
        
        return costoEnvio;
    }
    
    /**
     * Calcula el total de la compra sumando el precio del producto y el costo
     * de envío.
     *
     * @param precioProducto Precio base del producto sin costos adicionales.
     * @param costoEnvio Costo de envío previamente calculado.
     * @return El monto total a pagar por la compra.
     */
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }
}
