
package EjerciciosTP5.Ejercicio9;


public class Main {
    
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Andrea Flores", "OSDE");
        Profesional profesional = new Profesional("Dr. Carlos Soto", "Cardiología");
        CitaMedica cita = new CitaMedica("2025-10-15", "10:30");
        cita.setProfesional(profesional);
        cita.setPaciente(paciente);
        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());

    }
}
