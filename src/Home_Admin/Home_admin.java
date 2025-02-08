package Home_Admin;

import Home_Admin.*;
import javax.swing.JOptionPane;
import vehicle_rental_system.Login_Admin;


public class Home_admin extends javax.swing.JFrame {

    
    public Home_admin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ReserveListBtn = new javax.swing.JButton();
        ShowRentsBtn = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        TotalRevenueBtn = new javax.swing.JButton();
        VehicleBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReserveListBtn.setBackground(new java.awt.Color(0, 0, 0));
        ReserveListBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ReserveListBtn.setForeground(new java.awt.Color(255, 255, 255));
        ReserveListBtn.setText("Reserve List");
        ReserveListBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReserveListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveListBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ReserveListBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 160, 40));

        ShowRentsBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ShowRentsBtn.setText("Show Rents");
        ShowRentsBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ShowRentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowRentsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ShowRentsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 160, 40));

        LogOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogOutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/sign-out-option.png"))); // NOI18N
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(LogOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 50, 40));

        TotalRevenueBtn.setBackground(new java.awt.Color(0, 0, 0));
        TotalRevenueBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TotalRevenueBtn.setForeground(new java.awt.Color(255, 255, 255));
        TotalRevenueBtn.setText("Total Revenue");
        TotalRevenueBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TotalRevenueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalRevenueBtnActionPerformed(evt);
            }
        });
        jPanel1.add(TotalRevenueBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 180, 40));

        VehicleBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        VehicleBtn.setText("Vehicles");
        VehicleBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VehicleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehicleBtnActionPerformed(evt);
            }
        });
        jPanel1.add(VehicleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 160, 40));

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome Admin!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 310, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/7.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowRentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowRentsBtnActionPerformed
            RentListFrame RentListFrame = new RentListFrame();
            RentListFrame.setVisible(true);
            RentListFrame.pack();
            RentListFrame.setLocationRelativeTo(null);      
    }//GEN-LAST:event_ShowRentsBtnActionPerformed

    private void ReserveListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveListBtnActionPerformed
            ReserveListFrame ReserveListFrame = new ReserveListFrame();
            ReserveListFrame.setVisible(true);
            ReserveListFrame.pack();
            ReserveListFrame.setLocationRelativeTo(null); 
    }//GEN-LAST:event_ReserveListBtnActionPerformed

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
            // Show confirmation dialog
        int confirm = JOptionPane.showConfirmDialog(this, 
                "want to log out?", 
                "Confirm Logout", 
                JOptionPane.YES_NO_OPTION);

        // Check user's choice
        if (confirm == JOptionPane.YES_OPTION) {
            Login_Admin LoginFrame = new Login_Admin();
            LoginFrame.setVisible(true);
            LoginFrame.pack();
            LoginFrame.setLocationRelativeTo(null); 
            this.dispose();
        }
    }//GEN-LAST:event_LogOutBtnActionPerformed

    private void VehicleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehicleBtnActionPerformed
             Home_admin_Vehicles admin_Vehicles = new Home_admin_Vehicles();
             admin_Vehicles.setVisible(true);
             admin_Vehicles.pack();
             admin_Vehicles.setLocationRelativeTo(null); 
             this.dispose();
    }//GEN-LAST:event_VehicleBtnActionPerformed

    private void TotalRevenueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalRevenueBtnActionPerformed
             TotalRevenueFrame TotalRevenueFrame = new TotalRevenueFrame();
             TotalRevenueFrame.setVisible(true);
             TotalRevenueFrame.pack();
             TotalRevenueFrame.setLocationRelativeTo(null); 
             this.dispose();
    }//GEN-LAST:event_TotalRevenueBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JButton ReserveListBtn;
    private javax.swing.JButton ShowRentsBtn;
    private javax.swing.JButton TotalRevenueBtn;
    private javax.swing.JButton VehicleBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
