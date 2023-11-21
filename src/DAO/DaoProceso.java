package DAO;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public interface DaoProceso {

    public abstract Object getConsultarDato(String codigo, String nombreColumnaBD);

    public abstract DefaultTableModel consultar(JTable tabla);
    

}
