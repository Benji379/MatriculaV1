package CONTROLADOR;

import DAO.daoDocente;
import DAO.daoDocenteBusq;
import MODELO.Proceso;
import VISTA.moduloDocenteBusq;
import java.util.HashMap;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorDocenteBusq {

    moduloDocenteBusq d;

    public ControladorDocenteBusq(moduloDocenteBusq d) {
        this.d = d;
    }

    public void initDiseño() {
        consultar();
        Proceso.transparentarTxtField(d.txtCodigo, d.txtDni, d.txtNombre, d.txtApellido, d.txtFecha, d.txtCorreo);
        iniciarFiltros(d.txtCodigo, d.txtDni, d.txtNombre, d.txtApellido, d.txtCorreo);
    }

    private void consultar() {
        daoDocente dao = new daoDocenteBusq();
        dao.consultar(d.tablaDocente);
    }

    public void filtrar() {
        daoDocenteBusq dao = new daoDocenteBusq();
        dao.filtroAvanzado(d.tablaDocente, hash());
    }

    private HashMap<String, String> hash() {

        HashMap<String, String> datos = new HashMap<>();
        datos.put("codigo", d.txtCodigo.getText());
        datos.put("dni", d.txtDni.getText());
        datos.put("nombre", d.txtNombre.getText());
        datos.put("apellido", d.txtApellido.getText());
        datos.put("correo", d.txtCorreo.getText());
        datos.put("estado", (String) d.comboEstado.getSelectedItem());

        return datos;
    }

    private void iniciarFiltros(JTextField... textField) {

        for (JTextField text : textField) {
            text.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    filtrar();
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    filtrar();
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    // Se llama cuando hay un cambio en atributos del texto (por ejemplo, estilo)
                }
            });
        }

    }

}
