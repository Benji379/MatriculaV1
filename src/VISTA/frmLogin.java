package VISTA;

import CONTROLADOR.ControladorLogin;
import MODELO.Proceso;

public class frmLogin extends javax.swing.JFrame {

    ControladorLogin controlador;

    public frmLogin() {
        initComponents();
        controlador = new ControladorLogin(this);
        controlador.initDiseño();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new COMPONET.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        BarraTitulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(0, 50, 70));
        panel1.setRoundBottomLeft(20);
        panel1.setRoundBottomRight(20);
        panel1.setRoundTopLeft(20);
        panel1.setRoundTopRight(20);
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOGIN");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setSelectionColor(new java.awt.Color(0, 95, 133));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        panel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 140, 30));

        txtContraseña.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContraseña.setSelectionColor(new java.awt.Color(0, 95, 133));
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyTyped(evt);
            }
        });
        panel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 140, 30));
        panel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 140, 10));
        panel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 140, 10));

        BarraTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BarraTitulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraTituloMouseDragged(evt);
            }
        });
        BarraTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraTituloMousePressed(evt);
            }
        });
        panel1.add(BarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 40));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("x");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 40, 40));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        controlador.txtKeyReleased(evt);
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void txtContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyReleased
        controlador.txtKeyReleased(evt);
    }//GEN-LAST:event_txtContraseñaKeyReleased

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        Proceso.limitacionNumeros(txtUsuario, evt, 8);
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyTyped
        Proceso.limitacionCaracteres(txtContraseña, evt, 20, false);
    }//GEN-LAST:event_txtContraseñaKeyTyped

    private void BarraTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraTituloMousePressed
        controlador.BarraTituloMousePressed(evt);
    }//GEN-LAST:event_BarraTituloMousePressed

    private void BarraTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraTituloMouseDragged
        controlador.BarraTituloMouseDragged(evt);
    }//GEN-LAST:event_BarraTituloMouseDragged

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel BarraTitulo;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator2;
    public COMPONET.Panel panel1;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
