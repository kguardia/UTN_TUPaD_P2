package ejerciciosTp3;

public class Libro {
    
    // Declaramos atributos privados
    private String titulo; 
    private String autor;
    private int anioPublicacion; 

    // Declaramos getters y setters
    public String getTitulo() { 
        return titulo; 
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo; 
    }

    public String getAutor() { 
        return autor; 
    }

    public void setAutor(String autor) { 
        this.autor = autor; 
    }

    public int getAnioPublicacion() { 
        return anioPublicacion; 
    }

    public void setAnioPublicacion(int anioPublicacion) { 
        int anioActual = 2025; 
        if (anioPublicacion <= anioActual) { 
            this.anioPublicacion = anioPublicacion; 
        }
    }

    // Metodo para mostrar info del libro 
    public void mostrarInfo() { 
        System.out.println("Titulo: " + this.titulo + "\n Autor: " + this.autor + "\n Año de publicacion: " + this.anioPublicacion);
    }
}
