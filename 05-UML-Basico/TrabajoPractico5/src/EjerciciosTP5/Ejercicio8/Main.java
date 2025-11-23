
package EjerciciosTP5.Ejercicio8;


public class Main {
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Julián Vega", "julian@mail.com");
        Documento doc = new Documento("Contrato", "Contenido del contrato...", "abc123", "2025-08-01", usuario);

        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Usuario de la firma: " + doc.getFirma().getUsuario().getNombre());
        System.out.println("Hash de firma: " + doc.getFirma().getCodigoHash());

    }
    
}
    

