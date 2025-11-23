
package CasoPractico1;

import java.util.ArrayList;

public class Inventario {
    
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Método 1: Agregar Producto
    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    // Método 2: Listar Productos
    public void listarProductos() {
        System.out.println("\n--- Listado Completo de Productos ---");
        for (Producto p : productos) { // Usa ciclo for-each [cite: 9]
            p.mostrarInfo();
        }
    }

    // Método 3: Buscar Producto por ID
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    // Método 4: Eliminar Producto por ID
    public boolean eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            return this.productos.remove(p);
        }
        return false;
    }

    // Método 5: Actualizar Stock
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }

    // Método 6: Filtrar por Categoría
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> encontrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                encontrados.add(p);
            }
        }
        return encontrados;
    }

    // Método 7: Obtener Stock Total
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    // Método 8: Obtener Producto con Mayor Stock
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        Producto mayorStock = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayorStock.getCantidad()) {
                mayorStock = p;
            }
        }
        return mayorStock;
    }

    // Método 9: Filtrar Productos por Precio (Rango)
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> encontrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                encontrados.add(p);
            }
        }
        return encontrados;
    }
    
    // Método 10: Mostrar Categorías Disponibles (con descripciones)
    public void mostrarCategoriasDisponibles() {
        System.out.println("\n--- Categorías de Productos Disponibles ---");
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("  - " + categoria.name() + ": " + categoria.getDescripcion());
        }
    }
}
