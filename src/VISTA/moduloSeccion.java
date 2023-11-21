package VISTA;

import CONTROLADOR.ControladorSeccion;

public class moduloSeccion extends javax.swing.JPanel {

    ControladorSeccion controlador;

    public moduloSeccion() {
        initComponents();
        controlador = new ControladorSeccion(this);
        controlador.initDiseño();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel1 = new COMPONET.Panel();
        panel7 = new COMPONET.Panel();
        jLabel2 = new javax.swing.JLabel();
        panel8 = new COMPONET.Panel();
        jLabel8 = new javax.swing.JLabel();
        comboGrado = new COMPONET.ComboBoxSuggestion();
        panel9 = new COMPONET.Panel();
        jLabel9 = new javax.swing.JLabel();
        comboDivision = new COMPONET.ComboBoxSuggestion();
        panel10 = new COMPONET.Panel();
        jLabel10 = new javax.swing.JLabel();
        comboTutor = new COMPONET.ComboBoxSuggestion();
        panel11 = new COMPONET.Panel();
        jLabel11 = new javax.swing.JLabel();
        comboAula = new COMPONET.ComboBoxSuggestion();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSecciones = new COMPONET.Tabla();
        panel2 = new COMPONET.Panel();
        panel13 = new COMPONET.Panel();
        jLabel13 = new javax.swing.JLabel();
        filtroComboSeccion = new COMPONET.ComboBoxSuggestion();
        panel14 = new COMPONET.Panel();
        jLabel14 = new javax.swing.JLabel();
        filtroComboGrado = new COMPONET.ComboBoxSuggestion();
        panel15 = new COMPONET.Panel();
        jLabel15 = new javax.swing.JLabel();
        filtroComboDivision = new COMPONET.ComboBoxSuggestion();
        panel16 = new COMPONET.Panel();
        jLabel16 = new javax.swing.JLabel();
        filtroComboTutor = new COMPONET.ComboBoxSuggestion();
        panel17 = new COMPONET.Panel();
        jLabel17 = new javax.swing.JLabel();
        filtroComboAula = new COMPONET.ComboBoxSuggestion();
        panel18 = new COMPONET.Panel();
        jLabel18 = new javax.swing.JLabel();
        filtroComboFecha = new COMPONET.ComboBoxSuggestion();
        panel3 = new COMPONET.Panel();
        btnLimpiar = new COMPONET.Button();
        btnActualizar = new COMPONET.Button();
        btnRegistrar = new COMPONET.Button();
        btnEliminar = new COMPONET.Button();

        setBackground(new java.awt.Color(0, 50, 70));

        jLabel1.setFont(new java.awt.Font("Century", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECCION");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setRoundBottomLeft(20);
        panel1.setRoundBottomRight(20);
        panel1.setRoundTopLeft(20);
        panel1.setRoundTopRight(20);

        panel7.setBackground(new java.awt.Color(255, 255, 255));
        panel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DATOS");
        panel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 117, 50));

        panel8.setBackground(new java.awt.Color(255, 255, 255));
        panel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel8.setText("Grado");
        panel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        comboGrado.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        panel8.add(comboGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        panel9.setBackground(new java.awt.Color(255, 255, 255));
        panel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel9.setText("Division");
        panel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        comboDivision.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G" }));
        comboDivision.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        panel9.add(comboDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        panel10.setBackground(new java.awt.Color(255, 255, 255));
        panel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel10.setText("Tutor");
        panel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        comboTutor.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        panel10.add(comboTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        panel11.setBackground(new java.awt.Color(255, 255, 255));
        panel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel11.setText("Aula");
        panel11.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        comboAula.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        panel11.add(comboAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel11, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel10, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        tablaSecciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Seccion", "Grado", "Division", "Tutor", "Aula", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSecciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSeccionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaSecciones);

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setRoundBottomLeft(20);
        panel2.setRoundBottomRight(20);
        panel2.setRoundTopLeft(20);
        panel2.setRoundTopRight(20);

        panel13.setBackground(new java.awt.Color(255, 255, 255));
        panel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel13.setText("Seccion");
        panel13.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        filtroComboSeccion.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        panel13.add(filtroComboSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        panel14.setBackground(new java.awt.Color(255, 255, 255));
        panel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel14.setText("Grado");
        panel14.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        filtroComboGrado.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        panel14.add(filtroComboGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        panel15.setBackground(new java.awt.Color(255, 255, 255));
        panel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel15.setText("Division");
        panel15.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        filtroComboDivision.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        panel15.add(filtroComboDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        panel16.setBackground(new java.awt.Color(255, 255, 255));
        panel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel16.setText("Tutor");
        panel16.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        filtroComboTutor.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        panel16.add(filtroComboTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        panel17.setBackground(new java.awt.Color(255, 255, 255));
        panel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel17.setText("Aula");
        panel17.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        filtroComboAula.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        panel17.add(filtroComboAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        panel18.setBackground(new java.awt.Color(255, 255, 255));
        panel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel18.setText("Fecha");
        panel18.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        filtroComboFecha.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        filtroComboFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroComboFechaActionPerformed(evt);
            }
        });
        panel18.add(filtroComboFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(panel14, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel16, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel18, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(panel13, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel15, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel17, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        panel3.setBackground(new java.awt.Color(255, 255, 255));
        panel3.setRoundBottomLeft(20);
        panel3.setRoundBottomRight(20);
        panel3.setRoundTopLeft(20);
        panel3.setRoundTopRight(20);

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

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        controlador.limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        controlador.actualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        controlador.registrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        controlador.borrar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaSeccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSeccionesMouseClicked
        controlador.tablaSeccionesMouseClicked();
    }//GEN-LAST:event_tablaSeccionesMouseClicked

    private void filtroComboFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroComboFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroComboFechaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public COMPONET.Button btnActualizar;
    public COMPONET.Button btnEliminar;
    public COMPONET.Button btnLimpiar;
    public COMPONET.Button btnRegistrar;
    public COMPONET.ComboBoxSuggestion comboAula;
    public COMPONET.ComboBoxSuggestion comboDivision;
    public COMPONET.ComboBoxSuggestion comboGrado;
    public COMPONET.ComboBoxSuggestion comboTutor;
    public COMPONET.ComboBoxSuggestion filtroComboAula;
    public COMPONET.ComboBoxSuggestion filtroComboDivision;
    public COMPONET.ComboBoxSuggestion filtroComboFecha;
    public COMPONET.ComboBoxSuggestion filtroComboGrado;
    public COMPONET.ComboBoxSuggestion filtroComboSeccion;
    public COMPONET.ComboBoxSuggestion filtroComboTutor;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JScrollPane jScrollPane1;
    public COMPONET.Panel panel1;
    public COMPONET.Panel panel10;
    public COMPONET.Panel panel11;
    public COMPONET.Panel panel13;
    public COMPONET.Panel panel14;
    public COMPONET.Panel panel15;
    public COMPONET.Panel panel16;
    public COMPONET.Panel panel17;
    public COMPONET.Panel panel18;
    public COMPONET.Panel panel2;
    public COMPONET.Panel panel3;
    public COMPONET.Panel panel7;
    public COMPONET.Panel panel8;
    public COMPONET.Panel panel9;
    public COMPONET.Tabla tablaSecciones;
    // End of variables declaration//GEN-END:variables
}
