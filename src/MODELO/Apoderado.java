package MODELO;

public class Apoderado {

    private final String dni;
    private final String nombre;
    private final String apellido;
    private final String telefono;

    public Apoderado(String dni, String nombre, String apellido, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    
    
    
}
