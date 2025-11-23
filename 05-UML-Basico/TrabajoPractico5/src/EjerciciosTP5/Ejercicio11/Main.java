
package EjerciciosTP5.Ejercicio11;


public class Main {
    
    public static void main(String[] args) {
        Artista artista = new Artista("Shakira", "Pop");
        Cancion cancion = new Cancion("Antología", artista);
        Reproductor r = new Reproductor();
        r.reproducir(cancion); // Dependencia de uso

    }
}
