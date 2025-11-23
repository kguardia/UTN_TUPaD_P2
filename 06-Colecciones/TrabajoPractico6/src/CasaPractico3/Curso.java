
package CasaPractico3;


public class Curso {
    
    private String codigo;
    private String nombre;
    private Profesor profesor; // Lado 'Uno' de la bidireccional [cite: 187]

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    // Getters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    // Sincronización: Asigna/cambia el profesor y sincroniza el otro lado [cite: 189]
    public void setProfesor(Profesor p) {
        // 1. Quitarse del profesor previo si lo tenía [cite: 190]
        if (this.profesor != null && this.profesor != p) {
            this.profesor.getCursos().remove(this); // Remover de su lista, sin llamar a eliminarCurso
        }

        // 2. Asignar el nuevo profesor
        this.profesor = p;

        // 3. Sincronizar el lado del nuevo profesor (si no es null)
        if (p != null) {
            // Llama a agregarCurso para que el profesor se agregue y valide (sin crear un loop infinito)
            if (!p.getCursos().contains(this)) {
                p.getCursos().add(this);
            }
        }
    }

    public void mostrarInfo() { // [cite: 191]
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.println("Curso: " + nombre + " (" + codigo + ")");
        System.out.println("  Profesor responsable: " + nombreProfesor);
    }
}
