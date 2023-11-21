package CONTROLADOR;

import DAO.daoAlumno;
import DAO.daoApoderado;
import MODELO.Apoderado;
import MODELO.ConsultaDNI;
import MODELO.Proceso;
import VISTA.moduloAlumnoApoderado;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorApoderado {

    moduloAlumnoApoderado a;
    daoApoderado dao;

    public ControladorApoderado(moduloAlumnoApoderado a) {
        this.a = a;
        dao = new daoApoderado();
    }

    public void initDiseño() {
        consultar();
        Proceso.transparentarTxtField(a.apoderado_txtApellido, a.apoderado_txtDni, a.apoderado_txtNombre, a.apoderado_txtTelefono);
    }

    public void consultar() {
        dao.consultar(a.tablaApoderado);
    }

    public void borrar() {
        if (filaSeleccionada >= 0) {
            int msj = JOptionPane.YES_NO_OPTION;
            int confir = JOptionPane.showConfirmDialog(null, "Confirmar eliminacion", "Confirmacion", msj);
            if (confir == 0) {
                String dni = Proceso.datoFilaColumna(a.tablaApoderado, filaSeleccionada, "dni").toString();
                dao.borrar(dni);
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void limpiar() {
        consultar();
        filaSeleccionada = -1;
        a.apoderado_txtDni.setText("");
        a.apoderado_txtNombre.setText("");
        a.apoderado_txtApellido.setText("");
        a.apoderado_txtTelefono.setText("");
        a.tablaApoderado.clearSelection();
        a.apoderado_txtDni.setEditable(true);
        refrescarComboAlumnos();
    }

    public void registrar() {
        String dni = a.apoderado_txtDni.getText();
        ConsultaDNI consultaDni = new ConsultaDNI(dni);
        String nombre = consultaDni.getNombres();
        String apellido = consultaDni.getApellidos();
        String telefono = a.apoderado_txtTelefono.getText();
        Apoderado apoderado = new Apoderado(dni, nombre, apellido, telefono);
        boolean espaciosVacios = Proceso.ComprobarTxtVacio(dni, telefono);
        if (!espaciosVacios) {
            if (consultaDni.getValido()) {
                int msj = JOptionPane.YES_NO_OPTION;
                int confir = JOptionPane.showConfirmDialog(null, "Confirmacion de registro", "Confirmacion", msj);
                if (confir == 0) {
                    dao.registrar(apoderado);
                    limpiar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un dni válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Complete todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void refrescarComboAlumnos() {
        daoAlumno daoAlu = new daoAlumno();
        daoAlu.rellenarCombo(a.alumno_comboApoderado, "padresfamilia", "dni");
    }

    public void exportar() {
        Proceso.exportarTablaXlsx((DefaultTableModel) a.tablaApoderado.getModel(), "Apoderados", new Color(0, 66, 132));
    }

    public void tablaApoderadoMouseClicked() {
        filaSeleccionada = a.tablaApoderado.getSelectedRow();
        String dni = Proceso.datoFilaColumna(a.tablaApoderado, filaSeleccionada, "dni").toString();
        String nombre = Proceso.datoFilaColumna(a.tablaApoderado, filaSeleccionada, "nombre").toString();
        String apellido = Proceso.datoFilaColumna(a.tablaApoderado, filaSeleccionada, "apellido").toString();
        String telefono = Proceso.datoFilaColumna(a.tablaApoderado, filaSeleccionada, "telefono").toString();
        a.apoderado_txtDni.setText(dni);
        a.apoderado_txtNombre.setText(nombre);
        a.apoderado_txtApellido.setText(apellido);
        a.apoderado_txtTelefono.setText(telefono);

        a.apoderado_txtDni.setEditable(false);
    }

    int filaSeleccionada = -1;

    public void txtDniKeyReleased(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ConsultaDNI consultDni = new ConsultaDNI(a.apoderado_txtDni.getText());
            if (consultDni.getValido()) {
                a.apoderado_txtNombre.setText(consultDni.getNombres());
                a.apoderado_txtApellido.setText(consultDni.getApellidos());
            } else {
                JOptionPane.showMessageDialog(null, "Dni inválido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                a.apoderado_txtNombre.setText("");
                a.apoderado_txtApellido.setText("");
            }
        }
    }
}
