package CONTROLADOR;

import DAO.daoDocente;
import DAO.daoDocenteBusq;
import MODELO.ConsultaDNI;
import MODELO.Docente;
import MODELO.Proceso;
import VISTA.moduloDocente;
import VISTA.moduloDocenteBusq;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.sql.Date;
import javax.swing.JOptionPane;

public class ControladorDocente {
//#283044

    private final moduloDocente d;

    public ControladorDocente(moduloDocente d) {
        this.d = d;
    }

    public void initDiseño() {
        Proceso.transparentarTxtField(d.txtDni, d.txtNombre, d.txtApellido, d.txtCorreo);
        d.txtNombre.setEditable(false);
        d.txtApellido.setEditable(false);
        d.jScrollPane1.getViewport().setBackground(new Color(255, 255, 255));
        limpiar();
    }

    public void registrar() {
        boolean vacios = Proceso.ComprobarTxtVacio(d.txtDni, d.txtNombre, d.txtApellido, d.txtCorreo);
        if (!vacios) {
            int msj = JOptionPane.YES_NO_OPTION;
            int confir = JOptionPane.showConfirmDialog(null, "Confirmar registro", "Confirmacion", msj);
            if (confir == 0) {
                try {
                    String dni = d.txtDni.getText();
                    ConsultaDNI consultDni = new ConsultaDNI(dni);
                    String nombre = consultDni.getNombres();
                    String apellido = consultDni.getApellidos();
                    String direccion = d.txtCorreo.getText();
                    String estado = (String) d.comboEstado.getSelectedItem();
                    Date fecha = Proceso.obtenerFechaActual();

                    String codigo = Proceso.generarCodigo('D', dni, apellido, fecha);
                    Docente docente = new Docente(codigo, dni, nombre, apellido, direccion, estado, fecha);
                    daoDocente dao = new daoDocente();
                    dao.registrar(docente);
                    limpiar();
                } catch (Exception e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        }
    }

    public void consultar() {
        daoDocente dao = new daoDocente();
        dao.consultar(d.tablaDocente);
    }

    public void exportar() {
        daoDocenteBusq dao = new daoDocenteBusq();
        moduloDocenteBusq db = new moduloDocenteBusq();
        Proceso.exportarTablaXlsx(dao.consultar(db.tablaDocente), "Lista de docentes", new Color(0, 66, 132));
    }

    public void editar() {
        if (filaSeleccionada >= 0) {
            int confir = JOptionPane.YES_NO_OPTION;
            int res = JOptionPane.showConfirmDialog(null, "Confirmar modificacion", "Confirmacion", confir);
            if (res == 0) {
                String codigo = Proceso.datoFilaColumna(d.tablaDocente, filaSeleccionada, "codigo").toString();
                String correo = d.txtCorreo.getText();
                String estado = (String) d.comboEstado.getSelectedItem();
                Date fecha = Proceso.obtenerFechaActual();
                daoDocente dao = new daoDocente();
                dao.editar(codigo, correo, estado, fecha);
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminar() {
        if (filaSeleccionada >= 0) {
            int confir = JOptionPane.YES_NO_OPTION;
            int res = JOptionPane.showConfirmDialog(null, "Confirmar eliminacion", "Confirmacion", confir);
            if (res == 0) {
                String codigo = Proceso.datoFilaColumna(d.tablaDocente, filaSeleccionada, "codigo").toString();
                daoDocente dao = new daoDocente();
                dao.eliminar(codigo);
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void txtDniKeyReleased(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ConsultaDNI consultDni = new ConsultaDNI(d.txtDni.getText());
            if (consultDni.getValido()) {
                d.txtNombre.setText(consultDni.getNombres());
                d.txtApellido.setText(consultDni.getApellidos());
            } else {
                JOptionPane.showMessageDialog(null, "Dni inválido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                d.txtNombre.setText("");
                d.txtApellido.setText("");
            }
        }
    }

    public void limpiar() {
        d.txtDni.setText("");
        d.txtNombre.setText("");
        d.txtApellido.setText("");
        d.txtCorreo.setText("");
        d.comboEstado.setSelectedIndex(0);
        consultar();
        d.tablaDocente.clearSelection();
        filaSeleccionada = -1;
        d.txtDni.setEditable(true);
    }

    int filaSeleccionada = -1;

    public void tablaDocenteMouseClicked(MouseEvent evt) {
        filaSeleccionada = d.tablaDocente.getSelectedRow();
        daoDocente dao = new daoDocente();
        String codigo = Proceso.datoFilaColumna(d.tablaDocente, filaSeleccionada, "codigo").toString();
        String dni = Proceso.datoFilaColumna(d.tablaDocente, filaSeleccionada, "dni").toString();
        String nombre = dao.getConsultarDato(codigo, "nombre").toString();
        String apellido = dao.getConsultarDato(codigo, "apellido").toString();
        String correo = Proceso.datoFilaColumna(d.tablaDocente, filaSeleccionada, "correo").toString();
        String estado = Proceso.datoFilaColumna(d.tablaDocente, filaSeleccionada, "estado").toString();

        d.txtDni.setText(dni);
        d.txtNombre.setText(nombre);
        d.txtApellido.setText(apellido);
        d.txtCorreo.setText(correo);
        d.comboEstado.setSelectedItem(estado);
        d.txtDni.setEditable(false);

    }

}
