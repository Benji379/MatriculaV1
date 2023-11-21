package CONTROLADOR;

import MODELO.Proceso;
import VISTA.frmPrincipal;
import VISTA.moduloMatricula;
import javax.swing.JPanel;

public class ControladorPrincipal {

    private final frmPrincipal p;

    public ControladorPrincipal(frmPrincipal p) {
        this.p = p;
    }

    public void initDiseño() {
        p.setLocationRelativeTo(null);
        p.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono.png")));
        Proceso.removerBordeBlanco(p.jScrollPane1);
        configBotones(p.moduloMatricula, p.moduloSalones, p.moduloDocentes, p.moduloAlumnos, p.btnBiblioteca, p.btnPagina, p.btnPeruSchol);
        Proceso.MostrarPanel(frmPrincipal.CONTENEDOR, new moduloMatricula());
    }

    public static void configBotones(JPanel... panel) {
        for (JPanel p : panel) {
            Proceso.setPanelBackgroundColors(p, "#fefc68", "#fffe91");
        }
    }
}
