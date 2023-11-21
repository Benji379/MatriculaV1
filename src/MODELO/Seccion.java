package MODELO;

import java.sql.Date;

public class Seccion {

    private final String idSeccion;
    private final String tutor;
    private final String grado;
    private final String aula;
    private final String division;
    private final Date fecha;

    public Seccion(String idSeccion, String tutor, String grado, String aula, String division, Date fecha) {
        this.idSeccion = idSeccion;
        this.tutor = tutor;
        this.grado = grado;
        this.aula = aula;
        this.division = division;
        this.fecha = fecha;
    }

    public String getIdSeccion() {
        return idSeccion;
    }

    public String getTutor() {
        return tutor;
    }

    public String getGrado() {
        return grado;
    }

    public String getAula() {
        return aula;
    }

    public String getDivision() {
        return division;
    }

    public Date getFecha() {
        return fecha;
    }

}
