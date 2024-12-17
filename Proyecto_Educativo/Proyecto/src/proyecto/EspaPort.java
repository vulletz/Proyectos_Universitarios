
package proyecto;

/**
 *
 * @author Yanet abigail
 */
public class EspaPort extends javax.swing.JFrame {

    /**
     * Creates new form EspaPort
     */
    public EspaPort() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        idea = new javax.swing.JLabel();
        sutitulo = new javax.swing.JLabel();
        btnTema = new javax.swing.JButton();
        btnPrueba = new javax.swing.JButton();
        libro = new javax.swing.JLabel();
        btnRegresa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 520));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(650, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/espanol.PNG"))); // NOI18N
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        idea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/idea.PNG"))); // NOI18N
        jPanel1.add(idea, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        sutitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tipos.PNG"))); // NOI18N
        jPanel1.add(sutitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        btnTema.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        btnTema.setText("Tema");
        btnTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemaActionPerformed(evt);
            }
        });
        jPanel1.add(btnTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 160, 30));

        btnPrueba.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        btnPrueba.setText("Prueba");
        btnPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPruebaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 160, 30));

        libro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/libro.PNG"))); // NOI18N
        jPanel1.add(libro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        btnRegresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha.PNG"))); // NOI18N
        btnRegresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 80, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemaActionPerformed
      //se llama al el formulario que contiene informacion del tema
        EspaTema tema=new EspaTema();
        tema.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTemaActionPerformed

    private void btnRegresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresaActionPerformed
        //Regresa al menu Principal
        Menu m= new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresaActionPerformed

    private void btnPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPruebaActionPerformed
        //se dirije al form de pruba de español
        Prueba pru= new Prueba();
        pru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPruebaActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrueba;
    private javax.swing.JButton btnRegresa;
    private javax.swing.JButton btnTema;
    private javax.swing.JLabel idea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel libro;
    private javax.swing.JLabel sutitulo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
