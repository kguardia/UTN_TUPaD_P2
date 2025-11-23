
package CasaPractico3;

import java.util.ArrayList;
import java.util.List;

public class MainUniversidad {
    
    public static void main(String[] args) {
        Universidad utn = new Universidad("UTN - Programación");

        // 1. Crear al menos 3 profesores y 5 cursos.
        Profesor p1 = new Profesor("P01", "Dr. Pérez", "Backend Java");
        Profesor p2 = new Profesor("P02", "Ing. García", "Base de Datos");
        Profesor p3 = new Profesor("P03", "Lic. Sánchez", "Frontend Web");

        Curso c1 = new Curso("C101", "Programación Orientada a Objetos");
        Curso c2 = new Curso("C102", "Estructuras de Datos");
        Curso c3 = new Curso("C201", "Desarrollo Web Avanzado");
        Curso c4 = new Curso("C202", "SQL y NoSQL");
        Curso c5 = new Curso("C301", "Testing y Calidad");

        // 2. Agregar profesores y cursos a la universidad.
        utn.agregarProfesor(p1);
        utn.agregarProfesor(p2);
        utn.agregarProfesor(p3);
        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);
        System.out.println("1-2. Profesores y Cursos creados y agregados.");
        
        // 3. Asignar profesores a cursos
        utn.asignarProfesorACurso("C101", "P01"); // Pérez -> C101
        utn.asignarProfesorACurso("C102", "P01"); // Pérez -> C102
        utn.asignarProfesorACurso("C202", "P02"); // García -> C202
        utn.asignarProfesorACurso("C301", "P03"); // Sánchez -> C301
        System.out.println("3. Asignaciones iniciales realizadas.");

        // 4. Listar cursos con su profesor y profesores con sus cursos.
        utn.listarCursos();
        utn.listarProfesores();

        // 5. Cambiar el profesor de un curso y verificar sincronización.
        System.out.println("\n--- 5. Cambio de Profesor (C102) ---");
        // Cambiamos C102 de P01 (Pérez) a P03 (Sánchez)
        utn.asignarProfesorACurso("C102", "P03"); // C102 cambia a Sánchez
        
        System.out.println("Profesor P01 (Pérez) después del cambio:");
        p1.listarCursos(); // Debe haber perdido C102
        System.out.println("\nProfesor P03 (Sánchez) después del cambio:");
        p3.listarCursos(); // Debe haber ganado C102

        // 6. Remover un curso y confirmar sincronización.
        System.out.println("\n--- 6. Eliminando Curso C202 (de P02 García) ---");
        utn.eliminarCurso("C202");
        
        System.out.println("Profesor P02 (García) después de la eliminación:");
        p2.listarCursos(); // Debe estar vacío

        // 7. Remover un profesor y dejar profesor = null en cursos.
        System.out.println("\n--- 7. Eliminando Profesor P03 (Sánchez) ---");
        utn.eliminarProfesor("P03"); // P03 tenía C102 y C301
        
        System.out.println("Cursos restantes en la Universidad:");
        utn.listarCursos(); // C102 y C301 deben decir "Sin asignar"
        
        // 8. Mostrar un reporte: cantidad de cursos por profesor.
        utn.reporteCursosPorProfesor();
    }
}
