package Home_Client;

import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.DecimalFormat;


public class ViewVehiclesFrame extends javax.swing.JFrame {

    DefaultTableModel model;
    
    public ViewVehiclesFrame() {
        initComponents();
        loadVehiclesIntoTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BackToMenuBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SearchFieldTxtf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        RefreshBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewVehiclesTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIEW");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackToMenuBtn.setBackground(new java.awt.Color(0, 0, 0));
        BackToMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BackToMenuBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackToMenuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/back (white).png"))); // NOI18N
        BackToMenuBtn.setText("Back To Menu");
        BackToMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackToMenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 150, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vehicles");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 150, -1));

        SearchFieldTxtf.setBackground(new java.awt.Color(0, 0, 0));
        SearchFieldTxtf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SearchFieldTxtf.setForeground(new java.awt.Color(255, 255, 255));
        SearchFieldTxtf.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        SearchFieldTxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldTxtfActionPerformed(evt);
            }
        });
        SearchFieldTxtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchFieldTxtfKeyPressed(evt);
            }
        });
        jPanel1.add(SearchFieldTxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 90, 20));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Vehicle Model:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 80, 160, -1));

        RefreshBtn.setBackground(new java.awt.Color(0, 0, 0));
        RefreshBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RefreshBtn.setForeground(new java.awt.Color(255, 255, 255));
        RefreshBtn.setText("Refresh");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RefreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        viewVehiclesTable.setBackground(new java.awt.Color(0, 0, 0));
        viewVehiclesTable.setForeground(new java.awt.Color(255, 255, 255));
        viewVehiclesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Vehicle ID", "Type", "Brand", "Model", "Year", "Price", "Availability"
            }
        ));
        jScrollPane1.setViewportView(viewVehiclesTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 110, 810, 360));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/8.1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuBtnActionPerformed
        this.dispose(); 
        Home_client mainMenu = new Home_client();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_BackToMenuBtnActionPerformed

    private void SearchFieldTxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldTxtfActionPerformed
        String searchModel = SearchFieldTxtf.getText().trim();

            if (searchModel.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter the Vehicle Model", "Input Required", JOptionPane.WARNING_MESSAGE);
                return;
            }

            DefaultTableModel model = (DefaultTableModel) viewVehiclesTable.getModel();
            model.setRowCount(0);

            String dbUrl = "jdbc:mysql://localhost:3307/vehiclerentaldb";
            String dbUser = "root";
            String dbPassword = "GLkrpass@040110";

            try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
                String query = "SELECT VehicleID, Type, Brand, Model, Year, Price, isAvailable, isReserved FROM Vehicles WHERE Model LIKE ?";
                try (PreparedStatement pstmt = con.prepareStatement(query)) {
                    pstmt.setString(1, "%" + searchModel + "%");
                    try (ResultSet rs = pstmt.executeQuery()) {
                        boolean found = false;
                        while (rs.next()) {
                            found = true;
                            int VehicleID = rs.getInt("VehicleID");
                            String Type = rs.getString("Type");
                            String brand = rs.getString("Brand");
                            String modelText = rs.getString("Model");
                            int year = rs.getInt("Year");
                            double price = rs.getDouble("Price");
                            boolean isAvailable = rs.getBoolean("isAvailable");
                            boolean isReserved = rs.getBoolean("isReserved");

                            String availabilityText;
                            if (isReserved) {
                                availabilityText = "Reserved";
                            } else if (!isAvailable) {
                                availabilityText = "Not Available";
                            } else {
                                availabilityText = "Available";
                            }

                            model.addRow(new Object[]{VehicleID, Type, brand, modelText, year, price, availabilityText});
                        }

                        if (!found) {
                            JOptionPane.showMessageDialog(this, "No vehicles found for " + searchModel, "No Results", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_SearchFieldTxtfActionPerformed

    private void SearchFieldTxtfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldTxtfKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Trigger the search logic
            String searchModel = SearchFieldTxtf.getText().trim();

            if (searchModel.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter the Vehicle Model", "Input Required", JOptionPane.WARNING_MESSAGE);
                return;
            }

            DefaultTableModel model = (DefaultTableModel) viewVehiclesTable.getModel();
            model.setRowCount(0);

            String dbUrl = "jdbc:mysql://localhost:3307/vehiclerentaldb";
            String dbUser = "root";
            String dbPassword = "GLkrpass@040110";

            try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
                String query = "SELECT VehicleID, Type, Brand, Model, Year, Price, isAvailable, isReserved FROM Vehicles WHERE Model LIKE ?";
                try (PreparedStatement pstmt = con.prepareStatement(query)) {
                    pstmt.setString(1, "%" + searchModel + "%");
                    try (ResultSet rs = pstmt.executeQuery()) {
                        boolean found = false;
                        while (rs.next()) {
                            found = true;
                            int VehicleID = rs.getInt("VehicleID");
                            String Type = rs.getString("Type");
                            String brand = rs.getString("Brand");
                            String modelText = rs.getString("Model");
                            int year = rs.getInt("Year");
                            double price = rs.getDouble("Price");
                            boolean isAvailable = rs.getBoolean("isAvailable");
                            boolean isReserved = rs.getBoolean("isReserved");

                            String availabilityText;
                            if (isReserved) {
                                availabilityText = "Reserved";
                            } else if (!isAvailable) {
                                availabilityText = "Not Available";
                            } else {
                                availabilityText = "Available";
                            }

                            model.addRow(new Object[]{VehicleID, Type, brand, modelText, year, price, availabilityText});
                        }

                        if (!found) {
                            JOptionPane.showMessageDialog(this, "No vehicle found for " + searchModel, "No Results", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_SearchFieldTxtfKeyPressed

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
        SearchFieldTxtf.setText("");
        loadVehiclesIntoTable();
    }//GEN-LAST:event_RefreshBtnActionPerformed

    
    public void loadVehiclesIntoTable() {
        DefaultTableModel model = (DefaultTableModel) viewVehiclesTable.getModel();
        model.setRowCount(0);

        String dbUrl = "jdbc:mysql://localhost:3307/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "GLkrpass@040110";

        try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            String query = "SELECT VehicleID, Type, Brand, Model, Year, Price, isAvailable, isReserved FROM Vehicles";
            try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
                while (rs.next()) {
                    int VehicleID = rs.getInt("VehicleID");
                    String Type = rs.getString("Type");
                    String brand = rs.getString("Brand");
                    String modelText = rs.getString("Model");
                    int year = rs.getInt("Year");
                    double price = rs.getDouble("Price");
                    boolean isAvailable = rs.getBoolean("isAvailable");
                    boolean isReserved = rs.getBoolean("isReserved");

                    String availabilityText;
                    if (isReserved) {
                        availabilityText = "Reserved";
                    } else if (!isAvailable) {
                        availabilityText = "Not Available";
                    } else {
                        availabilityText = "Available";
                    }

                    model.addRow(new Object[]{VehicleID, Type, brand, modelText, year, price, availabilityText});
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
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
            java.util.logging.Logger.getLogger(ViewVehiclesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVehiclesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVehiclesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVehiclesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVehiclesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenuBtn;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JTextField SearchFieldTxtf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable viewVehiclesTable;
    // End of variables declaration//GEN-END:variables
}
