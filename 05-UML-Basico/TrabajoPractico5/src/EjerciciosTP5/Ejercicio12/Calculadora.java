
package EjerciciosTP5.Ejercicio12;


public class Calculadora {
    
    public void calcular(Impuesto impuesto) {
        System.out.println("Cálculo de impuesto de: " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto: $" + impuesto.getMonto());
    }
}
