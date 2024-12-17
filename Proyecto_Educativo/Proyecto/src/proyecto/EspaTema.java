
package proyecto;

/**
 *
 * @author Yanet abigail
 */
public class EspaTema extends javax.swing.JFrame {

    /**
     * Creates new form EspaTema
     */
    public EspaTema() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tabb = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        verbo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        eqti = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sust = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnRegresa = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(980, 520));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tipos.PNG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Profe.PNG"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, 130, -1));

        tabb.setBackground(new java.awt.Color(255, 255, 255));
        tabb.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verbo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/verbo.PNG"))); // NOI18N
        jPanel2.add(verbo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/verbos.PNG"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/emocion.PNG"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        eqti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/accion.PNG"))); // NOI18N
        eqti.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(eqti, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 140, 160));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/llover.PNG"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 240, 180));

        tabb.addTab("Palabra Verbo", jPanel2);

        sust.setBackground(new java.awt.Color(255, 255, 255));
        sust.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sustantivo.PNG"))); // NOI18N
        sust.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 398, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sus.PNG"))); // NOI18N
        sust.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 60));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/zapa.PNG"))); // NOI18N
        sust.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 250, 140));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nina.PNG"))); // NOI18N
        sust.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flores.PNG"))); // NOI18N
        sust.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        tabb.addTab("Sustantivo", sust);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adjetiv.PNG"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adjrtivos.PNG"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 410, 90));

        jLabel8.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel8.setText("Posesivo");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel9.setText("Calificativo");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        jLabel10.setText("Se usan para decirque sirven para transmitir la pertenencia o posesión de algo.");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, 40));

        jLabel11.setText("Se usan para decir como son las personas o cosas");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/casa.PNG"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 290, 150));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/colores.PNG"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nenmuque.PNG"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));

        tabb.addTab("Adjetivo", jPanel3);

        jPanel1.add(tabb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 770, 390));

        btnRegresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha.PNG"))); // NOI18N
        btnRegresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 90, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresaActionPerformed
        //Regresa al menu Principal
         EspaPort m= new EspaPort();
        m.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_btnRegresaActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresa;
    private javax.swing.JLabel eqti;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel sust;
    private javax.swing.JTabbedPane tabb;
    private javax.swing.JLabel verbo;
    // End of variables declaration//GEN-END:variables
}
