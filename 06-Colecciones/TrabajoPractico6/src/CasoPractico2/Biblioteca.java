
package CasoPractico2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca {
    
    private String nombre;
    private List<Libro> libros; // [cite: 125]

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>(); // Inicialización de la composición 1 a N [cite: 104]
    }

    // Método 1: Agregar Libro (Crea el libro e inicializa la composición)
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) { // [cite: 134]
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
    }

    // Método 2: Listar Libros
    public void listarLibros() { // [cite: 135]
        System.out.println("\n--- Libros en la Biblioteca " + nombre + " ---");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    // Método 3: Buscar Libro por ISBN
    public Libro buscarLibroPorIsbn(String isbn) { // [cite: 136]
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    // Método 4: Eliminar Libro
    public boolean eliminarLibro(String isbn) { // [cite: 136]
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            return this.libros.remove(libro); // La composición implica que si la Biblioteca se va, el Libro también. [cite: 105]
        }
        return false;
    }

    // Método 5: Obtener Cantidad de Libros
    public int obtenerCantidadLibros() { // [cite: 137]
        return this.libros.size();
    }

    // Método 6: Filtrar Libros por Año
    public List<Libro> filtrarLibrosPorAnio(int anio) { // [cite: 138]
        List<Libro> encontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                encontrados.add(libro);
            }
        }
        return encontrados;
    }

    // Método 7: Mostrar Autores Disponibles
    public void mostrarAutoresDisponibles() { // [cite: 138]
        System.out.println("\n--- Autores Disponibles en la Biblioteca ---");
        // Usamos un Set para asegurar que cada autor se muestre solo una vez.
        Set<Autor> autoresUnicos = new HashSet<>();
        for (Libro libro : libros) {
            autoresUnicos.add(libro.getAutor());
        }

        for (Autor autor : autoresUnicos) {
            autor.mostrarInfo();
            System.out.println();
        }
    }
}
