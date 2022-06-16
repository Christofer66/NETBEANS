package trabajo.grupal;

import VISTA.frm_RegistrarProducto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    public static final String URL="jdbc:mysql://localhost/trabajogrupal";
    public static final String USERNAME="root";
    public static final String PASSWORD="";
    PreparedStatement ps;
    ResultSet rs;
    
    public static Connection getConection(){
    Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection)DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
        }return con;
    }
    
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public void validarAdmin(){
    int resultado=0;
    Connection con=getConection();
    
    try{
       String usuario=txtUsuario.getText();
       String contraseña=String.valueOf(password.getPassword());
       String sql="SELECT * FROM usuarios WHERE Usuario='"+usuario+"'and Contraseña='"+contraseña+"' ";
       Statement st=con.createStatement();
       ResultSet rs=st.executeQuery(sql);

       if(rs.next()) {
           resultado=1;
           if (resultado==1){
               frm_RegistrarProducto form = new frm_RegistrarProducto();
               form.setVisible(true);
               this.dispose();
           }
           }else{
               JOptionPane.showMessageDialog(null, "Error de usuario/contraseña");
           }
       
       
             } catch(Exception e){
                 JOptionPane.showMessageDialog(null, "Error al conectar a base de datos");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        login.setBackground(new java.awt.Color(204, 255, 204));

        lblUsuario.setText("Usuario :");

        lblContraseña.setText("Contraseña :");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(204, 255, 204));
        btnIngresar.setText("Ingresar");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setText("Salir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("LOGIN T1END1TA");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/customer_person_people_man_user_client_1629.png"))); // NOI18N

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(loginLayout.createSequentialGroup()
                                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsuario)
                                    .addComponent(lblContraseña))
                                .addGap(36, 36, 36)
                                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(67, 67, 67))))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)))
                .addGap(37, 37, 37)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnIngresar))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        validarAdmin();
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked

    }//GEN-LAST:event_btnIngresarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
        dispose();
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel login;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
