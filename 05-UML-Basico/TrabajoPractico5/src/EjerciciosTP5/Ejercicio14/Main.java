
package EjerciciosTP5.Ejercicio14;

public class Main {
    
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Promo institucional", 3);
        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", proyecto); // dependencia de creación

    }
}
