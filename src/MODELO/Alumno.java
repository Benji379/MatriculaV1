package MODELO;

public class Alumno {

    private final String codigo;
    private final String dni;
    private final String nombre;
    private final String apellido;
    private final String apoderado;

    public Alumno(String codigo, String dni, String nombre, String apellido, String apoderado) {
        this.codigo = codigo;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.apoderado = apoderado;
    }

    public String getCodigo() {
        return codigo;
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

    public String getApoderado() {
        return apoderado;
    }

}
