package Home_Client;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import javax.swing.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.JOptionPane;
import static vehicle_rental_system.Login_Client.loggedInClientID;
import static vehicle_rental_system.Login_Client.loggedInClientName;



public class RentReserveVehicleFrame extends javax.swing.JFrame {

    public RentReserveVehicleFrame() {
        initComponents();
        loadVehiclesIntoTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rentVehicleTable = new javax.swing.JTable();
        BackToMenuBtn2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DateEnded = new javax.swing.JSpinner();
        DateStarted = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        RefreshBtn = new javax.swing.JButton();
        SearchFieldTxtf = new javax.swing.JTextField();
        ReserveBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RENT");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rentVehicleTable.setBackground(new java.awt.Color(0, 0, 0));
        rentVehicleTable.setForeground(new java.awt.Color(255, 255, 255));
        rentVehicleTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(rentVehicleTable);
        rentVehicleTable.getAccessibleContext().setAccessibleName("Car Table");

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 130, 480, 410));

        BackToMenuBtn2.setBackground(new java.awt.Color(0, 0, 0));
        BackToMenuBtn2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BackToMenuBtn2.setForeground(new java.awt.Color(255, 255, 255));
        BackToMenuBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/back (white).png"))); // NOI18N
        BackToMenuBtn2.setText("Back To Menu");
        BackToMenuBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuBtn2ActionPerformed(evt);
            }
        });
        jPanel1.add(BackToMenuBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/Rent Car.png"))); // NOI18N
        jButton1.setText("Rent Vehicle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentCarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 160, 50));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date Ended");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date Rent/Reserve");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));
        jPanel1.add(DateEnded, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 160, -1));
        jPanel1.add(DateStarted, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 160, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Vehicle Model:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 180, -1));

        RefreshBtn.setBackground(new java.awt.Color(0, 0, 0));
        RefreshBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RefreshBtn.setForeground(new java.awt.Color(255, 255, 255));
        RefreshBtn.setText("Refresh");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RefreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, -1, -1));

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
        jPanel1.add(SearchFieldTxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 90, 20));

        ReserveBtn.setBackground(new java.awt.Color(0, 0, 0));
        ReserveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ReserveBtn.setForeground(new java.awt.Color(255, 255, 255));
        ReserveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/Reserve Btn.png"))); // NOI18N
        ReserveBtn.setText("Reserve Vehicle");
        ReserveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ReserveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 180, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/9.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rentVehicleInDatabase(int VehicleID, String Type, String brand, String model, double payment, int clientID) {
        String dbUrl = "jdbc:mysql://localhost:3307/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "GLkrpass@040110";

        try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            String clientQuery = "SELECT full_name FROM client WHERE id = ?";
            String clientFullName = null;
            try (PreparedStatement clientStmt = con.prepareStatement(clientQuery)) {
                clientStmt.setInt(1, clientID);
                try (ResultSet rs = clientStmt.executeQuery()) {
                    if (rs.next()) {
                        clientFullName = rs.getString("full_name");
                    } else {
                        JOptionPane.showMessageDialog(this, "Client not found.", "Client Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }

            String insertRentalQuery = "INSERT INTO Rentals (VehicleID, Type, Brand, Model, ClientID, full_name) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement rentalStmt = con.prepareStatement(insertRentalQuery)) {
                rentalStmt.setInt(1, VehicleID);
                rentalStmt.setString(2, Type);
                rentalStmt.setString(3, brand);
                rentalStmt.setString(4, model);
                rentalStmt.setInt(5, clientID);
                rentalStmt.setString(6, clientFullName);

                int rowsInserted = rentalStmt.executeUpdate();
                if (rowsInserted > 0) {
                    String updateVehicleQuery = "UPDATE Vehicles SET isAvailable = ? WHERE VehicleID = ?";
                    try (PreparedStatement updateStmt = con.prepareStatement(updateVehicleQuery)) {
                        updateStmt.setBoolean(1, false);
                        updateStmt.setInt(2, VehicleID);
                        updateStmt.executeUpdate();
                    }

                    String paymentQuery = "INSERT INTO payments (VehicleID, ClientID, full_name, Type, Brand, Model, Rent_Payments) VALUES (?, ?, ?, ?, ?, ?, ?)";
                    try (PreparedStatement paymentStmt = con.prepareStatement(paymentQuery)) {
                        paymentStmt.setInt(1, VehicleID);
                        paymentStmt.setInt(2, clientID);
                        paymentStmt.setString(3, clientFullName);
                        paymentStmt.setString(4, Type);
                        paymentStmt.setString(5, brand);
                        paymentStmt.setString(6, model);
                        paymentStmt.setDouble(7, payment);

                        paymentStmt.executeUpdate();
                    }

                    JOptionPane.showMessageDialog(this, "Your vehicle rented successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    loadVehiclesIntoTable(); 
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to rent. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    
    private void BackToMenuBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuBtn2ActionPerformed
        this.dispose();
        Home_client mainMenu = new Home_client();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_BackToMenuBtn2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        DateStarted.setModel(new javax.swing.SpinnerDateModel());
        DateStarted.setValue(new java.util.Date()); 
        JSpinner.DateEditor editorStart = new JSpinner.DateEditor(DateStarted, "MM/dd/yyyy, h:mm a");
        DateStarted.setEditor(editorStart);

        DateEnded.setModel(new javax.swing.SpinnerDateModel());
        DateEnded.setValue(new java.util.Date()); 
        JSpinner.DateEditor editorEnd = new JSpinner.DateEditor(DateEnded, "MM/dd/yyyy, h:mm a");
        DateEnded.setEditor(editorEnd);
    }//GEN-LAST:event_formWindowOpened

    
    private void ReserveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveBtnActionPerformed
        int selectedRow = rentVehicleTable.getSelectedRow();

        if (selectedRow != -1) {
            try {

                Object VehicleIDObj = rentVehicleTable.getValueAt(selectedRow, 0); 
                Object TypeObj = rentVehicleTable.getValueAt(selectedRow, 1);
                Object brandObj = rentVehicleTable.getValueAt(selectedRow, 2);  
                Object modelObj = rentVehicleTable.getValueAt(selectedRow, 3);  
                Object availabilityObj = rentVehicleTable.getValueAt(selectedRow, 6); 

                if (VehicleIDObj == null || TypeObj == null || brandObj == null || modelObj == null || availabilityObj == null) {
                    JOptionPane.showMessageDialog(this, "Selected row contains invalid data.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int VehicleID = Integer.parseInt(VehicleIDObj.toString());
                String Type = TypeObj.toString();
                String brand = brandObj.toString();
                String model = modelObj.toString();

            
                boolean isAvailable = parseAvailability(availabilityObj);
                if (!isAvailable) {
                    JOptionPane.showMessageDialog(this, "Selected vehicle is not available for reservation.", "Vehicle Unavailable", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                Date startDate = (Date) DateStarted.getValue();
                if (startDate == null) {
                    JOptionPane.showMessageDialog(this, "Please select a valid start date.", "Date Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int clientID = getClientID();
                if (clientID == -1) {
                    return; 
                }

                double pricePerDay = Double.parseDouble(rentVehicleTable.getValueAt(selectedRow, 4).toString());
                double totalPrice = pricePerDay;
                double minimumDownPayment = totalPrice * 0.3;

                if (!confirmReservation(VehicleID, Type, brand, model, startDate, totalPrice)) {
                    return; 
                }

                handlePayment(VehicleID, Type, brand, model, clientID, startDate, totalPrice, minimumDownPayment);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Unexpected error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a vehicle first.", "No vehicle Selected", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ReserveBtnActionPerformed

    private void SearchFieldTxtfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldTxtfKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Trigger the search logic
            String searchModel = SearchFieldTxtf.getText().trim();

            if (searchModel.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter your vehicle model ", "Input Required", JOptionPane.WARNING_MESSAGE);
                return;
            }

            DefaultTableModel model = (DefaultTableModel) rentVehicleTable.getModel();
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
        }
    }//GEN-LAST:event_SearchFieldTxtfKeyPressed

    private void SearchFieldTxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldTxtfActionPerformed
        String searchModel = SearchFieldTxtf.getText().trim();

        if (searchModel.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the vehicle model", "Input Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) rentVehicleTable.getModel();
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
    }//GEN-LAST:event_SearchFieldTxtfActionPerformed

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
        SearchFieldTxtf.setText("");
        loadVehiclesIntoTable();
    }//GEN-LAST:event_RefreshBtnActionPerformed

    private void rentCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentCarBtnActionPerformed
        int selectedRow = rentVehicleTable.getSelectedRow();

        if (selectedRow != -1) {
            try {
                Object VehicleIDObj = rentVehicleTable.getValueAt(selectedRow, 0);
                Object TypeObj = rentVehicleTable.getValueAt(selectedRow,1);
                Object brandObj = rentVehicleTable.getValueAt(selectedRow, 2);
                Object modelObj = rentVehicleTable.getValueAt(selectedRow, 3);
                Object priceObj = rentVehicleTable.getValueAt(selectedRow, 5);

                if (VehicleIDObj == null || TypeObj == null || brandObj == null || modelObj == null || priceObj == null) {
                    JOptionPane.showMessageDialog(this, "invalid data", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int VehicleID = Integer.parseInt(VehicleIDObj.toString());
                String Type = TypeObj.toString();
                String brand = brandObj.toString();
                String model = modelObj.toString();
                double pricePerhour = Double.parseDouble(priceObj.toString());

                Date dateRentedDate = (Date) DateStarted.getValue();
                Date dateEndedDate = (Date) DateEnded.getValue();

                LocalDateTime dateRented = dateRentedDate.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
                LocalDateTime dateEnded = dateEndedDate.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();

                long rentalHours = ChronoUnit.HOURS.between(dateRented, dateEnded);
                if (rentalHours < 0) {
                    JOptionPane.showMessageDialog(this, "Invalid End Date", "Date Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                double totalPrice = rentalHours * pricePerhour;

                // Use loggedInClientID set during login
                if (loggedInClientID == 0) { // Ensure the user is logged in
                    JOptionPane.showMessageDialog(this, "log in first", "Login Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int clientID = loggedInClientID; // Retrieve the logged-in Client ID

                String dbUrl = "jdbc:mysql://localhost:3307/vehiclerentaldb";
                String dbUser = "root";
                String dbPassword = "GLkrpass@040110";
                boolean isVehicleAvailable = false;

                try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
                    String query = "SELECT isAvailable FROM Vehicles WHERE VehicleID = ?";
                    try (PreparedStatement pst = con.prepareStatement(query)) {
                        pst.setInt(1, VehicleID);
                        try (ResultSet rs = pst.executeQuery()) {
                            if (rs.next()) {
                                isVehicleAvailable = rs.getBoolean("isAvailable");
                            }
                        }
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error checking availability: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (!isVehicleAvailable) {
                    JOptionPane.showMessageDialog(this, "Vehicle is already rented or unavailable.", "Vehicle Unavailable", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                String message = "You selected:\n" +
                "Vehicle ID: " + VehicleID + "\n" +
                "Type: " + Type + "\n" +
                "Brand: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Price Per Hour: Rs" + pricePerhour + "\n" +
                "Rental Hours " + rentalHours + "\n" +
                "Total Price: Rs" + totalPrice + "\n\n" +
                "Do you want to proceed with the rental?";

                int option = JOptionPane.showConfirmDialog(this, message, "Confirm Rental", JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION) {
                    String input = JOptionPane.showInputDialog(this,
                        "Enter your payment amount ( Total Price: Rs" + totalPrice + " ):",
                        "Payment Input",
                        JOptionPane.PLAIN_MESSAGE);

                    if (input != null && !input.trim().isEmpty()) {
                        try {
                            double payment = Double.parseDouble(input.trim());
                            if (payment < totalPrice) {
                                JOptionPane.showMessageDialog(this,
                                    "You must pay the total rental price. Please try again.",
                                    "Insufficient Payment",
                                    JOptionPane.WARNING_MESSAGE);
                            } else {
                                rentVehicleInDatabase(VehicleID, Type, brand, model, payment, clientID);
                                JOptionPane.showMessageDialog(this,
                                    "Vehicle rented successfully!\nPayment: Rs" + payment,
                                    "Success",
                                    JOptionPane.INFORMATION_MESSAGE);
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(this,
                                "Invalid payment amount entered. Please enter a numeric value.",
                                "Input Error",
                                JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            } catch (ClassCastException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error retrieving Vehicle data: " + e.getMessage(), "Data Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Unexpected error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a vehicle first.", "No vehicle Selected", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_rentCarBtnActionPerformed

    private boolean parseAvailability(Object availabilityObj) {
        if (availabilityObj instanceof Boolean) {
            return (Boolean) availabilityObj;
        } else if (availabilityObj.toString().equalsIgnoreCase("true") || availabilityObj.toString().equalsIgnoreCase("available")) {
            return true;
        } else if (availabilityObj.toString().equalsIgnoreCase("false") || availabilityObj.toString().equalsIgnoreCase("unavailable")) {
            return false;
        } else {
            return Integer.parseInt(availabilityObj.toString()) == 1;
        }
    }


    private int getClientID() {
        if (loggedInClientID == 0) { // Ensure the client is logged in
            JOptionPane.showMessageDialog(this, "You need to log in first to proceed.", "Login Error", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        return loggedInClientID; // Automatically return the stored Client ID
    }


    private boolean confirmReservation(int VehicleID, String Type, String brand, String model, Date startDate, double totalPrice) {
        String message = "You selected:\n" +
                "Vehicle ID: " + VehicleID + "\n" +
                "Type: " + Type + "\n" +
                "Brand: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Reservation Start Date: " + startDate + "\n" +
                "Total Price: Rs" + totalPrice + "\n\n" +
                "Do you want to proceed with the reservation?";

        int option = JOptionPane.showConfirmDialog(this, message, "Confirm Reservation", JOptionPane.YES_NO_OPTION);
        return option == JOptionPane.YES_OPTION;
    }


    private void handlePayment(int VehicleID, String Type, String brand, String model, int clientID, Date startDate, double totalPrice, double minimumDownPayment) {
        String paymentType = JOptionPane.showInputDialog(this, 
                "Is this a Downpayment or Fullpayment? (Enter 'down' or 'full')", 
                "Payment Type", 
                JOptionPane.PLAIN_MESSAGE);

        if (paymentType == null || paymentType.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please specify the payment type.", "Payment Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        paymentType = paymentType.trim().toLowerCase();
        if (!paymentType.equals("down") && !paymentType.equals("full")) {
            JOptionPane.showMessageDialog(this, "Invalid payment type. Please enter 'down' or 'full'.", "Payment Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String input = JOptionPane.showInputDialog(this, 
                "Enter your payment amount for the " + paymentType + " payment:\n" +
                "Total Price: Rs" + totalPrice + 
                (paymentType.equals("down") ? "\nMinimum Down Payment: Rs" + minimumDownPayment : ""),
                "Payment Input", 
                JOptionPane.PLAIN_MESSAGE);

        if (input == null || input.trim().isEmpty()) {
            return; 
        }

        try {
            double payment = Double.parseDouble(input.trim());

            if (paymentType.equals("down") && payment < minimumDownPayment) {
                JOptionPane.showMessageDialog(this, 
                        "The payment for a down payment must be at least Rs" + minimumDownPayment + ". Please try again.", 
                        "Insufficient Payment", 
                        JOptionPane.WARNING_MESSAGE);
            } else if (paymentType.equals("full") && payment < totalPrice) {
                JOptionPane.showMessageDialog(this, 
                        "The payment for a full payment must be at least Php" + totalPrice + ". Please try again.", 
                        "Insufficient Payment", 
                        JOptionPane.WARNING_MESSAGE);
            } else {
                boolean isFullPayment = paymentType.equals("full");
                reserveVehicleInDatabase(VehicleID, Type, brand, model, clientID, startDate, payment, isFullPayment);

                JOptionPane.showMessageDialog(this, 
                        "Vehicle reserved successfully!\nPayment: Rs" + payment + 
                        "\nPayment Type: " + paymentType, 
                        "Success", 
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid payment amount entered. Please enter a numeric value.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void reserveVehicleInDatabase(int VehicleID, String Type, String brand, String model, int clientID, Date dateRented, double payment, boolean isFullPayment) {
        String dbUrl = "jdbc:mysql://localhost:3307/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "GLkrpass@040110";

        try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            String clientQuery = "SELECT full_name FROM client WHERE id = ?";
            String clientFullName = null;
            try (PreparedStatement clientStmt = con.prepareStatement(clientQuery)) {
                clientStmt.setInt(1, clientID);
                try (ResultSet rs = clientStmt.executeQuery()) {
                    if (rs.next()) {
                        clientFullName = rs.getString("full_name");
                    } else {
                        JOptionPane.showMessageDialog(this, "Client not found.", "Client Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }

            
            String reserveQuery = "INSERT INTO reserves (VehicleID, ReserveDate, Type, Brand, Model, full_name, ClientID) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement reserveStmt = con.prepareStatement(reserveQuery)) {
                reserveStmt.setInt(1, VehicleID);
                reserveStmt.setTimestamp(2, new java.sql.Timestamp(dateRented.getTime()));
                reserveStmt.setString(3, Type);
                reserveStmt.setString(4, brand);
                reserveStmt.setString(5, model);
                reserveStmt.setString(6, clientFullName);
                reserveStmt.setInt(7, clientID);

                int rowsInserted = reserveStmt.executeUpdate();
                if (rowsInserted > 0) {
                    String updateVehicleQuery = "UPDATE Vehicles SET isAvailable = ?, isReserved = ? WHERE VehicleID = ?";
                    try (PreparedStatement updateStmt = con.prepareStatement(updateVehicleQuery)) {
                        updateStmt.setBoolean(1, false); 
                        updateStmt.setBoolean(2, true); 
                        updateStmt.setInt(3, VehicleID);
                        updateStmt.executeUpdate();
                    }

                    String paymentQuery = isFullPayment
                        ? "INSERT INTO payments (VehicleID, ClientID, full_name, Type, Brand, Model, ReserveFull_Payments) VALUES (?, ?, ?, ?, ?, ?, ?)"
                        : "INSERT INTO payments (VehicleID, ClientID, full_name, Type, Brand, Model, ReserveDown_Payments) VALUES (?, ?, ?, ?, ?, ?, ?)";

                    try (PreparedStatement paymentStmt = con.prepareStatement(paymentQuery)) {
                        paymentStmt.setInt(1, VehicleID);
                        paymentStmt.setInt(2, clientID);
                        paymentStmt.setString(3, clientFullName);
                        paymentStmt.setString(4,Type);
                        paymentStmt.setString(5, brand);
                        paymentStmt.setString(6, model);
                        paymentStmt.setDouble(7, payment);

                        paymentStmt.executeUpdate();
                    }

                    JOptionPane.showMessageDialog(this, "Your vehicle reserved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    loadVehiclesIntoTable(); 
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to reserve Your vehicle. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    
    
    public void loadVehiclesIntoTable() {
        DefaultTableModel model = (DefaultTableModel) rentVehicleTable.getModel();
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

    
    
    public static void main(String args[]) {
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RentReserveVehicleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentReserveVehicleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentReserveVehicleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentReserveVehicleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentReserveVehicleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenuBtn2;
    private javax.swing.JSpinner DateEnded;
    private javax.swing.JSpinner DateStarted;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JButton ReserveBtn;
    private javax.swing.JTextField SearchFieldTxtf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable rentVehicleTable;
    // End of variables declaration//GEN-END:variables
}
