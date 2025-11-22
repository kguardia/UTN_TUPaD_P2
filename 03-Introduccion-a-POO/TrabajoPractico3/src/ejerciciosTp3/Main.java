package ejerciciosTp3;


public class Main {
    
    public static void main(String[] args) { 
        // Creamos objeto estudiante y le asignamos valores a sus atributos 
        Estudiante e = new Estudiante();
        e.setNombre("Juan"); 
        e.setApellido("Perez"); 
        e.setCurso("Comision 1");
        e.setCalificacion(8.0); 

        // Llamamos al metodo mostrar info 
        e.mostrarInfo(); 

        e.subirCalificacion(2.0); // Subimos dos puntos su calificacion
        System.out.println(""); // Salto de linea para que veamos la consola mas prolija 
        e.mostrarInfo(); 

        e.bajarCalificacion(1.0); // Bajamos un punto la calificacion 
        System.out.println(""); // Salto de linea para que veamos la consola mas prolija
        e.mostrarInfo(); 
        
        // Creamos un objeto mascota y le asignamos valores a sus atributos 
        Mascota m = new Mascota(); 
        m.setNombre("Luna"); 
        m.setEspecie("Perro"); 
        m.setEdad(5); 

        // Mostramos su informacion
        m.mostrarInfo(); 

        m.cumplirAnios(); // Subimos 1 año 
        m.cumplirAnios(); // Subimos 1 año
        System.out.println(""); 

        // Mostramos info despues de que la mascota envejecio 2 años 
        m.mostrarInfo();
        
        // Creamos un objeto libro 
        Libro l = new Libro(); 
        
        // Le asignamos valores a cada atributo 
        l.setTitulo("Cien años de soledad"); 
        l.setAutor("Gabriel Garcia Marquez"); 
        l.setAnioPublicacion(2026); // Seteamos un año no valido

        // Mostramos la informacion habiendo seteado un año invalido 
        l.mostrarInfo(); 

        System.out.println(""); // Salto de linea para ver mas prolija la consola 

        l.setAnioPublicacion(1967); // Seteamos un año valido 
        l.mostrarInfo(); // Mostramos la informacion con todos los datos cargados correctamente 
        
        
        // Creamos un objeto gallina y le asignamos valores a sus atributos
        Gallina g = new Gallina(); 
        g.setIdGallina("abc123"); 
        g.setEdad(1); 
        g.setHuevosPuestos(0); 

        Gallina g2 = new Gallina(); 
        g2.setIdGallina("abc124"); 
        g2.setEdad(2); 
        g2.setHuevosPuestos(5); 

        // Mostramos el estado inicial de las gallinas 
        g.mostrarEstado(); 
        g2.mostrarEstado(); 

        // Llamamos 3 veces al metodo ponerHuevo de cada gallina
        g.ponerHuevo(); 
        g.ponerHuevo(); 
        g.ponerHuevo();

        g2.ponerHuevo(); 
        g2.ponerHuevo(); 
        g2.ponerHuevo(); 

        // Llamamos una vez al metodo envejecer de cada gallina 
        g.envejecer(); 
        g2.envejecer(); 

        // Mostramos el nuevo estado de las gallinas 
        g.mostrarEstado(); 
        g2.mostrarEstado(); 
        
        
        NaveEspacial nave = new NaveEspacial(); 
        nave.setNombre("Exploradora 1"); 
        nave.setCombustible(50); 

        System.out.println("Estado inicial:"); 
        nave.mostrarEstado(); 

        nave.despegar(); 
        nave.mostrarEstado(); 

        System.out.println("Intentando avanzar 30 km:"); 
        nave.avanzar(30); 

        System.out.println("Recargando 40 unidades de combustible:"); 
        nave.recargarCombustible(30); 

        System.out.println("Intentando avanzar 20 km:");
        nave.avanzar(20); // [cite: 415]

        System.out.println("Estado final:"); 
        nave.mostrarEstado(); 
    }
}
