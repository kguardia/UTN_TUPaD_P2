package ejerciciosTP4;

import java.util.Objects;

public class Empleado {
    
    // ----------------------------------------------------
    // Atributos de Instancia (Encapsulamiento) 
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo Estático (Variable de Clase)
    // Se inicializa en 0 y se incrementa en cada constructor.
    private static int totalEmpleados = 0;
    private static final double SALARIO_BASE_POR_DEFECTO = 30000.00;
    private static int siguienteId = 1; // Para ids automáticos

    // ----------------------------------------------------
    // 2. Constructores Sobrecargados 

    /**
     * Constructor 1: Recibe todos los atributos como parámetros.
     * Uso de 'this' para distinguir atributos y parámetros.
     */
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // Incrementa el contador global 
        siguienteId = Math.max(siguienteId, id + 1); // Asegura que el ID automático siga después del más alto
    }

    /**
     * Constructor 2: Recibe solo nombre y puesto.
     * Asigna ID automático y salario por defecto.
     */
    public Empleado(String nombre, String puesto) {
        this.id = siguienteId++; // Asigna ID automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = SALARIO_BASE_POR_DEFECTO; // Salario por defecto
        totalEmpleados++; // Incrementa el contador global 
    }

    // ----------------------------------------------------
    // 3. Métodos Sobrecargados actualizarSalario 

    /**
     * Método sobrecargado 1: Actualiza salario con un porcentaje de aumento.
     */
    public void actualizarSalario(double porcentajeAumento) {
        if (porcentajeAumento > 0) {
            double aumento = this.salario * (porcentajeAumento / 100.0);
            this.salario += aumento;
            System.out.printf("✅ Salario de %s actualizado. Aumento de %.2f%% (%.2f). Nuevo salario: %.2f%n",
                    this.nombre, porcentajeAumento, aumento, this.salario);
        } else {
            System.out.println("❌ El porcentaje de aumento debe ser positivo.");
        }
    }

    /**
     * Método sobrecargado 2: Actualiza salario con una cantidad fija a aumentar.
     */
    public void actualizarSalario(int cantidadFija) {
        if (cantidadFija > 0) {
            this.salario += cantidadFija;
            System.out.printf("✅ Salario de %s actualizado. Aumento fijo de %d. Nuevo salario: %.2f%n",
                    this.nombre, cantidadFija, this.salario);
        } else {
            System.out.println("❌ La cantidad fija debe ser positiva.");
        }
    }

    // ----------------------------------------------------
    // 4. Método toString() 

    /**
     * Sobrescribe toString() para mostrar el estado del objeto de forma legible[cite: 43].
     */
    @Override
    public String toString() {
        return String.format("[ID: %d] %s, Puesto: %s, Salario: %.2f",
                this.id, this.nombre, this.puesto, this.salario);
    }

    // ----------------------------------------------------
    // 5. Método Estático mostrarTotalEmpleados() 

    /**
     * Método de clase que retorna el total de empleados creados.
     */
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // ----------------------------------------------------
    // 6. Getters y Setters (Encapsulamiento)
    
    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    // Setters (Se excluye el setter de ID para mantener unicidad)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    // El salario solo se actualiza vía métodos sobrecargados.
}
