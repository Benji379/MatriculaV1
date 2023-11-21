package MODELO;

import java.sql.Date;

public class Matricula {

    private final String idMatricula;
    private final String alumno;
    private final String seccion;
    private final String pagado;
    private final Date fecha;

    public Matricula(String idMatricula, String alumno, String seccion, String pagado, Date fecha) {
        this.idMatricula = idMatricula;
        this.alumno = alumno;
        this.seccion = seccion;
        this.pagado = pagado;
        this.fecha = fecha;
    }

    public String getIdMatricula() {
        return idMatricula;
    }

    public String getAlumno() {
        return alumno;
    }

    public String getSeccion() {
        return seccion;
    }

    public String getPagado() {
        return pagado;
    }

    public Date getFecha() {
        return fecha;
    }
    
    
    
}
