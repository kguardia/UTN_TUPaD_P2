
package CasaPractico3;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Universidad {
    
    private String nombre;
    private List<Profesor> profesores; // [cite: 203]
    private List<Curso> cursos; // [cite: 204]

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    // Auxiliares de búsqueda
    public Profesor buscarProfesorPorId(String id) { // [cite: 210]
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) { // [cite: 211]
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) return c;
        }
        return null;
    }

    // Método 1: Agregar Profesor
    public void agregarProfesor(Profesor p) { // [cite: 206]
        if (buscarProfesorPorId(p.getId()) == null) {
            this.profesores.add(p);
        }
    }

    // Método 2: Agregar Curso
    public void agregarCurso(Curso c) { // [cite: 207]
        if (buscarCursoPorCodigo(c.getCodigo()) == null) {
            this.cursos.add(c);
        }
    }

    // Método 3: Asignar Profesor a Curso (Usa el setProfesor del curso para la sincronización)
    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) { // [cite: 208]
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor); // Llama al método que sincroniza ambos lados [cite: 208]
            return true;
        }
        return false;
    }

    // Método 4: Listar Profesores
    public void listarProfesores() { // [cite: 209]
        System.out.println("\n--- Profesores en " + nombre + " ---");
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    // Método 5: Listar Cursos
    public void listarCursos() { // [cite: 209]
        System.out.println("\n--- Cursos en " + nombre + " ---");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    // Método 6: Eliminar Curso (Debe romper la relación)
    public boolean eliminarCurso(String codigo) { // [cite: 212]
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // Romper la relación con el profesor
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso); // Esto sincroniza el lado del profesor [cite: 212]
            }
            return this.cursos.remove(curso);
        }
        return false;
    }

    // Método 7: Eliminar Profesor (Debe dejar null los cursos que dictaba)
    public boolean eliminarProfesor(String id) { // [cite: 213]
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // Dejar null los cursos que dictaba (usamos una copia de la lista para evitar ConcurrentModificationException)
            List<Curso> cursosACambiar = new ArrayList<>(profesor.getCursos());
            for (Curso c : cursosACambiar) {
                c.setProfesor(null); // Sincroniza y quita la referencia del profesor [cite: 213]
            }
            return this.profesores.remove(profesor);
        }
        return false;
    }

    // Método 8: Reporte - Cantidad de cursos por profesor
    public void reporteCursosPorProfesor() { // [cite: 223]
        System.out.println("\n--- Reporte: Cantidad de Cursos por Profesor ---");
        for (Profesor p : profesores) {
            System.out.println("- " + p.getNombre() + ": " + p.getCursos().size() + " cursos.");
        }
    }
}
