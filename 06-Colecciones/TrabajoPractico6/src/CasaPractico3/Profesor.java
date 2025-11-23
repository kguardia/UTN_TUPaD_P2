
package CasaPractico3;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos; // Lado 'Muchos' de la bidireccional [cite: 176]

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public List<Curso> getCursos() { return cursos; }

    // Sincronización: Agrega curso y sincroniza el lado del Curso [cite: 179]
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
        // Sincronizar: Llama a setProfesor, pero sin desvincular (el setProfesor se encarga de eso)
        if (c.getProfesor() != this) {
            c.setProfesor(this);
        }
    }

    // Sincronización: Elimina curso y sincroniza el lado del Curso [cite: 180]
    public void eliminarCurso(Curso c) {
        if (cursos.remove(c)) {
            // Sincronizar: Si el curso eliminado me tenía como profesor, debe dejarlo en null.
            if (c.getProfesor() == this) {
                c.setProfesor(null); // Esto también debe sincronizar el lado del curso
            }
        }
    }

    // Muestra códigos y nombres [cite: 181]
    public void listarCursos() {
        System.out.println("  Cursos dictados por " + nombre + " (" + cursos.size() + " cursos):");
        for (Curso c : cursos) {
            System.out.println("    - [" + c.getCodigo() + "] " + c.getNombre());
        }
    }

    public void mostrarInfo() { // [cite: 182]
        System.out.println("Profesor: " + nombre + " (ID: " + id + ", Especialidad: " + especialidad + ")");
        System.out.println("  Cantidad de cursos a cargo: " + cursos.size());
    }
}
