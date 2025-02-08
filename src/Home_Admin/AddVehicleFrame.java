package Home_Admin;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import static vehicle_rental_system.Login_Admin.loggedInAdminID;


public class AddVehicleFrame extends javax.swing.JFrame {

    
    public AddVehicleFrame() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BackToMenuBtn = new javax.swing.JButton();
        Brandtxtf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Modeltxtf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Yeartxtf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Pricetxtf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SubmitBtn = new javax.swing.JButton();
        isAvailableCB = new javax.swing.JCheckBox();
        Typetxtf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADD");

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
        jPanel1.add(BackToMenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, 30));

        Brandtxtf.setBackground(new java.awt.Color(0, 0, 0));
        Brandtxtf.setForeground(new java.awt.Color(255, 255, 255));
        Brandtxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandtxtfActionPerformed(evt);
            }
        });
        jPanel1.add(Brandtxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 260, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Vehicle Brand");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 180, 80, -1));

        Modeltxtf.setBackground(new java.awt.Color(0, 0, 0));
        Modeltxtf.setForeground(new java.awt.Color(255, 255, 255));
        Modeltxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModeltxtfActionPerformed(evt);
            }
        });
        jPanel1.add(Modeltxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 260, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Vehicle Model");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 230, -1, -1));

        Yeartxtf.setBackground(new java.awt.Color(0, 0, 0));
        Yeartxtf.setForeground(new java.awt.Color(255, 255, 255));
        Yeartxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YeartxtfActionPerformed(evt);
            }
        });
        jPanel1.add(Yeartxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 260, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Manufactured Year");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 280, 120, 20));

        Pricetxtf.setBackground(new java.awt.Color(0, 0, 0));
        Pricetxtf.setForeground(new java.awt.Color(255, 255, 255));
        Pricetxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PricetxtfActionPerformed(evt);
            }
        });
        jPanel1.add(Pricetxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 260, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Expected Rental Value");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 330, 130, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADD VEHICLE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 70, 120, -1));

        SubmitBtn.setBackground(new java.awt.Color(0, 0, 0));
        SubmitBtn.setForeground(new java.awt.Color(255, 255, 255));
        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, -1, -1));

        isAvailableCB.setBackground(new java.awt.Color(0, 0, 0));
        isAvailableCB.setForeground(new java.awt.Color(255, 255, 255));
        isAvailableCB.setText("Available");
        isAvailableCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isAvailableCBActionPerformed(evt);
            }
        });
        jPanel1.add(isAvailableCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        Typetxtf.setBackground(new java.awt.Color(0, 0, 0));
        Typetxtf.setForeground(new java.awt.Color(255, 255, 255));
        Typetxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypetxtfActionPerformed(evt);
            }
        });
        jPanel1.add(Typetxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 260, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vehicle Type");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 130, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("(Expected Rental Value per Hour)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/6.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 630, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuBtnActionPerformed
        this.dispose();
        Home_admin mainMenu = new Home_admin();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_BackToMenuBtnActionPerformed
    
    private void BrandtxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandtxtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrandtxtfActionPerformed

    private void ModeltxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModeltxtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModeltxtfActionPerformed

    private void YeartxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YeartxtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YeartxtfActionPerformed

    private void PricetxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PricetxtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PricetxtfActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed

        String dbUrl = "jdbc:mysql://localhost:3307/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "GLkrpass@040110";
        
        String Type = Typetxtf.getText().trim();
        String brand = Brandtxtf.getText().trim();
        String model = Modeltxtf.getText().trim();
        String year = Yeartxtf.getText().trim();
        String price = Pricetxtf.getText().trim();
        boolean isAvailable = isAvailableCB.isSelected();
        boolean isReserved = false;
        
        

        if (Type.isEmpty() || brand.isEmpty() || model.isEmpty() || year.isEmpty() || price.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "All fields are required.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!isAvailable) {
            JOptionPane.showMessageDialog(new JFrame(), "Availability must be selected.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int VehicleYear = Integer.parseInt(year);
            if (VehicleYear < 1886 || VehicleYear > java.util.Calendar.getInstance().get(java.util.Calendar.YEAR)) {
                JOptionPane.showMessageDialog(new JFrame(), "Please enter a valid manufactured year", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double VehiclePrice = Double.parseDouble(price);
            if (VehiclePrice <= 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Price must be greater than zero.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
                String query = "INSERT INTO Vehicles (Type, Brand, Model, Year, Price, isAvailable, isReserved, Admin_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pst = con.prepareStatement(query)) {
                   
                    pst.setString(1, Type); 
                    pst.setString(2, brand);
                    pst.setString(3, model);
                    pst.setInt(4, VehicleYear);
                    pst.setDouble(5, VehiclePrice);
                    pst.setBoolean(6, isAvailable);
                    pst.setBoolean(7, isReserved); 
                    pst.setInt(8, loggedInAdminID);

                    int rowsInserted = pst.executeUpdate();
                    if (rowsInserted > 0) {
                        JOptionPane.showMessageDialog(new JFrame(), "Vehicle added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                        Typetxtf.setText("");
                        Brandtxtf.setText("");
                        Modeltxtf.setText("");
                        Yeartxtf.setText("");
                        Pricetxtf.setText("");
                        isAvailableCB.setSelected(false);
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error connecting to the database: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Please enter valid numbers for Year and Price.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void TypetxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypetxtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypetxtfActionPerformed

    private void isAvailableCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isAvailableCBActionPerformed

    }//GEN-LAST:event_isAvailableCBActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddVehicleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenuBtn;
    private javax.swing.JTextField Brandtxtf;
    private javax.swing.JTextField Modeltxtf;
    private javax.swing.JTextField Pricetxtf;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JTextField Typetxtf;
    private javax.swing.JTextField Yeartxtf;
    private javax.swing.JCheckBox isAvailableCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
