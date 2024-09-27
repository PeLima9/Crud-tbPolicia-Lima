
package Vista;

import Controlador.ctrlPolicia;
import Modelo.Policia;

public class FrmPolicia extends javax.swing.JFrame {

    public FrmPolicia() {
        initComponents();
    }
    
    public static void initFrmPolicia(){
        Policia Modelo = new Policia();
        FrmPolicia Vista = new FrmPolicia();
        ctrlPolicia Controlador = new ctrlPolicia(Vista, Modelo);
        
        Vista.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbPolicia = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(22, 66, 91));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpHeader.setBackground(new java.awt.Color(47, 102, 144));

        jLabel1.setFont(new java.awt.Font("Montserrat Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(217, 220, 214));
        jLabel1.setText("Crud tbPolicia Lima");

        javax.swing.GroupLayout jpHeaderLayout = new javax.swing.GroupLayout(jpHeader);
        jpHeader.setLayout(jpHeaderLayout);
        jpHeaderLayout.setHorizontalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHeaderLayout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel1)
                .addContainerGap(307, Short.MAX_VALUE))
        );
        jpHeaderLayout.setVerticalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jpHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 70));

        jLabel2.setFont(new java.awt.Font("Montserrat Black", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(217, 220, 214));
        jLabel2.setText("Correo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 100, 30));

        jLabel3.setFont(new java.awt.Font("Montserrat Black", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(217, 220, 214));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 30));

        jLabel4.setFont(new java.awt.Font("Montserrat Black", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(217, 220, 214));
        jLabel4.setText("Edad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, 30));

        jLabel5.setFont(new java.awt.Font("Montserrat Black", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(217, 220, 214));
        jLabel5.setText("Peso(KG):");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, 30));

        txtCorreo.setBackground(new java.awt.Color(22, 66, 91));
        txtCorreo.setFont(new java.awt.Font("Montserrat Black", 0, 16)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(217, 220, 214));
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 195, 215)));
        txtCorreo.setCaretColor(new java.awt.Color(217, 220, 214));
        txtCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 270, 40));

        txtNombre.setBackground(new java.awt.Color(22, 66, 91));
        txtNombre.setFont(new java.awt.Font("Montserrat Black", 0, 16)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(217, 220, 214));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 195, 215)));
        txtNombre.setCaretColor(new java.awt.Color(217, 220, 214));
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, 40));

        txtEdad.setBackground(new java.awt.Color(22, 66, 91));
        txtEdad.setFont(new java.awt.Font("Montserrat Black", 0, 16)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(217, 220, 214));
        txtEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 195, 215)));
        txtEdad.setCaretColor(new java.awt.Color(217, 220, 214));
        txtEdad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 270, 40));

        txtPeso.setBackground(new java.awt.Color(22, 66, 91));
        txtPeso.setFont(new java.awt.Font("Montserrat Black", 0, 16)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(217, 220, 214));
        txtPeso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 195, 215)));
        txtPeso.setCaretColor(new java.awt.Color(217, 220, 214));
        txtPeso.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 270, 40));

        btnUpdate.setBackground(new java.awt.Color(22, 66, 91));
        btnUpdate.setFont(new java.awt.Font("Montserrat Black", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(129, 195, 215));
        btnUpdate.setText("Editar");
        btnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 195, 215)));
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 180, 40));

        btnAdd.setBackground(new java.awt.Color(22, 66, 91));
        btnAdd.setFont(new java.awt.Font("Montserrat Black", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(129, 195, 215));
        btnAdd.setText("Guardar");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 195, 215)));
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 180, 40));

        btnClear.setBackground(new java.awt.Color(22, 66, 91));
        btnClear.setFont(new java.awt.Font("Montserrat Black", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(129, 195, 215));
        btnClear.setText("Limpiar Campos");
        btnClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 195, 215)));
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 180, 40));

        btnDelete.setBackground(new java.awt.Color(22, 66, 91));
        btnDelete.setFont(new java.awt.Font("Montserrat Black", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(129, 195, 215));
        btnDelete.setText("Eliminar");
        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 195, 215)));
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 180, 40));

        jtbPolicia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtbPolicia);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 540, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                initFrmPolicia();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAdd;
    public javax.swing.JButton btnClear;
    public javax.swing.JButton btnDelete;
    public javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpHeader;
    public javax.swing.JTable jtbPolicia;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtEdad;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
