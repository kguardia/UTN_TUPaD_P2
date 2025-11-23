
package EjerciciosTP5.Ejercicio7;


public class Main {
    
    public static void main(String[] args) {
        Conductor conductor = new Conductor("Elena Suárez", "LIC12345");
        Motor motor = new Motor("Diesel", "MTR0001");
        Vehiculo vehiculo = new Vehiculo("AB123CD", "Toyota Hilux", motor);
        conductor.setVehiculo(vehiculo);

        System.out.println("Conductor: " + vehiculo.getConductor().getNombre());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo());

    }
    
}
