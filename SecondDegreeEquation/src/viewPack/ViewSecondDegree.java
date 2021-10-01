/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewPack;

import javafx.scene.paint.Color;
import javax.swing.JFrame;


/**
 *
 * @author bruno
 */
public class ViewSecondDegree extends javax.swing.JFrame {

    /**
     * Creates new form ViewSecondDegree
     */
    private JFrame t1;
    public ViewSecondDegree() {
                
        initComponents();
//        t1.getContentPane().setBackground(Color.gray(204.204.204));        
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jsNumb1 = new javax.swing.JSpinner();
        jsNumb3 = new javax.swing.JSpinner();
        jsNumb2 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblNum1 = new javax.swing.JLabel();
        lblNum2 = new javax.swing.JLabel();
        lblNumb2 = new javax.swing.JLabel();
        lblNumb1 = new javax.swing.JLabel();
        lblNum6 = new javax.swing.JLabel();
        lblNumb3 = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        lblResult1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblTipe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        jsNumb1.setModel(new javax.swing.SpinnerNumberModel());
        jsNumb1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsNumb1StateChanged(evt);
            }
        });

        jsNumb3.setModel(new javax.swing.SpinnerNumberModel());
        jsNumb3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsNumb3StateChanged(evt);
            }
        });

        jsNumb2.setModel(new javax.swing.SpinnerNumberModel());
        jsNumb2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsNumb2StateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("x² +");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("x +");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("= 0");

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\Projetos\\Java\\SecondDegreeEquation\\src\\images\\delta.PNG")); // NOI18N
        jLabel5.setText("= 0");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel6.setText("=");

        lblNum1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblNum1.setText("-4 . ");

        lblNum2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblNum2.setText("²");

        lblNumb2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblNumb2.setForeground(new java.awt.Color(0, 0, 255));
        lblNumb2.setText("b");

        lblNumb1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblNumb1.setForeground(new java.awt.Color(0, 0, 255));
        lblNumb1.setText("a");

        lblNum6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblNum6.setText(" . ");

        lblNumb3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblNumb3.setForeground(new java.awt.Color(0, 0, 255));
        lblNumb3.setText("c");

        btnCalc.setText("Calculate");
        btnCalc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        lblResult.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblResult1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Delta Calculator ");
        jLabel4.setPreferredSize(new java.awt.Dimension(175, 29));

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("____________________________________________");

        lblTipe.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblTipe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTipe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jsNumb1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1)
                        .addComponent(jsNumb2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(jsNumb3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNumb2)
                        .addGap(2, 2, 2)
                        .addComponent(lblNum2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNum1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNum6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumb3)))
                .addGap(64, 64, 64))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(30, Short.MAX_VALUE)
                    .addComponent(lblResult1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsNumb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsNumb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsNumb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNum2)
                                .addComponent(lblNum1)
                                .addComponent(lblNumb1)
                                .addComponent(lblNum6)
                                .addComponent(lblNumb3)
                                .addComponent(lblNumb2))
                            .addComponent(jLabel6))))
                .addGap(60, 60, 60)
                .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTipe, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(486, Short.MAX_VALUE)
                    .addComponent(lblResult1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // TODO add your handling code here:
        
        float num1 = Float.parseFloat(jsNumb1.getValue().toString()),
              num2 = Float.parseFloat(jsNumb2.getValue().toString()),
              num3 = Float.parseFloat(jsNumb3.getValue().toString());
        float result =(float)(Math.pow(num2,2) - (4 *(num1 * num3)));
        
        if(result >= 0){
          lblTipe.setText("Tipe: there are real roots");
        }else{
          lblTipe.setText("Tipe: Don't there real roots");
        }
        lblResult.setText("The value of delta is: "+Float.toString(result).replace(".0",""));        
    }//GEN-LAST:event_btnCalcActionPerformed

    private void jsNumb1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsNumb1StateChanged
        // TODO add your handling code here:
        lblNumb1.setText(jsNumb1.getValue().toString());
    }//GEN-LAST:event_jsNumb1StateChanged

    private void jsNumb2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsNumb2StateChanged
        // TODO add your handling code here:
        lblNumb2.setText(jsNumb2.getValue().toString());
    }//GEN-LAST:event_jsNumb2StateChanged

    private void jsNumb3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsNumb3StateChanged
        // TODO add your handling code here:
        lblNumb3.setText(jsNumb3.getValue().toString());
    }//GEN-LAST:event_jsNumb3StateChanged

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
            java.util.logging.Logger.getLogger(ViewSecondDegree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSecondDegree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSecondDegree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSecondDegree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSecondDegree().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSpinner jsNumb1;
    private javax.swing.JSpinner jsNumb2;
    private javax.swing.JSpinner jsNumb3;
    private javax.swing.JLabel lblNum1;
    private javax.swing.JLabel lblNum2;
    private javax.swing.JLabel lblNum6;
    private javax.swing.JLabel lblNumb1;
    private javax.swing.JLabel lblNumb2;
    private javax.swing.JLabel lblNumb3;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblResult1;
    private javax.swing.JLabel lblTipe;
    // End of variables declaration//GEN-END:variables
}
