package ejerciciosTp3;


public class NaveEspacial {
    
    // Declaramos atributos privados y metodos getter y setter 
    private String nombre;
    private int combustible; 

    public String getNombre() { 
        return nombre; 
    }

    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public int getCombustible() { 
        return combustible; 
    }

    public void setCombustible(int combustible) { 
        this.combustible = combustible; 
    }

    // Metodos despegar, avanzar, recargar combustible y mostrar estado: 
    public void despegar() { 

        if (combustible >= 5) {
            combustible -= 5;
            System.out.println("La nave despego...");
        } else {
            System.out.println("No hay suficiente combustible para despegar");
        }
    }

    public void avanzar(int distancia) { 
        int costo = 10; 
        if (combustible >= costo) {
            combustible -= costo;
            System.out.println("La nave avanzo " + distancia + " kms");
        } else {
            System.out.println("No hay suficiente combustible");
        }
    }

    public void recargarCombustible(int cantidad) { 
        int max = 100; 
        if ((combustible + cantidad) <= max) { 
            this.combustible += cantidad; 
        }
    }

    public void mostrarEstado() { // [cite: 391]
        System.out.println("Nombre: " + this.nombre + ", combustible: " + this.combustible); 
    }
}
