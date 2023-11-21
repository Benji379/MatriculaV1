package VISTA;

import CONTROLADOR.ControladorDocente;
import MODELO.Proceso;

public class moduloDocente extends javax.swing.JPanel {

    ControladorDocente controlador;

    public moduloDocente() {
        initComponents();
        controlador = new ControladorDocente(this);
        controlador.initDiseño();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDocente = new COMPONET.Tabla();
        panel1 = new COMPONET.Panel();
        jLabel2 = new javax.swing.JLabel();
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
        btnFiltros = new COMPONET.Button();
        panel7 = new COMPONET.Panel();
        btnRegistrar = new COMPONET.Button();
        btnActualizar = new COMPONET.Button();
        btnEliminar = new COMPONET.Button();
        btnLimpiar = new COMPONET.Button();
        btnExportar = new COMPONET.Button();

        setBackground(new java.awt.Color(0, 50, 70));

        jLabel1.setFont(new java.awt.Font("Century", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DOCENTE");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tablaDocente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "N", "Codigo", "Dni", "Correo", "Estado", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setRoundBottomLeft(20);
        panel1.setRoundBottomRight(20);
        panel1.setRoundTopLeft(20);
        panel1.setRoundTopRight(20);

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DATOS");

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
        panel6.add(comboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 140, 40));

        btnFiltros.setBackground(new java.awt.Color(0, 50, 70));
        btnFiltros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buscar.png"))); // NOI18N
        btnFiltros.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFiltros.setShadowColor(new java.awt.Color(0, 0, 0));
        btnFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(btnFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFiltros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel7.setBackground(new java.awt.Color(0, 50, 70));

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 55));
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnRegistrar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 255, 55));
        btnActualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizar.setText("Actualizar");
        btnActualizar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnActualizar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 55));
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnEliminar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 55));
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnLimpiar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnExportar.setBackground(new java.awt.Color(255, 255, 55));
        btnExportar.setForeground(new java.awt.Color(0, 0, 0));
        btnExportar.setText("Exportar");
        btnExportar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExportar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnExportar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        controlador.registrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyReleased
        controlador.txtDniKeyReleased(evt);
    }//GEN-LAST:event_txtDniKeyReleased

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        controlador.limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tablaDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDocenteMouseClicked
        controlador.tablaDocenteMouseClicked(evt);
    }//GEN-LAST:event_tablaDocenteMouseClicked

    private void btnFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrosActionPerformed
        Proceso.MostrarPanel(frmPrincipal.CONTENEDOR, new moduloDocenteBusq());
    }//GEN-LAST:event_btnFiltrosActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        controlador.editar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        controlador.eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        controlador.exportar();
    }//GEN-LAST:event_btnExportarActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        Proceso.limitacionNumeros(txtDni, evt, 8);
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        Proceso.limitacionCaracteres(txtCorreo, evt, 100, false);
    }//GEN-LAST:event_txtCorreoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public COMPONET.Button btnActualizar;
    public COMPONET.Button btnEliminar;
    public COMPONET.Button btnExportar;
    public COMPONET.Button btnFiltros;
    public COMPONET.Button btnLimpiar;
    public COMPONET.Button btnRegistrar;
    public COMPONET.Combobox comboEstado;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator2;
    public javax.swing.JSeparator jSeparator3;
    public javax.swing.JSeparator jSeparator4;
    public COMPONET.Panel panel1;
    public COMPONET.Panel panel2;
    public COMPONET.Panel panel3;
    public COMPONET.Panel panel4;
    public COMPONET.Panel panel5;
    public COMPONET.Panel panel6;
    public COMPONET.Panel panel7;
    public COMPONET.Tabla tablaDocente;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
