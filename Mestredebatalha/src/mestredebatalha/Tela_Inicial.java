/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mestredebatalha;


/**
 *
 * @author Mariana Brito
 */
public class Tela_Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Inicial
     */
    public Tela_Inicial() {
        initComponents();
        setSize(1000,800);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sairbotao2 = new javax.swing.JButton();
        Jogarbotao1 = new javax.swing.JButton();
        Backgroundlabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Sairbotao2.setBackground(new java.awt.Color(153, 153, 255));
        Sairbotao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mestredebatalha/sair.png"))); // NOI18N
        Sairbotao2.setToolTipText("");
        Sairbotao2.setBorder(null);
        Sairbotao2.setBorderPainted(false);
        Sairbotao2.setContentAreaFilled(false);
        Sairbotao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sairbotao2ActionPerformed(evt);
            }
        });
        getContentPane().add(Sairbotao2);
        Sairbotao2.setBounds(570, 600, 160, 40);

        Jogarbotao1.setBackground(new java.awt.Color(153, 153, 153));
        Jogarbotao1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mestredebatalha/jogar.png"))); // NOI18N
        Jogarbotao1.setToolTipText("");
        Jogarbotao1.setBorder(null);
        Jogarbotao1.setBorderPainted(false);
        Jogarbotao1.setContentAreaFilled(false);
        Jogarbotao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jogarbotao1ActionPerformed(evt);
            }
        });
        getContentPane().add(Jogarbotao1);
        Jogarbotao1.setBounds(230, 600, 160, 40);

        Backgroundlabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mestredebatalha/Backgroundcompleto.png"))); // NOI18N
        getContentPane().add(Backgroundlabel1);
        Backgroundlabel1.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Sairbotao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sairbotao2ActionPerformed
       
    }//GEN-LAST:event_Sairbotao2ActionPerformed

    private void Jogarbotao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jogarbotao1ActionPerformed
         new Modo_de_jogo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Jogarbotao1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Inicial().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backgroundlabel1;
    private javax.swing.JButton Jogarbotao1;
    private javax.swing.JButton Sairbotao2;
    // End of variables declaration//GEN-END:variables
}
