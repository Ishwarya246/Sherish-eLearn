/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package elearn;

/**
 *
 * @author PORKALAISELVI
 */
public class ComputerScience extends javax.swing.JFrame {

    /**
     * Creates new form ComputerScience
     */
    public ComputerScience() {
        initComponents();
    }
    public String user;
    public ComputerScience(String user)
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
        jLabel4 = new javax.swing.JLabel();
        datascienceopen = new javax.swing.JButton();
        machinelearning = new javax.swing.JButton();
        artificialiintelligenceopen = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        webdevelopmentopen = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));

        jLabel4.setBackground(new java.awt.Color(255, 255, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("MACHINE");

        datascienceopen.setBackground(new java.awt.Color(0, 0, 0));
        datascienceopen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        datascienceopen.setForeground(new java.awt.Color(51, 255, 255));
        datascienceopen.setText("DATA SCIENCE");
        datascienceopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datascienceopenActionPerformed(evt);
            }
        });

        machinelearning.setBackground(new java.awt.Color(0, 0, 0));
        machinelearning.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        machinelearning.setForeground(new java.awt.Color(51, 255, 255));
        machinelearning.setText("MACHINE LEARNING");
        machinelearning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                machinelearningActionPerformed(evt);
            }
        });

        artificialiintelligenceopen.setBackground(new java.awt.Color(0, 0, 0));
        artificialiintelligenceopen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        artificialiintelligenceopen.setForeground(new java.awt.Color(51, 255, 255));
        artificialiintelligenceopen.setText("ARTIFICIAL INTELLIGENCE");
        artificialiintelligenceopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artificialiintelligenceopenActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/computer.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        webdevelopmentopen.setBackground(new java.awt.Color(0, 0, 0));
        webdevelopmentopen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        webdevelopmentopen.setForeground(new java.awt.Color(51, 255, 255));
        webdevelopmentopen.setText("WEB DEVELPOMENT");
        webdevelopmentopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                webdevelopmentopenActionPerformed(evt);
            }
        });

        backbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("COMPUTER COURSES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1351, 1351, 1351))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datascienceopen, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(artificialiintelligenceopen)
                            .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(webdevelopmentopen, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(machinelearning, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(datascienceopen)
                        .addGap(53, 53, 53)
                        .addComponent(artificialiintelligenceopen)
                        .addGap(89, 89, 89)
                        .addComponent(machinelearning)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(webdevelopmentopen)
                        .addGap(68, 68, 68)
                        .addComponent(backbutton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(701, 701, 701)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void datascienceopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datascienceopenActionPerformed
        // TODO add your handling code here:
        DataScience ds =  new DataScience(user);
        ds.setVisible(true);
        dispose();
    }//GEN-LAST:event_datascienceopenActionPerformed

    private void artificialiintelligenceopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artificialiintelligenceopenActionPerformed
        // TODO add your handling code here:
        ArtificialIntelligence ai =  new ArtificialIntelligence(user);
        ai.setVisible(true);
        dispose();
    }//GEN-LAST:event_artificialiintelligenceopenActionPerformed

    private void machinelearningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machinelearningActionPerformed
        // TODO add your handling code here:
        MachineLearning ml = new MachineLearning(user);
        ml.setVisible(true);
        dispose();
    }//GEN-LAST:event_machinelearningActionPerformed

    private void webdevelopmentopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_webdevelopmentopenActionPerformed
        // TODO add your handling code here:
        WebDevelpoment wd = new WebDevelpoment(user);
        wd.setVisible(true);
        dispose();
    }//GEN-LAST:event_webdevelopmentopenActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        Courses cr = new Courses(user);
        cr.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(ComputerScience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComputerScience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComputerScience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComputerScience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComputerScience().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton artificialiintelligenceopen;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton datascienceopen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton machinelearning;
    private javax.swing.JButton webdevelopmentopen;
    // End of variables declaration//GEN-END:variables
}
