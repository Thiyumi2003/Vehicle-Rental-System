package Home_Admin;

import javax.swing.*; //for GUI components
import java.sql.*;  //for database connectivity
import javax.swing.table.DefaultTableModel; //used fo managing table data 
import static vehicle_rental_system.Login_Admin.loggedInAdminID;

public class TotalRevenueFrame extends javax.swing.JFrame {
    
    private int clientId;
    
    public TotalRevenueFrame() {  //constructor
        this.clientId = clientId;
        initComponents();
        loadTotalRevenue();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TotalRevenueTxtf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        GetTotalBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TotalRevenueTable = new javax.swing.JTable();
        BackToMenuBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Car ID", "Brand", "Year", "Model", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SHOW TOTAL REVENUE");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TOTAL REVENUE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        TotalRevenueTxtf.setBackground(new java.awt.Color(0, 0, 0));
        TotalRevenueTxtf.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        TotalRevenueTxtf.setForeground(new java.awt.Color(255, 255, 255));
        TotalRevenueTxtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TotalRevenueTxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalRevenueTxtfActionPerformed(evt);
            }
        });
        jPanel1.add(TotalRevenueTxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 250, 50));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Revenue:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, -1, 50));

        GetTotalBtn.setBackground(new java.awt.Color(0, 0, 0));
        GetTotalBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GetTotalBtn.setForeground(new java.awt.Color(255, 255, 255));
        GetTotalBtn.setText("Total");
        GetTotalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetTotalBtnActionPerformed(evt);
            }
        });
        jPanel1.add(GetTotalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, 120, 50));

        TotalRevenueTable.setBackground(new java.awt.Color(0, 0, 0));
        TotalRevenueTable.setForeground(new java.awt.Color(255, 255, 255));
        TotalRevenueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Payment ID", "Vehicle ID", "Client Name", "Type", "Brand", "Model", "Rents Payment"
            }
        ));
        jScrollPane2.setViewportView(TotalRevenueTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 87, 800, 380));

        BackToMenuBtn.setBackground(new java.awt.Color(0, 0, 0));
        BackToMenuBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackToMenuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/back (white).png"))); // NOI18N
        BackToMenuBtn.setText("Back To Menu");
        BackToMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackToMenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\semester 02\\OOP\\OOP lab sheets\\New Folder (2)\\Vehicle_Rental_System\\src\\backgroundAndicons\\8.1.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TotalRevenueTxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalRevenueTxtfActionPerformed
        DefaultTableModel model = (DefaultTableModel) TotalRevenueTable.getModel();
        double totalRentPayments = 0.0;
        
        for (int i = 0; i < model.getRowCount(); i++) {
            Double rentPayment = (Double) model.getValueAt(i, 6); 
            
            // Accumulate totals, handling possible null values
            totalRentPayments += (rentPayment != null ? rentPayment : 0.0);  //if rentPayment is null, it define 0.0
        }

        // Compute the total
        double grandTotal = totalRentPayments; //combining all rental payments in to a single total

        // Display the grand total in the TotalRevenueTxtf field
        TotalRevenueTxtf.setText("Rs " + String.format("%.2f", grandTotal));  //format to 2 decimal places and update the field
    }//GEN-LAST:event_TotalRevenueTxtfActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void BackToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuBtnActionPerformed
        this.dispose();
        Home_admin mainMenu = new Home_admin();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_BackToMenuBtnActionPerformed

    private void GetTotalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetTotalBtnActionPerformed
   
        // Load data into the table
        loadTotalRevenue();

        // Recalculate total revenue
        TotalRevenueTxtfActionPerformed(evt);
    }//GEN-LAST:event_GetTotalBtnActionPerformed

    
    private void loadTotalRevenue() {
        String dbUrl = "jdbc:mysql://localhost:3307/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "GLkrpass@040110";

        DefaultTableModel model = (DefaultTableModel) TotalRevenueTable.getModel();

        String query = """
        SELECT 
            PaymentID, 
            Vehicles.VehicleID, 
            full_name AS ClientName,
            Vehicles.Type,
            Vehicles.Brand, 
            Vehicles.Model, 
            Rent_Payments
        FROM payments
        INNER JOIN Vehicles ON payments.VehicleID = Vehicles.VehicleID
        WHERE Admin_ID = ?
    """;

try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
     PreparedStatement pst = con.prepareStatement(query)) {
    
    // Set the parameter for the query
    pst.setInt(1, loggedInAdminID);

    // Execute the query and get the ResultSet
    try (ResultSet rs = pst.executeQuery()) {

        model.setRowCount(0);  // Clear the existing data in the model

        while (rs.next()) {
            int paymentID = rs.getInt("PaymentID");
            int vehicleID = rs.getInt("VehicleID");
            String clientName = rs.getString("ClientName");
            String type = rs.getString("Type");
            String brand = rs.getString("Brand");
            String modelStr = rs.getString("Model");
            double rentPayment = rs.getDouble("Rent_Payments");  // No need to check for null

            // Add the data to the model
            model.addRow(new Object[]{
                paymentID, 
                vehicleID, 
                clientName,
                type,
                brand, 
                modelStr, 
                rentPayment
            });
        }
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
}

    }
    
    private void loadTotalRevenue(java.util.Date startDate, java.util.Date endDate) {
        String dbUrl = "jdbc:mysql://localhost:3307/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "GLkrpass@040110";

        DefaultTableModel model = (DefaultTableModel) TotalRevenueTable.getModel();

        String query = """
            SELECT 
                PaymentID, 
                VehicleID, 
                full_name AS ClientName,
                Type,
                Brand, 
                Model, 
                Rent_Payments
            FROM payments
            INNER JOIN Vehicles ON payments.VehicleID = Vehicles.VehicleID
            WHERE Admin_ID = ?
        """;

        try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setTimestamp(1, new java.sql.Timestamp(startDate.getTime()));
            pst.setTimestamp(2, new java.sql.Timestamp(endDate.getTime()));

            try (ResultSet rs = pst.executeQuery()) {
                model.setRowCount(0); // Clear existing data

                while (rs.next()) {
                    int paymentID = rs.getInt("PaymentID");
                    int VehicleID = rs.getInt("VehicleID");
                    String clientName = rs.getString("ClientName");
                    String Type = rs.getString("Type");
                    String brand = rs.getString("Brand");
                    String modelStr = rs.getString("Model");
                    Double rentPayment = rs.getDouble("Rent_Payments");
                    
                    rentPayment = (rentPayment != null) ? rentPayment : 0.0;
                    
                    model.addRow(new Object[]{
                        paymentID,
                        VehicleID,
                        clientName,
                        Type,
                        brand,
                        modelStr,
                        rentPayment
                    });
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TotalRevenueFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenuBtn;
    private javax.swing.JButton GetTotalBtn;
    private javax.swing.JTable TotalRevenueTable;
    private javax.swing.JTextField TotalRevenueTxtf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
