package CONTROLADOR;

import DAO.daoSeccion;
import MODELO.Proceso;
import MODELO.Seccion;
import VISTA.moduloSeccion;
import java.sql.Date;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ControladorSeccion {

    moduloSeccion s;

    public ControladorSeccion(moduloSeccion s) {
        this.s = s;
    }

    public void initDiseño() {
        daoSeccion dao = new daoSeccion();
        dao.rellenarCombo(s.comboGrado, "grados", "idGrado");
        dao.rellenarCombo(s.comboTutor, "docentes", "codigo");
        for (int i = 1; i <= 99; i++) {
            s.comboAula.addItem(i);
        }
        limpiar();

    }

    public void consultar() {
        daoSeccion dao = new daoSeccion();
        dao.consultar(s.tablaSecciones);
        initCombosFiltros();
        eventoFiltrando(s.filtroComboAula, s.filtroComboDivision, s.filtroComboFecha, s.filtroComboGrado, s.filtroComboSeccion, s.filtroComboTutor);
    }

    private void initCombosFiltros() {
        daoSeccion dao = new daoSeccion();
        dao.rellenarComboFiltros(s.filtroComboSeccion, "secciones", "idSeccion");
        dao.rellenarComboFiltros(s.filtroComboGrado, "secciones", "grado");
        dao.rellenarComboFiltros(s.filtroComboDivision, "secciones", "division");
        dao.rellenarComboFiltros(s.filtroComboTutor, "secciones", "tutor");
        dao.rellenarComboFiltros(s.filtroComboAula, "secciones", "aula");
        dao.rellenarComboFiltros(s.filtroComboFecha, "secciones", "fecha");
    }

    public void limpiar() {
        s.comboGrado.setSelectedIndex(0);
        s.comboDivision.setSelectedIndex(0);
        s.comboTutor.setSelectedIndex(0);
        s.comboAula.setSelectedIndex(0);
        consultar();
        filaSeleccionada = -1;
        s.tablaSecciones.clearSelection();

        s.comboGrado.setEnabled(true);
        s.comboDivision.setEnabled(true);
        s.comboAula.setEnabled(true);

    }

    public void registrar() {
        int msj = JOptionPane.YES_NO_OPTION;
        int confi = JOptionPane.showConfirmDialog(null, "Confirmar registro", "Confirmacion", msj);
        if (confi == 0) {
            try {
                String grado = s.comboGrado.getSelectedItem().toString();
                String division = s.comboDivision.getSelectedItem().toString();
                String tutor = s.comboTutor.getSelectedItem().toString();
                String aula = s.comboAula.getSelectedItem().toString();
                Date fecha = Proceso.obtenerFechaActual();
                String idSeccion = generarCodigo(division, aula, grado);
                Seccion seccion = new Seccion(idSeccion, tutor, grado, aula, division, fecha);
                daoSeccion dao = new daoSeccion();
                dao.registrar(seccion);
                limpiar();
            } catch (java.lang.ClassCastException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

    }

    public void actualizar() {
        if (filaSeleccionada >= 0) {
            int mesj = JOptionPane.YES_NO_OPTION;
            int confir = JOptionPane.showConfirmDialog(null, "Confirmar modificacion", "Error", mesj);
            if (confir == 0) {
                String tutor = s.comboTutor.getSelectedItem().toString();
                String idSeccion = Proceso.datoFilaColumna(s.tablaSecciones, filaSeleccionada, "seccion").toString();
                daoSeccion dao = new daoSeccion();
                dao.actualizar(tutor, idSeccion);
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void borrar() {
        if (filaSeleccionada >= 0) {
            int mesj = JOptionPane.YES_NO_OPTION;
            int confir = JOptionPane.showConfirmDialog(null, "Confirmar eliminacion", "Error", mesj);
            if (confir == 0) {
                String idSeccion = Proceso.datoFilaColumna(s.tablaSecciones, filaSeleccionada, "seccion").toString();
                daoSeccion dao = new daoSeccion();
                dao.borrar(idSeccion);
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String generarCodigo(String division, String aula, String grado) {
        return division + grado + String.format("%02d", Integer.valueOf(aula));
    }

    int filaSeleccionada = -1;

    public void tablaSeccionesMouseClicked() {
        filaSeleccionada = s.tablaSecciones.getSelectedRow();
        String grado = Proceso.datoFilaColumna(s.tablaSecciones, filaSeleccionada, "grado").toString();
        String division = Proceso.datoFilaColumna(s.tablaSecciones, filaSeleccionada, "division").toString();
        String tutor = Proceso.datoFilaColumna(s.tablaSecciones, filaSeleccionada, "tutor").toString();
        String aula = Proceso.datoFilaColumna(s.tablaSecciones, filaSeleccionada, "aula").toString();
        s.comboGrado.setSelectedItem(grado);
        s.comboDivision.setSelectedItem(division);
        s.comboTutor.setSelectedItem(tutor);
        s.comboAula.setSelectedItem(aula);

        s.comboGrado.setEnabled(false);
        s.comboDivision.setEnabled(false);
        s.comboAula.setEnabled(false);
    }

    private HashMap<String, String> hash() {
        HashMap<String, String> datos = new HashMap<>();
        datos.put("idSeccion", Proceso.evitarNulo(s.filtroComboSeccion.getSelectedItem()));
        datos.put("aula", Proceso.evitarNulo(s.filtroComboAula.getSelectedItem()));
        datos.put("division", Proceso.evitarNulo(s.filtroComboDivision.getSelectedItem()));
        datos.put("fecha", Proceso.evitarNulo(s.filtroComboFecha.getSelectedItem()));
        datos.put("grado", Proceso.evitarNulo(s.filtroComboGrado.getSelectedItem()));
        datos.put("tutor", Proceso.evitarNulo(s.filtroComboTutor.getSelectedItem()));
        return datos;
    }

    private void filtrar() {
        daoSeccion dao = new daoSeccion();
        dao.filtroAvanzado(s.tablaSecciones, hash());
    }

    private void eventoFiltrando(JComboBox... combo) {
        for (JComboBox c : combo) {
            c.addActionListener((java.awt.event.ActionEvent evt) -> {
                filtrar();
            });

        }
    }

}
