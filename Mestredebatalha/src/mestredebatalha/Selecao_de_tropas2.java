/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestredebatalha;

import javax.swing.JOptionPane;

/**
 *
 * @author Mariana Brito
 */
public class Selecao_de_tropas2 extends javax.swing.JFrame {

    /**
     * Creates new form seleção_de_tropas
     */
    public Selecao_de_tropas2() {
        initComponents();
        setSize(900,800);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        brasaop1_img = new javax.swing.JLabel();
        player1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        nome_player1 = new javax.swing.JTextField();
        comandante = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        brasaop1_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mestredebatalha/jogador2.png"))); // NOI18N
        getContentPane().add(brasaop1_img);
        brasaop1_img.setBounds(0, 110, 270, 240);

        player1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mestredebatalha/p2.png"))); // NOI18N
        getContentPane().add(player1);
        player1.setBounds(350, 80, 130, 27);

        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mestredebatalha/escolha_tropa.png"))); // NOI18N
        getContentPane().add(titulo);
        titulo.setBounds(230, 20, 400, 72);

        nome_player1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_player1ActionPerformed(evt);
            }
        });
        getContentPane().add(nome_player1);
        nome_player1.setBounds(110, 370, 130, 30);

        comandante.setFont(new java.awt.Font("Showcard Gothic", 0, 11)); // NOI18N
        comandante.setForeground(new java.awt.Color(255, 255, 255));
        comandante.setText("Comandante:");
        getContentPane().add(comandante);
        comandante.setBounds(20, 370, 80, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mestredebatalha/avançar.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 480, 283, 65);

        Background.setForeground(new java.awt.Color(255, 255, 255));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mestredebatalha/velho.png"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 970, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nome_player1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_player1ActionPerformed
     
    }//GEN-LAST:event_nome_player1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Selecao_de_tropas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selecao_de_tropas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selecao_de_tropas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selecao_de_tropas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selecao_de_tropas2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel brasaop1_img;
    private javax.swing.JLabel comandante;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField nome_player1;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
