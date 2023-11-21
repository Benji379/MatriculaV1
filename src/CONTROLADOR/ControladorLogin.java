package CONTROLADOR;

import DAO.daoLogin;
import MODELO.Proceso;
import VISTA.frmLogin;
import VISTA.frmPrincipal;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class ControladorLogin {

    frmLogin login;
    daoLogin dao;

    public ControladorLogin(frmLogin login) {
        this.login = login;
        dao = new daoLogin();
    }

    public void initDiseño() {
        login.setLocationRelativeTo(null);
        login.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono.png")));
        login.setBackground(new Color(0, 0, 0, 0));
        Proceso.transparentarTxtField(login.txtUsuario, login.txtContraseña);
    }

    public void ingresar() {
        String usuario = login.txtUsuario.getText();
        String contraseña = login.txtContraseña.getText();
        if (dao.usuarioValido(usuario, contraseña)) {
            frmPrincipal abrir = new frmPrincipal();
            abrir.setVisible(true);
            login.setVisible(false);
        }
    }

    public void txtKeyReleased(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ingresar();
        }
    }

    int LayoutX;
    int LayoutY;

    public void BarraTituloMousePressed(MouseEvent evt) {

        if (evt.getButton() == MouseEvent.BUTTON1) {
            LayoutX = evt.getX();
            LayoutY = evt.getY();
        }
    }

    public void BarraTituloMouseDragged(MouseEvent evt) {
        login.setLocation(evt.getXOnScreen() - LayoutX, evt.getYOnScreen() - LayoutY);
    }

}
