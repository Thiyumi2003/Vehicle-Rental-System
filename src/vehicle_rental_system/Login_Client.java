package vehicle_rental_system;

import Home_Admin.*;
import Home_Client.*;
import Home_Client.Home_client;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;



public class Login_Client extends javax.swing.JFrame {

  
    public Login_Client() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        Login_ClientBtn = new javax.swing.JButton();
        Signup_ClientBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BackToMenuBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("LOGIN");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Email");

        email.setBackground(new java.awt.Color(0, 0, 0));
        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        password.setBackground(new java.awt.Color(0, 0, 0));
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        Login_ClientBtn.setBackground(new java.awt.Color(0, 0, 0));
        Login_ClientBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Login_ClientBtn.setForeground(new java.awt.Color(255, 255, 255));
        Login_ClientBtn.setText("Login");
        Login_ClientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ClientBtnActionPerformed(evt);
            }
        });
        Login_ClientBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Login_ClientBtnKeyPressed(evt);
            }
        });

        Signup_ClientBtn.setBackground(new java.awt.Color(0, 0, 0));
        Signup_ClientBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Signup_ClientBtn.setForeground(new java.awt.Color(255, 255, 255));
        Signup_ClientBtn.setText("Sign Up");
        Signup_ClientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Signup_ClientBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("I don't have an account");

        BackToMenuBtn.setBackground(new java.awt.Color(0, 0, 0));
        BackToMenuBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackToMenuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/back (white).png"))); // NOI18N
        BackToMenuBtn.setText("Back");
        BackToMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(email)
                                .addComponent(jLabel3)
                                .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Signup_ClientBtn)
                                    .addGap(112, 112, 112)))
                            .addComponent(Login_ClientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BackToMenuBtn))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Login_ClientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Signup_ClientBtn)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addComponent(BackToMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Left, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/11.1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 420, 580));

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

    private void Signup_ClientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Signup_ClientBtnActionPerformed

        SignUp_Client SignUpFrame = new SignUp_Client();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Signup_ClientBtnActionPerformed

    public static int loggedInClientID = -1; //no client is currently logged in
    public static String loggedInClientName = null; //no client name is set
    
    private void Login_ClientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ClientBtnActionPerformed
        String Email, Password, query, fname = null, passDb = null, roleDb = null;
        String SUrl, SUser, SPass;
        SUrl = "Jdbc:MySql://localhost:3307/vehiclerentaldb";
        SUser = "root";
        SPass = "GLkrpass@040110";
        int notFound = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();

            if ("".equals(email.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Email Address is required", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(password.getPassword().toString())) {
                JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                Email = email.getText();
                Password = password.getText();

                query = "SELECT * FROM client WHERE email= '" + Email + "'";
                ResultSet rs = st.executeQuery(query);

                while (rs.next()) {
                    passDb = rs.getString("password");
                    fname = rs.getString("full_name");
                    roleDb = rs.getString("role");
                    if ("Client".equalsIgnoreCase(roleDb)) {
                        loggedInClientID = rs.getInt("Client_ID"); // Store Client ID
                        loggedInClientName = fname;        // Store Client Name
                    }
                    notFound = 1;
                }

                if (notFound == 1 && Password.equals(passDb)) {
                    
                     JOptionPane.showMessageDialog(this, 
                        "Welcome, " + fname + "! You are successfully logged in.", 
                        "Login Successful", 
                        JOptionPane.INFORMATION_MESSAGE);
                     
                    if ("Client".equalsIgnoreCase(roleDb)) {
                        Home_client HomeFrame = new Home_client();
                        HomeFrame.setVisible(true);
                        HomeFrame.pack();
                        HomeFrame.setLocationRelativeTo(null);
                    }
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "Incorrect email or password", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
                password.setText("");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_Login_ClientBtnActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        
    }//GEN-LAST:event_passwordActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
    
    }//GEN-LAST:event_emailActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            Login_ClientBtnActionPerformed(null);
        }
    }//GEN-LAST:event_passwordKeyPressed

    private void Login_ClientBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Login_ClientBtnKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            Login_ClientBtnActionPerformed(null);
        }
    }//GEN-LAST:event_Login_ClientBtnKeyPressed

    private void BackToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuBtnActionPerformed
        this.dispose();
        Select_Admin_Client selection = new Select_Admin_Client();
        selection.setVisible(true);
    }//GEN-LAST:event_BackToMenuBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenuBtn;
    private javax.swing.JPanel Left;
    private javax.swing.JButton Login_ClientBtn;
    private javax.swing.JButton Signup_ClientBtn;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
