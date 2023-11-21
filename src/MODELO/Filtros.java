package MODELO;

import java.util.HashMap;
import javax.swing.JTable;

public interface Filtros {

    public abstract void filtroAvanzado(JTable tabla, HashMap<String, String> hashMap);

}
