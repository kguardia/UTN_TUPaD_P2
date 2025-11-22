package ejerciciosTP2;

import java.util.Scanner;

public class ejercicio10 {
    
    public static void main(String[] args) {
        // Declaramos input para leer los datos
        Scanner input = new Scanner(System.in);
        
        // Declaramos las variables para alojar los datos ingresados por el usuario
        int stockActual, cantidadVendida, cantidadRecibida;
        
        System.out.println("Ingrese el stock actual del producto");
        stockActual = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la cantidad vendida");
        cantidadVendida = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la cantidad recibida");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        
        // Llamamos al metodo actualizarStock, y alojamos el valor de retorno en una variable
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
    
    /**
     * Actualiza el stock disponible de un producto según la cantidad vendida y
     * la cantidad recibida.
     *
     * @param stockActual Cantidad actual en stock antes de la operación.
     * @param cantidadVendida Cantidad de unidades vendidas (se restan del
     * stock).
     * @param cantidadRecibida Cantidad de unidades recibidas o repuestas (se
     * suman al stock).
     * @return El nuevo stock disponible después de aplicar ventas y
     * reposiciones.
     */
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock = (stockActual - cantidadVendida) + cantidadRecibida;
        return nuevoStock;
    }
}
