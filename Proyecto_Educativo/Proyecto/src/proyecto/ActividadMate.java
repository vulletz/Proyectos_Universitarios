/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ActividadMate extends javax.swing.JFrame {

    /** Creates new form Actividad */
    public ActividadMate() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelEcuacion = new javax.swing.JLabel();
        labelCont = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 730));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacio.png"))); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton1.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton1.setPreferredSize(new java.awt.Dimension(110, 140));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 100, 140));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacio.png"))); // NOI18N
        jButton2.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton2.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton2.setPreferredSize(new java.awt.Dimension(110, 140));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 100, 140));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacio.png"))); // NOI18N
        jButton3.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton3.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton3.setPreferredSize(new java.awt.Dimension(110, 140));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 100, 140));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacio.png"))); // NOI18N
        jButton4.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton4.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton4.setPreferredSize(new java.awt.Dimension(110, 140));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 100, 140));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacio.png"))); // NOI18N
        jButton5.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton5.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton5.setPreferredSize(new java.awt.Dimension(110, 140));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 100, 140));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacio.png"))); // NOI18N
        jButton6.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton6.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton6.setPreferredSize(new java.awt.Dimension(110, 140));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 100, 140));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacio.png"))); // NOI18N
        jButton7.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton7.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton7.setPreferredSize(new java.awt.Dimension(110, 140));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 100, 140));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacio.png"))); // NOI18N
        jButton8.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton8.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton8.setPreferredSize(new java.awt.Dimension(110, 140));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 100, 140));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacio.png"))); // NOI18N
        jButton9.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton9.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton9.setPreferredSize(new java.awt.Dimension(110, 140));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 100, 140));

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseClicked(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Intentos Restantes: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, -1));

        labelEcuacion.setFont(new java.awt.Font("Gill Sans MT", 0, 56)); // NOI18N
        labelEcuacion.setForeground(new java.awt.Color(0, 0, 0));
        labelEcuacion.setText("a");
        getContentPane().add(labelEcuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        labelCont.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        labelCont.setForeground(new java.awt.Color(0, 0, 0));
        labelCont.setText("3");
        getContentPane().add(labelCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 50, 60));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo3.png"))); // NOI18N
        labelFondo.setText("jLabel1");
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int opera, puntuacion=0;
    ArrayList <String> operaciones = new ArrayList<>();
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        //  1/4
        operaciones.add("1/2 - 1/4");                   // 0
        operaciones.add("6/12 x 8/16");                 // 1
        operaciones.add("1/8 ÷ 1/2");                   // 2
        
        //  1/16
        operaciones.add("6/192 + 8/256");               // 3    
        operaciones.add("5/20 x 7/28");                 // 4
        operaciones.add("1/32 ÷ 6/12");                 // 5
        
        //  1/2
        operaciones.add("5/20 + 7/28");                 // 6
        operaciones.add("2/4 x 7/7");                   // 7
        operaciones.add("1/10 ÷ 1/5");                  // 8
        
        //  1/9
        operaciones.add("2/6 - 1/9");                   // 9
        operaciones.add("1/3 x 1/3");                   // 10
        operaciones.add("1/18 ÷ 5/10");                 // 11
        
        //  1/8
        operaciones.add("10/40 - 9/72");                // 12
        operaciones.add("1/4 x 1/2");                   // 13
        operaciones.add("1/16 ÷ 9/18");                 // 14
        
        //  1/5
        operaciones.add("1/10 + 5/50");                 //15 
        operaciones.add("10/10 x 1/5");                 //16
        operaciones.add("1/10 ÷ 1/2");                  //17
        
        //  1/7
        operaciones.add("8/112 + 1/14");                //18
        operaciones.add("70/70 x 2/14");                //19
        operaciones.add("1/14 ÷ 15/30");                //20
        
        //  1/3
        operaciones.add("2/3 - 4/12");                  //21
        operaciones.add("4/4 x 6/18");                  //22
        operaciones.add("1/6 ÷ 1/2");                   //23
        
        //  1/36
        operaciones.add("2/36 - 5/180");                //24
        operaciones.add("1/4 x 1/9");                   //25
        operaciones.add("1/144 ÷ 6/24");                //26
        
        int ran = (int) (Math.random()*26);
        opera = ran;
        labelEcuacion.setText(operaciones.get(opera));
    }//GEN-LAST:event_formWindowOpened

    int contador=3;
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(contador >= 1){
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UnCuarto.png")));
            contador -= 1;
            labelCont.setText(Integer.toString(contador));
            
            if(opera == 0 ||opera == 1 ||opera == 2){
                puntuacion += 1;
                JOptionPane.showMessageDialog(null, "Encontro el valor correcto\nPulse el boton de siguiente para continuar","Felicidades", JOptionPane.INFORMATION_MESSAGE);
                
                contador=0;
                labelCont.setText(Integer.toString(contador));
            }
        }
        else if(contador < 1){
            JOptionPane.showMessageDialog(null, "Disculpe, pero se quedo sin oportunidades\nPulse el boton de siguiente","Problematica", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        
        if(contador >= 1){
            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UnDeciseisavo.png")));
            contador -= 1;
            labelCont.setText(Integer.toString(contador));
            
            if(opera == 3 ||opera == 4 ||opera == 5){
                puntuacion += 1;
                JOptionPane.showMessageDialog(null, "Encontro el valor correcto\nPulse el boton de siguiente para continuar","Felicidades", JOptionPane.INFORMATION_MESSAGE);
                
                contador=0;
                labelCont.setText(Integer.toString(contador));
            }
        }
        else if(contador < 1){
            JOptionPane.showMessageDialog(null, "Disculpe, pero se quedo sin oportunidades\nPulse el boton de siguiente","Problematica", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        
        if(contador >= 1){
            jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UnMedio.png")));
            contador -= 1;
            labelCont.setText(Integer.toString(contador));
            
            if(opera == 6 ||opera == 7 ||opera == 8){
                puntuacion += 1;
                JOptionPane.showMessageDialog(null, "Encontro el valor correcto\nPulse el boton de siguiente para continuar","Felicidades", JOptionPane.INFORMATION_MESSAGE);
                
                contador=0;
                labelCont.setText(Integer.toString(contador));
            }
        }
        else if(contador < 1){
            JOptionPane.showMessageDialog(null, "Disculpe, pero se quedo sin oportunidades\nPulse el boton de siguiente","Problematica", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        
        if(contador >= 1){
            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UnNoveno.png")));
            contador -= 1;
            labelCont.setText(Integer.toString(contador));
            
            if(opera == 9 ||opera == 10 ||opera == 11){
                puntuacion += 1;
                JOptionPane.showMessageDialog(null, "Encontro el valor correcto\nPulse el boton de siguiente para continuar","Felicidades", JOptionPane.INFORMATION_MESSAGE);
                
                contador=0;
                labelCont.setText(Integer.toString(contador));
            }
        }
        else if(contador < 1){
            JOptionPane.showMessageDialog(null, "Disculpe, pero se quedo sin oportunidades\nPulse el boton de siguiente","Problematica", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        
        if(contador >= 1){
            jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UnOctavo.png")));
            contador -= 1;
            labelCont.setText(Integer.toString(contador));
            
            if(opera == 12 ||opera == 13 ||opera == 14){
                puntuacion += 1;
                JOptionPane.showMessageDialog(null, "Encontro el valor correcto\nPulse el boton de siguiente para continuar","Felicidades", JOptionPane.INFORMATION_MESSAGE);
                
                contador=0;
                labelCont.setText(Integer.toString(contador));
            }
        }
        else if(contador < 1){
            JOptionPane.showMessageDialog(null, "Disculpe, pero se quedo sin oportunidades\nPulse el boton de siguiente","Problematica", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        
        if(contador >= 1){
            jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UnQuinto.png")));
            contador -= 1;
            labelCont.setText(Integer.toString(contador));
            
            if(opera == 15||opera == 16 ||opera == 17){
                puntuacion += 1;
                JOptionPane.showMessageDialog(null, "Encontro el valor correcto\nPulse el boton de siguiente para continuar","Felicidades", JOptionPane.INFORMATION_MESSAGE);
                
                contador=0;
                labelCont.setText(Integer.toString(contador));
            }
        }
        else if(contador < 1){
            JOptionPane.showMessageDialog(null, "Disculpe, pero se quedo sin oportunidades\nPulse el boton de siguiente","Problematica", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        
        if(contador >= 1){
            jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UnSeptimo.png")));
            contador -= 1;
            labelCont.setText(Integer.toString(contador));
            
            if(opera == 18 ||opera == 19 ||opera == 20){
                puntuacion += 1;
                JOptionPane.showMessageDialog(null, "Encontro el valor correcto\nPulse el boton de siguiente para continuar","Felicidades", JOptionPane.INFORMATION_MESSAGE);
                
                contador=0;
                labelCont.setText(Integer.toString(contador));
            }
        }
        else if(contador < 1){
            JOptionPane.showMessageDialog(null, "Disculpe, pero se quedo sin oportunidades\nPulse el boton de siguiente","Problematica", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        
        if(contador >= 1){
            jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UnTercio.png")));
            contador -= 1;
            labelCont.setText(Integer.toString(contador));
            
            if(opera == 21 ||opera == 22 ||opera == 23){
                puntuacion += 1;
                JOptionPane.showMessageDialog(null, "Encontro el valor correcto\nPulse el boton de siguiente para continuar","Felicidades", JOptionPane.INFORMATION_MESSAGE);
                
                contador=0;
                labelCont.setText(Integer.toString(contador));
            }
        }
        else if(contador < 1){
            JOptionPane.showMessageDialog(null, "Disculpe, pero se quedo sin oportunidades\nPulse el boton de siguiente","Problematica", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
        
        if(contador >= 1){
            jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UnTreintaseisavo.png")));
            contador -= 1;
            labelCont.setText(Integer.toString(contador));
            
            if(opera == 24 ||opera == 25 ||opera == 26){
                puntuacion += 1;
                JOptionPane.showMessageDialog(null, "Encontro el valor correcto\nPulse el boton de siguiente para continuar","Felicidades", JOptionPane.INFORMATION_MESSAGE);
                
                contador=0;
                labelCont.setText(Integer.toString(contador));
            }
        }
        else if(contador < 1){
            JOptionPane.showMessageDialog(null, "Disculpe, pero se quedo sin oportunidades\nPulse el boton de siguiente","Problematica", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton9MouseClicked
    
    int cantidad=10;
    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked
        
        if(cantidad >= 1){
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacio.png")));
            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacio.png")));
            jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacio.png")));
            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacio.png")));
            jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacio.png")));
            jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacio.png")));
            jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacio.png")));
            jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacio.png")));
            jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacio.png")));

            int ran = (int) (Math.random()*26);
            opera = ran;
            labelEcuacion.setText(operaciones.get(opera));

            contador = 3;
            labelCont.setText(Integer.toString(contador));
            
            cantidad -=1;
            System.out.println(""+cantidad);
        }
        else if(cantidad <= 0){
            JOptionPane.showMessageDialog(null, "El juego ah terminado\nSu puntuacion fue de "+puntuacion+"/10","Finalizado", JOptionPane.INFORMATION_MESSAGE);
            setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_btnSiguienteMouseClicked

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ActividadMate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActividadMate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActividadMate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActividadMate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActividadMate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelCont;
    private javax.swing.JLabel labelEcuacion;
    private javax.swing.JLabel labelFondo;
    // End of variables declaration//GEN-END:variables

}