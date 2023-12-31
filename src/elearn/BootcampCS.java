/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package elearn;

/**
 *
 * @author PORKALAISELVI
 */
public class BootcampCS extends javax.swing.JFrame {

    /**
     * Creates new form BootcampCS
     */
    public BootcampCS() {
        initComponents();
    }
    public String user;
    public BootcampCS(String user)
    {
        this.user = user;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        frontendbuttonopen = new javax.swing.JButton();
        cyberbuttonopen = new javax.swing.JButton();
        ethicalbuttonopen = new javax.swing.JButton();
        uidesignopenbutton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bootcampcs.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Bootcamp for Computer Science Students");

        frontendbuttonopen.setBackground(new java.awt.Color(255, 204, 204));
        frontendbuttonopen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        frontendbuttonopen.setForeground(new java.awt.Color(0, 0, 153));
        frontendbuttonopen.setText("FRONT END DEVELOPMENT");
        frontendbuttonopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frontendbuttonopenActionPerformed(evt);
            }
        });

        cyberbuttonopen.setBackground(new java.awt.Color(255, 204, 204));
        cyberbuttonopen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cyberbuttonopen.setForeground(new java.awt.Color(0, 0, 153));
        cyberbuttonopen.setText("CYBER SECURITY");
        cyberbuttonopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cyberbuttonopenActionPerformed(evt);
            }
        });

        ethicalbuttonopen.setBackground(new java.awt.Color(255, 204, 204));
        ethicalbuttonopen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ethicalbuttonopen.setForeground(new java.awt.Color(0, 0, 153));
        ethicalbuttonopen.setText("ETHICAL HACKING");
        ethicalbuttonopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ethicalbuttonopenActionPerformed(evt);
            }
        });

        uidesignopenbutton.setBackground(new java.awt.Color(255, 204, 204));
        uidesignopenbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        uidesignopenbutton.setForeground(new java.awt.Color(0, 0, 153));
        uidesignopenbutton.setText("UI DESIGN");
        uidesignopenbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidesignopenbuttonActionPerformed(evt);
            }
        });

        backbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(uidesignopenbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(frontendbuttonopen, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addComponent(cyberbuttonopen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ethicalbuttonopen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(frontendbuttonopen, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(cyberbuttonopen, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(ethicalbuttonopen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(uidesignopenbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(backbutton)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(126, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        Bootcamp bc = new Bootcamp(user);
        bc.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbuttonActionPerformed

    private void frontendbuttonopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frontendbuttonopenActionPerformed
        // TODO add your handling code here:
        FrontEndDev f = new FrontEndDev(user);
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_frontendbuttonopenActionPerformed

    private void cyberbuttonopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cyberbuttonopenActionPerformed
        // TODO add your handling code here:
        CyberSecurity cs = new CyberSecurity(user);
        cs.setVisible(true);
        dispose();
    }//GEN-LAST:event_cyberbuttonopenActionPerformed

    private void ethicalbuttonopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ethicalbuttonopenActionPerformed
        // TODO add your handling code here:
        EthicalHacking eh = new EthicalHacking(user);
        eh.setVisible(true);
        dispose();
    }//GEN-LAST:event_ethicalbuttonopenActionPerformed

    private void uidesignopenbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uidesignopenbuttonActionPerformed
        // TODO add your handling code here:
        UIDesign uid = new UIDesign(user);
        uid.setVisible(true);
        dispose();        
    }//GEN-LAST:event_uidesignopenbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(BootcampCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BootcampCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BootcampCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BootcampCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BootcampCS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JButton cyberbuttonopen;
    private javax.swing.JButton ethicalbuttonopen;
    private javax.swing.JButton frontendbuttonopen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton uidesignopenbutton;
    // End of variables declaration//GEN-END:variables
}
