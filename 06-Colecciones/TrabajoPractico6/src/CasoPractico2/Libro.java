
package CasoPractico2;



public class Libro {
    
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor; // Relación con Autor

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    // Getters
    public String getIsbn() { return isbn; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public Autor getAutor() { return autor; }

    public void mostrarInfo() { // [cite: 121]
        System.out.print("Título: " + titulo + ", ISBN: " + isbn + ", Año: " + anioPublicacion + " - ");
        autor.mostrarInfo();
        System.out.println();
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor.getNombre() + '}';
    }
}
