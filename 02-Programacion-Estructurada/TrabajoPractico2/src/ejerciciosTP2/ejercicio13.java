package ejerciciosTP2;

public class ejercicio13 {
    
    public static void main(String[] args) {
        // Declaramos e inicializamos el array
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // Mostramos los precios originales
        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);
        
        // Modificamos el precio de la posicion 2
        precios[2] = 129.99;

        // Mostramos los precios modificados
        System.out.println("Precios modificados:");
        mostrarPreciosRecursivo(precios, 0);
    }
    
    /**
     * Muestra los precios de un arreglo de precios de manera recursiva.
     *
     * Esta función imprime los precios contenidos en el arreglo `precios`, uno
     * por uno, en la consola. La recursividad se utiliza para iterar sobre cada
     * elemento del arreglo.
     *
     * @param precios Un arreglo de tipo `double` que contiene los precios de
     * los productos.
     * @param indice Un índice entero que indica la posición actual en el
     * arreglo. Debe ser 0 cuando se llama a la función por primera vez.
     */
    public static void mostrarPreciosRecursivo(double[] precios, int indice) {
        // Si el índice es menor que la longitud del arreglo, continúa el proceso.
        if (indice < precios.length) {
            // Imprime el precio en la posición actual del arreglo.
            System.out.println("Precio: $" + precios[indice]);
            // Llama recursivamente a la función para imprimir el siguiente precio.
            mostrarPreciosRecursivo(precios, indice + 1);
        }
    }
}
