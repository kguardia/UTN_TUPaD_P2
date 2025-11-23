package ejerciciosTP4;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE EMPLEADOS ===");

        // 1. Instanciar varios objetos usando ambos constructores 
        
        // Constructor 1 (ID manual)
        Empleado empA = new Empleado(101, "Carlos Gómez", "Gerente de IT", 75000.00);
        
        // Constructor 2 (ID automático y salario por defecto)
        Empleado empB = new Empleado("Laura Díaz", "Desarrollador Junior"); // ID 1
        Empleado empC = new Empleado("Martín Arias", "Analista de Datos");   // ID 2

        System.out.println("\n--- Información Inicial de Empleados ---");
        System.out.println(empA); // Llama a toString()
        System.out.println(empB); // Llama a toString() 
        System.out.println(empC); // Llama a toString() 

        // 2. Aplicar los métodos actualizarSalario() sobre distintos empleados 
        
        System.out.println("\n--- Actualización de Salarios ---");
        
        // EmpA: Aumento por cantidad fija (Método sobrecargado 2)
        empA.actualizarSalario(2500); 
        
        // EmpB: Aumento por porcentaje (Método sobrecargado 1)
        empB.actualizarSalario(10.5); 
        
        // EmpC: Aumento por cantidad fija (Método sobrecargado 2)
        empC.actualizarSalario(1000); 

        // 3. Imprimir la información final de cada empleado con toString() 
        System.out.println("\n--- Información Final ---");
        System.out.println(empA);
        System.out.println(empB);
        System.out.println(empC);

        // 4. Mostrar el total de empleados creados con mostrarTotalEmpleados() 
        System.out.println("\n--- Resumen Global ---");
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
        
        // El método estático se llama directamente desde la clase 
    }
}
