package MODELO;

import java.sql.Date;

public class Docente {
    
    private final String codigo;
    private final String dni;
    private final String nombre;
    private final String apellido;
    private final String correo;
    private final String estado;
    private final Date fecha;

    public Docente(String codigo, String dni, String nombre, String apellido, String direccion, String estado, Date fecha) {
        this.codigo = codigo;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = direccion;
        this.estado = estado;
        this.fecha = fecha;
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

    public String getCorreo() {
        return correo;
    }

    public String getEstado() {
        return estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getCodigo() {
        return codigo;
    }

}
