package Home_Admin;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JComboBox;


public class RemoveVehicleFrame extends javax.swing.JFrame {

    
    public RemoveVehicleFrame() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        populateVehicleIDs();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BackToMenuBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        VehicleIDCB = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REMOVE CARS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackToMenuBtn.setBackground(new java.awt.Color(0, 0, 0));
        BackToMenuBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackToMenuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/back (white).png"))); // NOI18N
        BackToMenuBtn.setText("Back To Menu");
        BackToMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackToMenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 150, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vehicle ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 60, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Delete Vehicles");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 80, 160, -1));

        DeleteBtn.setBackground(new java.awt.Color(0, 0, 0));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 130, 70));

        VehicleIDCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehicleIDCBActionPerformed(evt);
            }
        });
        jPanel1.add(VehicleIDCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 160, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/10.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuBtnActionPerformed
        this.dispose();
        Home_admin mainMenu = new Home_admin();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_BackToMenuBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        String dbUrl = "jdbc:mysql://localhost:3307/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "GLkrpass@040110";

        String selectedVehicleID = (String) VehicleIDCB.getSelectedItem();

        if (selectedVehicleID == null || selectedVehicleID.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "select a Vehicle ID.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            
            
            String checkQuery = "SELECT isAvailable, isReserved FROM Vehicles WHERE VehicleID = ?";
            try (PreparedStatement checkPst = con.prepareStatement(checkQuery)) {
                checkPst.setString(1, selectedVehicleID);
                try (ResultSet rs = checkPst.executeQuery()) {
                    if (rs.next()) {
                        boolean isAvailable = rs.getBoolean("isAvailable");
                        boolean isReserved = rs.getBoolean("isReserved");

                        if (isReserved) {
                            JOptionPane.showMessageDialog(new JFrame(), "This vehicle is reserved and cannot be deleted.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        } else if (!isAvailable) {
                            JOptionPane.showMessageDialog(new JFrame(), "This vehicle is not available and cannot be deleted.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    } else {
                        JOptionPane.showMessageDialog(new JFrame(), "No vehicle found", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }

            // Step 2: Proceed to delete the car if it is available and not reserved
            String deleteQuery = "DELETE FROM Vehicles WHERE VehicleID = ?";
            try (PreparedStatement deletePst = con.prepareStatement(deleteQuery)) {
                deletePst.setString(1, selectedVehicleID);

                int rowsDeleted = deletePst.executeUpdate();

                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Delete successfull.", "Success", JOptionPane.INFORMATION_MESSAGE);

                    VehicleIDCB.setSelectedIndex(-1);  // Clear selection
                    populateVehicleIDs();  // Refresh the combo box or table
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "No vehicle found", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: MySQL JDBC Driver not found.", "Driver Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void VehicleIDCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehicleIDCBActionPerformed

        String selectedVehicleID = (String) VehicleIDCB.getSelectedItem();

        if (selectedVehicleID == null || selectedVehicleID.isEmpty()) {
         
            JOptionPane.showMessageDialog(new JFrame(), "select a Vehicle ID to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;  
        }

        String dbUrl = "jdbc:mysql://localhost:3307/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "GLkrpass@040110";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            String query = "DELETE FROM Vehicles WHERE VehicleID = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, selectedVehicleID); 

            pst.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: MySQL JDBC Driver not found.", "Driver Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_VehicleIDCBActionPerformed

    
    private void populateVehicleIDs() {
        String dbUrl = "jdbc:mysql://localhost:3307/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "GLkrpass@040110";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            String query = "SELECT VehicleID FROM Vehicles where Admin_ID = ?";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            VehicleIDCB.removeAllItems(); 
            while (rs.next()) {
                VehicleIDCB.addItem(rs.getString("VehicleID"));
            }

            rs.close();
            pst.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: MySQL JDBC Driver not found.", "Driver Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveVehicleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenuBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JComboBox<String> VehicleIDCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
