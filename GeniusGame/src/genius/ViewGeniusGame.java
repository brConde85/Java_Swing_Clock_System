/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genius;

/**
 *
 * @author bruno
 */
public class ViewGeniusGame extends javax.swing.JFrame {

    /**
     * Creates new form ViewGeniusGame
     */
    public ViewGeniusGame() {
        initComponents();
        lblPhrase.setFont(new java.awt.Font("Comic Sans MS", 0, 26));
        lblPhrase.setText("<html>I'm thinking in one number between <b>1</b> and <b>5</b>.<br/> Try guess this number!<html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblPhrase = new javax.swing.JLabel();
        jsNumber = new javax.swing.JSpinner();
        btnGuess = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Snap ITC", 0, 48)); // NOI18N
        jLabel2.setText("Genius Game");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        lblPhrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblPhrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 340, 250));

        jsNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jsNumber.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(jsNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 720, 69, 36));

        btnGuess.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnGuess.setText("Guess the number");
        btnGuess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuessActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuess, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 790, 279, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Projetos\\Java\\GeniusGame\\src\\images\\genius-lamp-balloon.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 870, 50, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuessActionPerformed
        // TODO add your handling code here:
        int numGenius = (int) (1 + Math.random() * (5-1));
        int numPlayer = Integer.parseInt(jsNumber.getValue().toString());
        boolean result = (numGenius == numPlayer)? true: false;
        lblPhrase.setFont(new java.awt.Font("Comic Sans MS", 0, 26));
        if(result){
            lblPhrase.setText("<html><b>Congratulations</b>, you guess my number. I thinked in "+numGenius+
                    ".<br/><p style='text-align:center;'>Let's play again!?</p></html>");
            
        }else{
            lblPhrase.setText("<html>Oh no, I thinked in "+ numGenius +
                    ".<br/> Let's play again!?</html>" );
        
        }
    }//GEN-LAST:event_btnGuessActionPerformed

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
            java.util.logging.Logger.getLogger(ViewGeniusGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewGeniusGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewGeniusGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewGeniusGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewGeniusGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner jsNumber;
    private javax.swing.JLabel lblPhrase;
    // End of variables declaration//GEN-END:variables
}
