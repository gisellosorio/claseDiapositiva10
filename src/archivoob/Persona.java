package archivoob;
import java.io.Serializable;

//Ejemplo librería Serializable

public class Persona implements Serializable { //Ojo, va a implementar una clase serializable, o sea que los objetos creados pueden ser serializados
     
    private String dni;
    private String nombre;
    private String apellidos;

    public Persona(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
    
}

