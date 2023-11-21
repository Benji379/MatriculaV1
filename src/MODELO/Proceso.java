package MODELO;

import COMPONET.CustomFileChooser;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Proceso {

    public static void removerBordeBlanco(JScrollPane scrollPane) {
        scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
    }

    public static void setPanelBackgroundColors(JPanel panel, String pressedColor, String rolloverColor) {
        Color normalColor = panel.getBackground();

        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel.setBackground(Color.decode(pressedColor));
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panel.setBackground(normalColor);
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel.setBackground(Color.decode(rolloverColor));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel.setBackground(normalColor);
            }
        });
    }

    public static void AccederEnlace(String enlace) {
        String url = "C:\\Windows\\System32\\cmd.exe /K start " + enlace;
        try {
            Runtime.getRuntime().exec(url);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void MostrarPanel(JPanel contenedor, JPanel panel) {
        int ancho = panel.getSize().width;
        int largo = panel.getSize().height;
        panel.setSize(ancho, largo);
        panel.setLocation(0, 0);

        contenedor.removeAll();
        contenedor.add(panel, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }

    public static void scrollToTop(JScrollPane scrollPane) {
        JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
        verticalScrollBar.setValue(verticalScrollBar.getMinimum());
    }

    public static void transparentarTxtField(JTextField... txtField) {
        for (JTextField txt : txtField) {
            txt.setBackground(new java.awt.Color(0, 0, 0, 1));
            txt.setBorder(null);
        }
    }

    public static void limitacionNumeros(JTextField txtField, KeyEvent evt, int CantNumeros) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean espacio = key == KeyEvent.VK_SPACE;
        if (!numeros || espacio) {
            evt.consume();
        } else {
            if (txtField.getText().length() >= CantNumeros) {
                evt.consume();
            }
        }
    }

    public static void limitacionCaracteres(JTextField txtField, KeyEvent evt, int cantNumeros, boolean conEspacio) {
        if (conEspacio) {
            if (txtField.getText().length() >= cantNumeros) {
                evt.consume();
            }
        } else {
            int key = evt.getKeyChar();
            boolean espacio = key == KeyEvent.VK_SPACE;
            if (espacio) {
                evt.consume();
            } else {
                if (txtField.getText().length() >= cantNumeros) {
                    evt.consume();
                }
            }
        }
    }

    public static boolean ComprobarTxtVacio(JTextField... txt) {
        boolean vacio;
        for (JTextField text : txt) {
            vacio = text.getText().equals("");
            if (vacio) {
                return vacio;
            }
        }
        return false;
    }

    public static boolean ComprobarTxtVacio(String... txt) {
        boolean vacio;
        for (String text : txt) {
            vacio = text.equals("");
            if (vacio) {
                return vacio;
            }
        }
        return false;
    }

    public static Date obtenerFechaActual() {
        // Obtén la fecha actual
        java.util.Date fechaActual = new java.util.Date();

        // Convierte la fecha actual a java.sql.Date
        Date fechaSQL = new Date(fechaActual.getTime());

        return fechaSQL;
    }

    public static String generarCodigo(char letraInicial, String dni, String apellido, java.sql.Date fecha) {
        // Obtener el año actual
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String anioActual = sdf.format(System.currentTimeMillis()).substring(2);

        // Obtener los caracteres según las especificaciones
        char primerCaracter = letraInicial;
        String dosUltimasCifrasAnio = anioActual;
        String tresPrimerosDni = dni.substring(0, 3);
        String dosPrimerosApellido = apellido.substring(0, 2).toUpperCase();

        // Concatenar los caracteres para formar el código
        String codigo = "" + primerCaracter + dosUltimasCifrasAnio + tresPrimerosDni + dosPrimerosApellido;

        // Verificar y ajustar la longitud del código a 8 caracteres
        if (codigo.length() > 8) {
            codigo = codigo.substring(0, 8);
        } else if (codigo.length() < 8) {
            // Puedes tomar acciones adicionales si es necesario
            // En este ejemplo, simplemente se agregan ceros al final
            while (codigo.length() < 8) {
                codigo += "0";
            }
        }
        return codigo;
    }

    public static Object datoFilaColumna(JTable tabla, int fila, String nombreColumna) {
        int columnaCodigo = 0;
        Object dato;
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            if (tabla.getColumnName(i).equalsIgnoreCase(nombreColumna)) {
                columnaCodigo = i;
                break;
            }
        }
        dato = tabla.getValueAt(fila, columnaCodigo);
        return dato;
    }

    public static void exportarTablaXlsx(DefaultTableModel modeloTabla, String nombreArchivo, Color color) {
        String defaultFileName = nombreArchivo;
        String fileExtension = "xlsx";
        String selectedFilePath = CustomFileChooser.chooseExcelFile(defaultFileName, fileExtension);
        if (selectedFilePath == null) {
        } else {
            ExportarExcel.exportToExcel(modeloTabla, selectedFilePath, color);
            JOptionPane.showMessageDialog(null, defaultFileName + "." + fileExtension + " descargado");
        }
    }

    public static String evitarNulo(Object ob) {
        return ((ob != null) ? ob.toString() : "");
    }

}
