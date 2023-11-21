package CONTROLADOR;

import DAO.daoMatricula;
import MODELO.Matricula;
import MODELO.Proceso;
import VISTA.moduloMatricula;
import com.mysql.cj.conf.PropertyKey;
import java.sql.Date;
import javax.swing.JOptionPane;

public class ControladorMatricula {

    moduloMatricula m;
    daoMatricula dao;

    public ControladorMatricula(moduloMatricula m) {
        this.m = m;
        dao = new daoMatricula();
    }

    public void initDiseño() {
        limpiar();
    }

    public void limpiar() {
        consultar();
        filaSeleccionada = -1;
        m.txtMatricula.setText("MATRICULA #" + getIdActual());
        m.comboAlumno.setEnabled(true);
        m.comboPagado.setSelectedIndex(0);
        m.tablaMatricula.clearSelection();
    }

    private String getIdActual() {
        int valorActualId = Integer.parseInt(dao.valorActualID()) + 1;
        String nuevaID = String.format("%08d", valorActualId);
        return nuevaID;
    }

    public void consultar() {
        dao.consultar(m.tablaMatricula);
        dao.rellenarCombo(m.comboAlumno, "alumnos", "codigo");
        dao.rellenarCombo(m.comboSeccion, "secciones", "idSeccion");
    }

    public void setAlumno(String codigoAlumno) {
        try {
            String nombre = dao.getConsultarDato("alumnos", codigoAlumno, "codigo", "nombre").toString();
            String apellido = dao.getConsultarDato("alumnos", codigoAlumno, "codigo", "apellido").toString();
            String alumno = nombre + " " + apellido;
            m.txtAlumno.setText(alumno);
            setApoderado(codigoAlumno);
        } catch (NullPointerException e) {
        }
    }

    private void setApoderado(String codigoAlumno) {
        try {
            String codigoApoderado = dao.getConsultarDato("alumnos", codigoAlumno, "codigo", "apoderado").toString();
            String nombre = dao.getConsultarDato("padresfamilia", codigoApoderado, "dni", "nombre").toString();
            String apellido = dao.getConsultarDato("padresfamilia", codigoApoderado, "dni", "apellido").toString();
            String apoderado = nombre + " " + apellido;
            m.txtApoderado.setText(apoderado);
        } catch (NullPointerException e) {
        }
    }

    public void setGradoNivel(String idSeccion) {
        try {
            String grado = dao.getConsultarDato("secciones", idSeccion, "idSeccion", "grado").toString();
            String identificarSecion = dao.getConsultarDato("secciones", idSeccion, "idSeccion", "division").toString();
            String identificarGrado = dao.getConsultarDato("grados", grado, "idGrado", "grado").toString();
            String identificarNivel = dao.getConsultarDato("grados", grado, "idGrado", "nivel").toString();
            m.txtGrado.setText(identificarGrado);
            m.txtNivel.setText(identificarNivel);
            m.txtSeccion.setText(identificarSecion);
        } catch (NullPointerException e) {
        }
    }

    public void modificar() {
        if (filaSeleccionada >= 0) {
            int msj = JOptionPane.YES_NO_OPTION;
            int confi = JOptionPane.showConfirmDialog(null, "Confirmar modificacion", "Confirmacion", msj);
            if (confi == 0) {
                String idMatricula = Proceso.datoFilaColumna(m.tablaMatricula, filaSeleccionada, "idMatricula").toString();
                String idSeccion = m.comboSeccion.getSelectedItem().toString();
                String pagado = m.comboPagado.getSelectedItem().toString();
                Date fecha = Proceso.obtenerFechaActual();
                dao.modificar(idMatricula, idSeccion, pagado, fecha);
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void borrar() {
        if (filaSeleccionada >= 0) {
            int msj = JOptionPane.YES_NO_OPTION;
            int confi = JOptionPane.showConfirmDialog(null, "Confirmar eliminacion", "Confirmacion", msj);
            if (confi == 0) {
                String idMatricula = Proceso.datoFilaColumna(m.tablaMatricula, filaSeleccionada, "idMatricula").toString();
                dao.eliminar(idMatricula);
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void tablaMatriculaMouseClicked() {
        filaSeleccionada = m.tablaMatricula.getSelectedRow();
        String idMatricula = Proceso.datoFilaColumna(m.tablaMatricula, filaSeleccionada, "idMatricula").toString();
        String codigAlumno = Proceso.datoFilaColumna(m.tablaMatricula, filaSeleccionada, "alumno").toString();
        String seccion = Proceso.datoFilaColumna(m.tablaMatricula, filaSeleccionada, "seccion").toString();
        String pagado = Proceso.datoFilaColumna(m.tablaMatricula, filaSeleccionada, "pagado").toString();
        m.txtMatricula.setText("MATRICULA #" + idMatricula);
        m.comboAlumno.setSelectedItem(codigAlumno);
        m.comboSeccion.setSelectedItem(seccion);
        m.comboPagado.setSelectedItem(pagado);
        m.comboAlumno.setEnabled(false);
    }

    public void registrar() {

        try {
            String dniAlumno = m.comboAlumno.getSelectedItem().toString();
            if (dao.alumnoExiste(dniAlumno)) {
                int msj = JOptionPane.YES_NO_OPTION;
                int confi = JOptionPane.showConfirmDialog(null, "Confirmar ingreso", "Confirmacion", msj);
                if (confi == 0) {
                    String idMatricula = getIdActual();
                    String idSeccion = m.comboSeccion.getSelectedItem().toString();
                    String pagado = m.comboPagado.getSelectedItem().toString();
                    Date fecha = Proceso.obtenerFechaActual();
                    Matricula matricula = new Matricula(idMatricula, dniAlumno, idSeccion, pagado, fecha);
                    dao.registrar(matricula);
                    limpiar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error Alumno existente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NullPointerException e) {

        }

    }

    int filaSeleccionada = -1;

}
