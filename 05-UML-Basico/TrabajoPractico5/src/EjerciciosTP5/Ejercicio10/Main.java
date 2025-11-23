
package EjerciciosTP5.Ejercicio10;


public class Main {
    
    public static void main(String[] args) {
        Titular titular = new Titular("Federico Díaz", "33445566");
        ClaveSeguridad cs = new ClaveSeguridad("seg123", "2025-08-01");
        CuentaBancaria cuenta = new CuentaBancaria("2220001133445566", 150000.0, "seg123", "2025-08-01");
        titular.setCuenta(cuenta);
        System.out.println("Titular: " + cuenta.getTitular().getNombre());
        System.out.println("Saldo: " + cuenta.getSaldo());
        System.out.println("Clave: " + cuenta.getClave().getCodigo());

    }
}
