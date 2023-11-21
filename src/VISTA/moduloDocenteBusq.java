package VISTA;

import CONTROLADOR.ControladorDocenteBusq;
import MODELO.Proceso;

public class moduloDocenteBusq extends javax.swing.JPanel {
    
    ControladorDocenteBusq controlador;
    
    public moduloDocenteBusq() {
        initComponents();
        controlador = new ControladorDocenteBusq(this);
        controlador.initDiseño();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDocente = new COMPONET.Tabla();
        jLabel1 = new javax.swing.JLabel();
        panel1 = new COMPONET.Panel();
        panel8 = new COMPONET.Panel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        panel2 = new COMPONET.Panel();
        jLabel3 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        panel3 = new COMPONET.Panel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        panel4 = new COMPONET.Panel();
        jLabel5 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        panel5 = new COMPONET.Panel();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        panel6 = new COMPONET.Panel();
        jLabel7 = new javax.swing.JLabel();
        comboEstado = new COMPONET.Combobox();
        panel7 = new COMPONET.Panel();
        btnFiltros = new COMPONET.Button();
        jLabel2 = new javax.swing.JLabel();
        panel9 = new COMPONET.Panel();
        jLabel10 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(0, 50, 70));

        tablaDocente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N", "Codigo", "Dni", "Nombre", "Apellido", "Correo", "Estado", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDocenteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDocente);

        jLabel1.setFont(new java.awt.Font("Century", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DOCENTE");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setRoundBottomLeft(20);
        panel1.setRoundBottomRight(20);
        panel1.setRoundTopLeft(20);
        panel1.setRoundTopRight(20);

        panel8.setBackground(new java.awt.Color(255, 255, 255));
        panel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel8.setText("Codigo");
        panel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtCodigo.setSelectionColor(new java.awt.Color(0, 44, 73));
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        panel8.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 30));
        panel8.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 10));

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel3.setText("DNI");
        panel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        txtDni.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtDni.setSelectionColor(new java.awt.Color(0, 44, 73));
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        panel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 30));
        panel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 10));

        panel3.setBackground(new java.awt.Color(255, 255, 255));
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel4.setText("Nombre");
        panel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtNombre.setSelectionColor(new java.awt.Color(0, 44, 73));
        panel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 30));
        panel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 10));

        panel4.setBackground(new java.awt.Color(255, 255, 255));
        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel5.setText("Apellido");
        panel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtApellido.setSelectionColor(new java.awt.Color(0, 44, 73));
        panel4.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 30));
        panel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 10));

        panel5.setBackground(new java.awt.Color(255, 255, 255));
        panel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel6.setText("Correo");
        panel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtCorreo.setSelectionColor(new java.awt.Color(0, 44, 73));
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        panel5.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 30));
        panel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 10));

        panel6.setBackground(new java.awt.Color(255, 255, 255));
        panel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel7.setText("Estado");
        panel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "activo", "prueba", "suspendido" }));
        comboEstado.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        comboEstado.setLabeText("");
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });
        panel6.add(comboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 140, 40));

        panel7.setBackground(new java.awt.Color(255, 255, 255));
        panel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFiltros.setBackground(new java.awt.Color(0, 50, 70));
        btnFiltros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buscar.png"))); // NOI18N
        btnFiltros.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFiltros.setShadowColor(new java.awt.Color(0, 0, 0));
        btnFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrosActionPerformed(evt);
            }
        });
        panel7.add(btnFiltros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DATOS");
        panel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 117, 50));

        panel9.setBackground(new java.awt.Color(255, 255, 255));
        panel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel10.setText("Fecha");
        panel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtFecha.setSelectionColor(new java.awt.Color(0, 44, 73));
        panel9.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 30));
        panel9.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 10));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addGap(68, 68, 68))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyReleased
        
    }//GEN-LAST:event_txtDniKeyReleased

    private void btnFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrosActionPerformed
        Proceso.MostrarPanel(frmPrincipal.CONTENEDOR, new moduloDocente());
    }//GEN-LAST:event_btnFiltrosActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
        controlador.filtrar();
    }//GEN-LAST:event_comboEstadoActionPerformed

    private void tablaDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDocenteMouseClicked
        
    }//GEN-LAST:event_tablaDocenteMouseClicked

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        Proceso.limitacionCaracteres(txtCodigo, evt, 9, false);
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        Proceso.limitacionNumeros(txtDni, evt, 9);
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        Proceso.limitacionCaracteres(txtCorreo, evt, 150, false);
    }//GEN-LAST:event_txtCorreoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public COMPONET.Button btnFiltros;
    public COMPONET.Combobox comboEstado;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator2;
    public javax.swing.JSeparator jSeparator3;
    public javax.swing.JSeparator jSeparator4;
    public javax.swing.JSeparator jSeparator5;
    public javax.swing.JSeparator jSeparator6;
    public COMPONET.Panel panel1;
    public COMPONET.Panel panel2;
    public COMPONET.Panel panel3;
    public COMPONET.Panel panel4;
    public COMPONET.Panel panel5;
    public COMPONET.Panel panel6;
    public COMPONET.Panel panel7;
    public COMPONET.Panel panel8;
    public COMPONET.Panel panel9;
    public COMPONET.Tabla tablaDocente;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtFecha;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
