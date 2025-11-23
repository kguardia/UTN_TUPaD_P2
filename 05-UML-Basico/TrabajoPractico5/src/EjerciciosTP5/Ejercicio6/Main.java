
package EjerciciosTP5.Ejercicio6;


public class Main {
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pedro Albornoz", "11332211");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("2025-09-10", "21:00", mesa);
        reserva.setCliente(cliente);
        System.out.println("Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Mesa número: " + reserva.getMesa().getNumero());

    }
}
