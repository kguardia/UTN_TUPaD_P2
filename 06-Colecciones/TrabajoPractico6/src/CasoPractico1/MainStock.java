
package CasoPractico1;

import java.util.ArrayList;

public class MainStock {
    
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        inventario.agregarProducto(new Producto("A001", "Leche 1L", 1500.0, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("E002", "Smart TV 50", 250000.0, 10, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("R003", "Remera Algodón", 2500.0, 80, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("H004", "Juego Sábanas", 4000.0, 30, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("A005", "Pan Integral", 1200.0, 60, CategoriaProducto.ALIMENTOS));
        
        System.out.println("1. Productos agregados.");

        // 2. Listar todos los productos
        inventario.listarProductos();

        // 3. Buscar un producto por ID y mostrar su información.
        System.out.println("\n3. Buscando producto E002:");
        Producto buscado = inventario.buscarProductoPorId("E002");
        if (buscado != null) buscado.mostrarInfo();

        // 4. Filtrar y mostrar productos de categoría ALIMENTOS.
        System.out.println("\n4. Productos de categoría ALIMENTOS:");
        ArrayList<Producto> alimentos = inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        for (Producto p : alimentos) p.mostrarInfo();

        // 5. Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("\n5. Eliminando producto A005...");
        inventario.eliminarProducto("A005");
        inventario.listarProductos(); // Lista los restantes

        // 6. Actualizar el stock de un producto existente.
        inventario.actualizarStock("R003", 95);
        System.out.println("\n6. Stock de R003 actualizado a 95.");
        inventario.buscarProductoPorId("R003").mostrarInfo();

        // 7. Mostrar el total de stock disponible.
        System.out.println("\n7. Stock Total Disponible: " + inventario.obtenerTotalStock());

        // 8. Obtener y mostrar el producto con mayor stock.
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        System.out.println("\n8. Producto con Mayor Stock:");
        if (mayorStock != null) mayorStock.mostrarInfo();

        // 9. Filtrar productos con precios entre $1000 y $3000.
        System.out.println("\n9. Productos con precio entre $1000 y $3000:");
        ArrayList<Producto> filtradosPrecio = inventario.filtrarProductosPorPrecio(1000.0, 3000.0);
        for (Producto p : filtradosPrecio) p.mostrarInfo();

        // 10. Mostrar las categorías disponibles con sus descripciones.
        inventario.mostrarCategoriasDisponibles();
    }
}
