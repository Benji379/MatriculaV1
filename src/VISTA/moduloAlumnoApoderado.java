package VISTA;

import CONTROLADOR.ControladorAlumno;
import CONTROLADOR.ControladorApoderado;
import MODELO.Proceso;
import java.awt.Color;

public class moduloAlumnoApoderado extends javax.swing.JPanel {

    ControladorAlumno controladorAlumno;
    ControladorApoderado controladorApoderado;

    public moduloAlumnoApoderado() {
        initComponents();
        controladorAlumno = new ControladorAlumno(this);
        controladorApoderado = new ControladorApoderado(this);

        controladorAlumno.initDiseño();
        controladorApoderado.initDiseño();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alumno_Modulo = new COMPONET.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumno = new COMPONET.Tabla();
        panel3 = new COMPONET.Panel();
        jLabel4 = new javax.swing.JLabel();
        alumno_txtDni = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        panel4 = new COMPONET.Panel();
        jLabel5 = new javax.swing.JLabel();
        alumno_txtNombre = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        panel5 = new COMPONET.Panel();
        jLabel6 = new javax.swing.JLabel();
        alumno_txtApellido = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        panel6 = new COMPONET.Panel();
        jLabel7 = new javax.swing.JLabel();
        alumno_comboApoderado = new COMPONET.Combobox();
        panel7 = new COMPONET.Panel();
        panel9 = new COMPONET.Panel();
        alumno_btnBorrar = new COMPONET.Button();
        panel8 = new COMPONET.Panel();
        alumno_btnLimpiar = new COMPONET.Button();
        alumno_btnRegistrar = new COMPONET.Button();
        alumno_btnEditar = new COMPONET.Button();
        jLabel1 = new javax.swing.JLabel();
        apoderado_Modulo = new COMPONET.Panel();
        panel11 = new COMPONET.Panel();
        jLabel8 = new javax.swing.JLabel();
        apoderado_txtDni = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        panel12 = new COMPONET.Panel();
        jLabel9 = new javax.swing.JLabel();
        apoderado_txtTelefono = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        panel13 = new COMPONET.Panel();
        jLabel10 = new javax.swing.JLabel();
        apoderado_txtNombre = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        panel14 = new COMPONET.Panel();
        jLabel11 = new javax.swing.JLabel();
        apoderado_txtApellido = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        apoderado_btnRegistrar = new COMPONET.Button();
        apoderado_btnBorrar = new COMPONET.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaApoderado = new COMPONET.Tabla();
        apoderado_btnExportar = new COMPONET.Button();
        apoderado_btnLimpiar = new COMPONET.Button();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 50, 70));

        alumno_Modulo.setBackground(new java.awt.Color(255, 255, 255));
        alumno_Modulo.setRoundBottomLeft(20);
        alumno_Modulo.setRoundBottomRight(20);
        alumno_Modulo.setRoundTopLeft(20);
        alumno_Modulo.setRoundTopRight(20);

        tablaAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Dni", "Nombre", "Apellido", "Apoderado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlumnoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAlumno);
        jScrollPane1.getViewport().setBackground(new Color(255, 255, 255));

        panel3.setBackground(new java.awt.Color(255, 255, 255));
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel4.setText("Dni");
        panel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        alumno_txtDni.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        alumno_txtDni.setSelectionColor(new java.awt.Color(0, 44, 73));
        alumno_txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                alumno_txtDniKeyTyped(evt);
            }
        });
        panel3.add(alumno_txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 30));
        panel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 10));

        panel4.setBackground(new java.awt.Color(255, 255, 255));
        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel5.setText("Nombre");
        panel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        alumno_txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        alumno_txtNombre.setSelectionColor(new java.awt.Color(0, 44, 73));
        panel4.add(alumno_txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 30));
        panel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 10));

        panel5.setBackground(new java.awt.Color(255, 255, 255));
        panel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel6.setText("Apellido");
        panel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        alumno_txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        alumno_txtApellido.setSelectionColor(new java.awt.Color(0, 44, 73));
        panel5.add(alumno_txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 30));
        panel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 10));

        panel6.setBackground(new java.awt.Color(255, 255, 255));
        panel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel7.setText("Apoderado");
        panel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        alumno_comboApoderado.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        alumno_comboApoderado.setLabeText("");
        panel6.add(alumno_comboApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 140, 40));

        panel7.setBackground(new java.awt.Color(255, 255, 255));
        panel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel9.setBackground(new java.awt.Color(255, 255, 255));
        panel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        alumno_btnBorrar.setBackground(new java.awt.Color(255, 255, 55));
        alumno_btnBorrar.setForeground(new java.awt.Color(0, 0, 0));
        alumno_btnBorrar.setText("Borrar");
        alumno_btnBorrar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alumno_btnBorrar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        alumno_btnBorrar.setShadowColor(new java.awt.Color(0, 0, 0));
        alumno_btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumno_btnBorrarActionPerformed(evt);
            }
        });
        panel9.add(alumno_btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 50));

        panel7.add(panel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 189, 97));

        panel8.setBackground(new java.awt.Color(255, 255, 255));
        panel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        alumno_btnLimpiar.setBackground(new java.awt.Color(255, 255, 55));
        alumno_btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        alumno_btnLimpiar.setText("Limpiar");
        alumno_btnLimpiar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alumno_btnLimpiar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        alumno_btnLimpiar.setShadowColor(new java.awt.Color(0, 0, 0));
        alumno_btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumno_btnLimpiarActionPerformed(evt);
            }
        });
        panel8.add(alumno_btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 50));

        alumno_btnRegistrar.setBackground(new java.awt.Color(255, 255, 55));
        alumno_btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        alumno_btnRegistrar.setText("Registrar");
        alumno_btnRegistrar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alumno_btnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        alumno_btnRegistrar.setShadowColor(new java.awt.Color(0, 0, 0));
        alumno_btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumno_btnRegistrarActionPerformed(evt);
            }
        });

        alumno_btnEditar.setBackground(new java.awt.Color(255, 255, 55));
        alumno_btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        alumno_btnEditar.setText("Editar");
        alumno_btnEditar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alumno_btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        alumno_btnEditar.setShadowColor(new java.awt.Color(0, 0, 0));
        alumno_btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumno_btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout alumno_ModuloLayout = new javax.swing.GroupLayout(alumno_Modulo);
        alumno_Modulo.setLayout(alumno_ModuloLayout);
        alumno_ModuloLayout.setHorizontalGroup(
            alumno_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alumno_ModuloLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(alumno_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(alumno_ModuloLayout.createSequentialGroup()
                        .addGroup(alumno_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                            .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(alumno_ModuloLayout.createSequentialGroup()
                        .addGroup(alumno_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alumno_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(panel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                .addComponent(panel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(alumno_ModuloLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(alumno_btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(alumno_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alumno_ModuloLayout.createSequentialGroup()
                                .addGroup(alumno_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alumno_ModuloLayout.createSequentialGroup()
                                .addComponent(alumno_btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78))))))
        );
        alumno_ModuloLayout.setVerticalGroup(
            alumno_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alumno_ModuloLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(alumno_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(alumno_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(alumno_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alumno_ModuloLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(alumno_ModuloLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(alumno_btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(alumno_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alumno_ModuloLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panel8, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(alumno_ModuloLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(alumno_btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        jLabel1.setFont(new java.awt.Font("Century", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Apoderado");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        apoderado_Modulo.setBackground(new java.awt.Color(255, 255, 255));
        apoderado_Modulo.setRoundBottomLeft(20);
        apoderado_Modulo.setRoundBottomRight(20);
        apoderado_Modulo.setRoundTopLeft(20);
        apoderado_Modulo.setRoundTopRight(20);

        panel11.setBackground(new java.awt.Color(255, 255, 255));
        panel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel8.setText("Dni");
        panel11.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        apoderado_txtDni.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        apoderado_txtDni.setSelectionColor(new java.awt.Color(0, 44, 73));
        apoderado_txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apoderado_txtDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apoderado_txtDniKeyTyped(evt);
            }
        });
        panel11.add(apoderado_txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 30));
        panel11.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 10));

        panel12.setBackground(new java.awt.Color(255, 255, 255));
        panel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel9.setText("Telefono");
        panel12.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 137, -1));

        apoderado_txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        apoderado_txtTelefono.setSelectionColor(new java.awt.Color(0, 44, 73));
        apoderado_txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apoderado_txtTelefonoKeyTyped(evt);
            }
        });
        panel12.add(apoderado_txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 30));
        panel12.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 10));

        panel13.setBackground(new java.awt.Color(255, 255, 255));
        panel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel10.setText("Nombre");
        panel13.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        apoderado_txtNombre.setEditable(false);
        apoderado_txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        apoderado_txtNombre.setSelectionColor(new java.awt.Color(0, 44, 73));
        panel13.add(apoderado_txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 30));
        panel13.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 10));

        panel14.setBackground(new java.awt.Color(255, 255, 255));
        panel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel11.setText("Apellido");
        panel14.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        apoderado_txtApellido.setEditable(false);
        apoderado_txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        apoderado_txtApellido.setSelectionColor(new java.awt.Color(0, 44, 73));
        panel14.add(apoderado_txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 30));
        panel14.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 10));

        apoderado_btnRegistrar.setBackground(new java.awt.Color(255, 255, 55));
        apoderado_btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        apoderado_btnRegistrar.setText("Registrar");
        apoderado_btnRegistrar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        apoderado_btnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        apoderado_btnRegistrar.setShadowColor(new java.awt.Color(0, 0, 0));
        apoderado_btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apoderado_btnRegistrarActionPerformed(evt);
            }
        });

        apoderado_btnBorrar.setBackground(new java.awt.Color(255, 255, 55));
        apoderado_btnBorrar.setForeground(new java.awt.Color(0, 0, 0));
        apoderado_btnBorrar.setText("Borrar");
        apoderado_btnBorrar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        apoderado_btnBorrar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        apoderado_btnBorrar.setShadowColor(new java.awt.Color(0, 0, 0));
        apoderado_btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apoderado_btnBorrarActionPerformed(evt);
            }
        });

        tablaApoderado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Dni", "Nombre", "Apellido", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaApoderado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaApoderadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaApoderado);
        jScrollPane2.getViewport().setBackground(new Color(255, 255, 255));

        apoderado_btnExportar.setBackground(new java.awt.Color(255, 255, 55));
        apoderado_btnExportar.setForeground(new java.awt.Color(0, 0, 0));
        apoderado_btnExportar.setText("Exportar");
        apoderado_btnExportar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        apoderado_btnExportar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        apoderado_btnExportar.setShadowColor(new java.awt.Color(0, 0, 0));
        apoderado_btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apoderado_btnExportarActionPerformed(evt);
            }
        });

        apoderado_btnLimpiar.setBackground(new java.awt.Color(255, 255, 55));
        apoderado_btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        apoderado_btnLimpiar.setText("Limpiar");
        apoderado_btnLimpiar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        apoderado_btnLimpiar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        apoderado_btnLimpiar.setShadowColor(new java.awt.Color(0, 0, 0));
        apoderado_btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apoderado_btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout apoderado_ModuloLayout = new javax.swing.GroupLayout(apoderado_Modulo);
        apoderado_Modulo.setLayout(apoderado_ModuloLayout);
        apoderado_ModuloLayout.setHorizontalGroup(
            apoderado_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(apoderado_ModuloLayout.createSequentialGroup()
                .addGroup(apoderado_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(apoderado_ModuloLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(apoderado_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel13, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel11, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(apoderado_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel14, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(apoderado_ModuloLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, apoderado_ModuloLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(apoderado_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(apoderado_ModuloLayout.createSequentialGroup()
                        .addComponent(apoderado_btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(apoderado_btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(apoderado_ModuloLayout.createSequentialGroup()
                        .addComponent(apoderado_btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(apoderado_btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        apoderado_ModuloLayout.setVerticalGroup(
            apoderado_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(apoderado_ModuloLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(apoderado_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(apoderado_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(apoderado_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apoderado_btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apoderado_btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(apoderado_ModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apoderado_btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apoderado_btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        jLabel2.setFont(new java.awt.Font("Century", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alumno");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alumno_Modulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apoderado_Modulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apoderado_Modulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alumno_Modulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void alumno_txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alumno_txtDniKeyTyped
        Proceso.limitacionNumeros(alumno_txtDni, evt, 8);
    }//GEN-LAST:event_alumno_txtDniKeyTyped

    private void alumno_btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumno_btnLimpiarActionPerformed
        controladorAlumno.limpiar();
    }//GEN-LAST:event_alumno_btnLimpiarActionPerformed

    private void alumno_btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumno_btnRegistrarActionPerformed
        controladorAlumno.registrar();
    }//GEN-LAST:event_alumno_btnRegistrarActionPerformed

    private void alumno_btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumno_btnBorrarActionPerformed
        controladorAlumno.eliminar();
    }//GEN-LAST:event_alumno_btnBorrarActionPerformed

    private void apoderado_btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apoderado_btnRegistrarActionPerformed
        controladorApoderado.registrar();
    }//GEN-LAST:event_apoderado_btnRegistrarActionPerformed

    private void apoderado_btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apoderado_btnBorrarActionPerformed
        controladorApoderado.borrar();
    }//GEN-LAST:event_apoderado_btnBorrarActionPerformed

    private void apoderado_btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apoderado_btnExportarActionPerformed
        controladorApoderado.exportar();
    }//GEN-LAST:event_apoderado_btnExportarActionPerformed

    private void apoderado_btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apoderado_btnLimpiarActionPerformed
        controladorApoderado.limpiar();
    }//GEN-LAST:event_apoderado_btnLimpiarActionPerformed

    private void tablaAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlumnoMouseClicked
        controladorAlumno.tablaAlumnoMouseClicked();
    }//GEN-LAST:event_tablaAlumnoMouseClicked

    private void alumno_btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumno_btnEditarActionPerformed
        controladorAlumno.modificar();
    }//GEN-LAST:event_alumno_btnEditarActionPerformed

    private void apoderado_txtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apoderado_txtDniKeyReleased
        controladorApoderado.txtDniKeyReleased(evt);
    }//GEN-LAST:event_apoderado_txtDniKeyReleased

    private void tablaApoderadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaApoderadoMouseClicked
        controladorApoderado.tablaApoderadoMouseClicked();
    }//GEN-LAST:event_tablaApoderadoMouseClicked

    private void apoderado_txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apoderado_txtDniKeyTyped
        Proceso.limitacionNumeros(apoderado_txtDni, evt, 8);
    }//GEN-LAST:event_apoderado_txtDniKeyTyped

    private void apoderado_txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apoderado_txtTelefonoKeyTyped
        Proceso.limitacionNumeros(apoderado_txtTelefono, evt, 9);
    }//GEN-LAST:event_apoderado_txtTelefonoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public COMPONET.Panel alumno_Modulo;
    public COMPONET.Button alumno_btnBorrar;
    public COMPONET.Button alumno_btnEditar;
    public COMPONET.Button alumno_btnLimpiar;
    public COMPONET.Button alumno_btnRegistrar;
    public COMPONET.Combobox alumno_comboApoderado;
    public javax.swing.JTextField alumno_txtApellido;
    public javax.swing.JTextField alumno_txtDni;
    public javax.swing.JTextField alumno_txtNombre;
    public COMPONET.Panel apoderado_Modulo;
    public COMPONET.Button apoderado_btnBorrar;
    public COMPONET.Button apoderado_btnExportar;
    public COMPONET.Button apoderado_btnLimpiar;
    public COMPONET.Button apoderado_btnRegistrar;
    public javax.swing.JTextField apoderado_txtApellido;
    public javax.swing.JTextField apoderado_txtDni;
    public javax.swing.JTextField apoderado_txtNombre;
    public javax.swing.JTextField apoderado_txtTelefono;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JSeparator jSeparator2;
    public javax.swing.JSeparator jSeparator3;
    public javax.swing.JSeparator jSeparator4;
    public javax.swing.JSeparator jSeparator5;
    public javax.swing.JSeparator jSeparator6;
    public javax.swing.JSeparator jSeparator7;
    public javax.swing.JSeparator jSeparator8;
    public COMPONET.Panel panel11;
    public COMPONET.Panel panel12;
    public COMPONET.Panel panel13;
    public COMPONET.Panel panel14;
    public COMPONET.Panel panel3;
    public COMPONET.Panel panel4;
    public COMPONET.Panel panel5;
    public COMPONET.Panel panel6;
    public COMPONET.Panel panel7;
    public COMPONET.Panel panel8;
    public COMPONET.Panel panel9;
    public COMPONET.Tabla tablaAlumno;
    public COMPONET.Tabla tablaApoderado;
    // End of variables declaration//GEN-END:variables
}
