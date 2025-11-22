package ejerciciosTp3;

public class Gallina {
    
    // Declaramos atributos privados 
    private String idGallina; 
    private int edad; 
    private int huevosPuestos; 

    // Declaramos getters y setters
    public String getIdGallina() { 
        return idGallina; 
    }

    public void setIdGallina(String idGallina) { 
        this.idGallina = idGallina; 
    }

    public int getEdad() { 
        return edad; 
    }

    public void setEdad(int edad) { 
        this.edad = edad; 
    }

    public int getHuevosPuestos() { 
        return huevosPuestos; 
    }

    public void setHuevosPuestos(int huevosPuestos) { 
        this.huevosPuestos = huevosPuestos; 
    }

    // Metodo para que la gallina ponga un huevo 
    public void ponerHuevo() { 
        this.huevosPuestos += 1; 
    }

    // Metodo que hace que la gallina envejezca un año 
    public void envejecer() { 
        this.edad += 1; 
    }

    // Mostramos el estado de la gallina 
    public void mostrarEstado() { 
        System.out.println("ID: " + this.idGallina + ", huevos puestos: " + this.huevosPuestos + ", edad: " + this.edad); 
    }
}
