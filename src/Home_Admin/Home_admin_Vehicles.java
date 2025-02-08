package Home_Admin;

import Home_Client.*;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static vehicle_rental_system.Login_Admin.loggedInAdminID;


public class Home_admin_Vehicles extends javax.swing.JFrame {

    
    public Home_admin_Vehicles() {
        initComponents();
        loadVehiclesIntoTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UpadateBtn = new javax.swing.JButton();
        RemoveBtn = new javax.swing.JButton();
        SearchFieldTxtf = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewVehicleTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BackToMenuBtn = new javax.swing.JButton();
        RefreshBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UpadateBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UpadateBtn.setText("Update");
        UpadateBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UpadateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpadateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(UpadateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 130, 40));

        RemoveBtn.setBackground(new java.awt.Color(0, 0, 0));
        RemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        RemoveBtn.setText("Remove");
        RemoveBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RemoveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 130, 40));

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
        jPanel1.add(SearchFieldTxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 90, 20));

        AddBtn.setBackground(new java.awt.Color(0, 0, 0));
        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("Add");
        AddBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel1.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 130, 40));

        viewVehicleTable.setBackground(new java.awt.Color(0, 0, 0));
        viewVehicleTable.setForeground(new java.awt.Color(255, 255, 255));
        viewVehicleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
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
        jScrollPane1.setViewportView(viewVehicleTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 490, 450));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Vehicle Model:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 170, -1));

        BackToMenuBtn.setBackground(new java.awt.Color(0, 0, 0));
        BackToMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BackToMenuBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackToMenuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/back (white).png"))); // NOI18N
        BackToMenuBtn.setText("Back To Menu");
        BackToMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackToMenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 170, 40));

        RefreshBtn.setBackground(new java.awt.Color(0, 0, 0));
        RefreshBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RefreshBtn.setForeground(new java.awt.Color(255, 255, 255));
        RefreshBtn.setText("Refresh");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RefreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/9.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

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

    private void UpadateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpadateBtnActionPerformed
             UpdateVehicleFrame UpdateVehicleFrame = new UpdateVehicleFrame();
             UpdateVehicleFrame.setVisible(true);
             UpdateVehicleFrame.pack();
             UpdateVehicleFrame.setLocationRelativeTo(null); 
             this.dispose();
    }//GEN-LAST:event_UpadateBtnActionPerformed

    private void RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBtnActionPerformed
             RemoveVehicleFrame RemoveVehicleFrame = new RemoveVehicleFrame();
             RemoveVehicleFrame.setVisible(true);
             RemoveVehicleFrame.pack();
             RemoveVehicleFrame.setLocationRelativeTo(null); 
             this.dispose();
    }//GEN-LAST:event_RemoveBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
             AddVehicleFrame AddVehicleFrame = new AddVehicleFrame();
             AddVehicleFrame.setVisible(true);
             AddVehicleFrame.pack();
             AddVehicleFrame.setLocationRelativeTo(null);
             this.dispose();
    }//GEN-LAST:event_AddBtnActionPerformed

    private void BackToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuBtnActionPerformed
        this.dispose();
        Home_admin mainMenu = new Home_admin();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_BackToMenuBtnActionPerformed

    private void SearchFieldTxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldTxtfActionPerformed
        String searchModel = SearchFieldTxtf.getText().trim();

        if (searchModel.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the Brand", "Input Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) viewVehicleTable.getModel();
        model.setRowCount(0);

        String dbUrl = "jdbc:mysql://localhost:3307/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "GLkrpass@040110";

        try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            String query = "SELECT VehicleID, Type, Brand, Model, Year, Price, isAvailable, isReserved, Admin_ID FROM Vehicles WHERE Model LIKE ?";
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
                        JOptionPane.showMessageDialog(this, "No Vehicles found from: " + searchModel, "No Results", JOptionPane.INFORMATION_MESSAGE);
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
                JOptionPane.showMessageDialog(this, "enter the Vehicle Model", "Input Required", JOptionPane.WARNING_MESSAGE);
                return;
            }

            DefaultTableModel model = (DefaultTableModel) viewVehicleTable.getModel();
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
                            JOptionPane.showMessageDialog(this, "No vehicles found from " + searchModel, "No Results", JOptionPane.INFORMATION_MESSAGE);
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

   
    public void loadVehiclesIntoTable(){
        DefaultTableModel model = (DefaultTableModel) viewVehicleTable.getModel();
        model.setRowCount(0);

        String dbUrl = "jdbc:mysql://localhost:3307/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "GLkrpass@040110";
//try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword))

        try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            String query = "SELECT VehicleID, Type, Brand, Model, Year, Price, isAvailable, isReserved FROM Vehicles Where Admin_ID=?";
            try (PreparedStatement pstmt = con.prepareStatement(query)) { 
                pstmt.setInt(1,loggedInAdminID);
                try (ResultSet rs = pstmt.executeQuery()) {
                
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
    }   catch (SQLException ex) {
            Logger.getLogger(Home_admin_Vehicles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home_admin_Vehicles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton BackToMenuBtn;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JButton RemoveBtn;
    private javax.swing.JTextField SearchFieldTxtf;
    private javax.swing.JButton UpadateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable viewVehicleTable;
    // End of variables declaration//GEN-END:variables
}
