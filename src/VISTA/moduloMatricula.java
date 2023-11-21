package VISTA;

import CONTROLADOR.ControladorMatricula;
import MODELO.Proceso;
import java.awt.Color;

public class moduloMatricula extends javax.swing.JPanel {

    ControladorMatricula controlador;

    public moduloMatricula() {
        initComponents();
        controlador = new ControladorMatricula(this);
        controlador.initDiseño();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMatricula = new COMPONET.Tabla();
        jLabel1 = new javax.swing.JLabel();
        panel1 = new COMPONET.Panel();
        panel13 = new COMPONET.Panel();
        jLabel13 = new javax.swing.JLabel();
        comboAlumno = new COMPONET.ComboBoxSuggestion();
        panel14 = new COMPONET.Panel();
        jLabel14 = new javax.swing.JLabel();
        comboSeccion = new COMPONET.ComboBoxSuggestion();
        panel15 = new COMPONET.Panel();
        jLabel15 = new javax.swing.JLabel();
        comboPagado = new COMPONET.ComboBoxSuggestion();
        panel16 = new COMPONET.Panel();
        btnEliminar = new COMPONET.Button();
        panel18 = new COMPONET.Panel();
        btnRegistrar = new COMPONET.Button();
        btnModificar = new COMPONET.Button();
        btnModificar1 = new COMPONET.Button();
        panel2 = new COMPONET.Panel();
        jPanel1 = new javax.swing.JPanel();
        txtMatricula = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtAlumno = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtApoderado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtGrado = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtSeccion = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtNivel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 50, 70));

        tablaMatricula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idMatricula", "Alumno", "Seccion", "Pagado", "fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMatricula.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaMatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMatriculaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaMatricula);
        jScrollPane1.getViewport().setBackground(new Color(255, 255, 255));
        if (tablaMatricula.getColumnModel().getColumnCount() > 0) {
            tablaMatricula.getColumnModel().getColumn(0).setResizable(false);
            tablaMatricula.getColumnModel().getColumn(1).setResizable(false);
            tablaMatricula.getColumnModel().getColumn(2).setResizable(false);
            tablaMatricula.getColumnModel().getColumn(3).setResizable(false);
            tablaMatricula.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Century", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MATRICULA");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setRoundBottomLeft(20);
        panel1.setRoundBottomRight(20);
        panel1.setRoundTopLeft(20);
        panel1.setRoundTopRight(20);

        panel13.setBackground(new java.awt.Color(255, 255, 255));
        panel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel13.setText("Alumno");
        panel13.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        comboAlumno.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        comboAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAlumnoActionPerformed(evt);
            }
        });
        panel13.add(comboAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        panel14.setBackground(new java.awt.Color(255, 255, 255));
        panel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel14.setText("Seccion");
        panel14.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        comboSeccion.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        comboSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSeccionActionPerformed(evt);
            }
        });
        panel14.add(comboSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        panel15.setBackground(new java.awt.Color(255, 255, 255));
        panel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel15.setText("Pagado");
        panel15.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 137, -1));

        comboPagado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "si", "no" }));
        comboPagado.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        panel15.add(comboPagado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        panel16.setBackground(new java.awt.Color(255, 255, 255));
        panel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminar.setBackground(new java.awt.Color(255, 255, 55));
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Limpiar");
        btnEliminar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnEliminar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panel16.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, -1));

        panel18.setBackground(new java.awt.Color(255, 255, 255));
        panel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        panel18.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, -1));

        btnModificar.setBackground(new java.awt.Color(255, 255, 55));
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setText("Eliminar");
        btnModificar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnModificar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        panel18.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 110, -1));

        btnModificar1.setBackground(new java.awt.Color(255, 255, 55));
        btnModificar1.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar1.setText("Modificar");
        btnModificar1.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnModificar1.setShadowColor(new java.awt.Color(0, 0, 0));
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });
        panel18.add(btnModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 110, -1));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel15, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel13, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel14, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel16, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel18, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setRoundBottomLeft(20);
        panel2.setRoundBottomRight(20);
        panel2.setRoundTopLeft(20);
        panel2.setRoundTopRight(20);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtMatricula.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtMatricula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMatricula.setText("MATRICULA #00000000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMatricula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(txtMatricula)
                .addGap(22, 22, 22))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtAlumno.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 0, 20)); // NOI18N
        jLabel4.setText("Alumno:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAlumno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtApoderado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 0, 20)); // NOI18N
        jLabel6.setText("Apoderado:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApoderado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        txtGrado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 0, 20)); // NOI18N
        jLabel8.setText("Grado:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        txtSeccion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Century Schoolbook", 0, 20)); // NOI18N
        jLabel10.setText("Seccion:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSeccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        txtNivel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Century Schoolbook", 0, 20)); // NOI18N
        jLabel12.setText("Nivel:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(42, 42, 42)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        controlador.limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        controlador.borrar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        controlador.registrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void comboAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAlumnoActionPerformed
        controlador.setAlumno(Proceso.evitarNulo(comboAlumno.getSelectedItem()));
    }//GEN-LAST:event_comboAlumnoActionPerformed

    private void comboSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSeccionActionPerformed
        controlador.setGradoNivel(Proceso.evitarNulo(comboSeccion.getSelectedItem()));
    }//GEN-LAST:event_comboSeccionActionPerformed

    private void tablaMatriculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMatriculaMouseClicked
        controlador.tablaMatriculaMouseClicked();
    }//GEN-LAST:event_tablaMatriculaMouseClicked

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
        controlador.modificar();
    }//GEN-LAST:event_btnModificar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public COMPONET.Button btnEliminar;
    public COMPONET.Button btnModificar;
    public COMPONET.Button btnModificar1;
    public COMPONET.Button btnRegistrar;
    public COMPONET.ComboBoxSuggestion comboAlumno;
    public COMPONET.ComboBoxSuggestion comboPagado;
    public COMPONET.ComboBoxSuggestion comboSeccion;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanel6;
    public javax.swing.JScrollPane jScrollPane1;
    public COMPONET.Panel panel1;
    public COMPONET.Panel panel13;
    public COMPONET.Panel panel14;
    public COMPONET.Panel panel15;
    public COMPONET.Panel panel16;
    public COMPONET.Panel panel18;
    public COMPONET.Panel panel2;
    public COMPONET.Tabla tablaMatricula;
    public javax.swing.JLabel txtAlumno;
    public javax.swing.JLabel txtApoderado;
    public javax.swing.JLabel txtGrado;
    public javax.swing.JLabel txtMatricula;
    public javax.swing.JLabel txtNivel;
    public javax.swing.JLabel txtSeccion;
    // End of variables declaration//GEN-END:variables
}
