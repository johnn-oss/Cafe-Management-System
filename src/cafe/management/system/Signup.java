/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.system;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author pc
 */
public class Signup extends javax.swing.JFrame {
    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobileNumberPattern = "^[0-9]*$";
    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
        btnSave.setEnabled(false);
        
    }

    public void clear() {
        txtFieldName.setText("");
        txtFieldEmail.setText("");
        txtFieldMobileNumber.setText("");
        txtFieldAddress.setText("");
        passwordFieldPassword.setText("");
        txtFieldSecurityQuestion.setText("");
        txtFieldAnswer.setText("");
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Signup = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        mobileNumber = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        securityQuestion = new javax.swing.JLabel();
        answer = new javax.swing.JLabel();
        txtFieldName = new javax.swing.JTextField();
        txtFieldEmail = new javax.swing.JTextField();
        txtFieldMobileNumber = new javax.swing.JTextField();
        txtFieldAddress = new javax.swing.JTextField();
        txtFieldSecurityQuestion = new javax.swing.JTextField();
        txtFieldAnswer = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnForgotPassword = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        passwordFieldPassword = new javax.swing.JPasswordField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(getForeground());
        setSize(new java.awt.Dimension(1346, 820));
        getContentPane().setLayout(null);

        Signup.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Signup.setForeground(new java.awt.Color(255, 0, 0));
        Signup.setText("Signup");
        getContentPane().add(Signup);
        Signup.setBounds(540, 200, 118, 48);

        name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name.setText("Name");
        getContentPane().add(name);
        name.setBounds(460, 260, 40, 20);

        email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        email.setText("Email");
        getContentPane().add(email);
        email.setBounds(460, 290, 36, 20);

        mobileNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mobileNumber.setText("Mobile Number");
        getContentPane().add(mobileNumber);
        mobileNumber.setBounds(460, 340, 106, 20);

        address.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        address.setText("Address");
        getContentPane().add(address);
        address.setBounds(460, 370, 54, 20);

        password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password.setText("Password");
        getContentPane().add(password);
        password.setBounds(460, 420, 64, 20);

        securityQuestion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        securityQuestion.setText("Security Question");
        getContentPane().add(securityQuestion);
        securityQuestion.setBounds(460, 460, 117, 20);

        answer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        answer.setText("Answer");
        getContentPane().add(answer);
        answer.setBounds(460, 500, 49, 20);

        txtFieldName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtFieldName);
        txtFieldName.setBounds(620, 260, 274, 26);

        txtFieldEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtFieldEmail);
        txtFieldEmail.setBounds(620, 290, 274, 26);

        txtFieldMobileNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtFieldMobileNumber);
        txtFieldMobileNumber.setBounds(620, 330, 274, 26);

        txtFieldAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtFieldAddress);
        txtFieldAddress.setBounds(620, 370, 274, 26);

        txtFieldSecurityQuestion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFieldSecurityQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldSecurityQuestionActionPerformed(evt);
            }
        });
        getContentPane().add(txtFieldSecurityQuestion);
        txtFieldSecurityQuestion.setBounds(620, 460, 274, 26);

        txtFieldAnswer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFieldAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldAnswerActionPerformed(evt);
            }
        });
        getContentPane().add(txtFieldAnswer);
        txtFieldAnswer.setBounds(620, 500, 274, 26);

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(620, 540, 86, 27);

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnClear.setText("Clear");
        getContentPane().add(btnClear);
        btnClear.setBounds(720, 540, 89, 27);

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit small.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(820, 540, 81, 27);

        btnForgotPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnForgotPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Password.png"))); // NOI18N
        btnForgotPassword.setText("Forgot Password");
        getContentPane().add(btnForgotPassword);
        btnForgotPassword.setBounds(620, 590, 177, 27);

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        btnLogin.setText("Login");
        getContentPane().add(btnLogin);
        btnLogin.setBounds(810, 590, 91, 27);
        getContentPane().add(passwordFieldPassword);
        passwordFieldPassword.setBounds(620, 420, 274, 22);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/first page background.PNG"))); // NOI18N
        background.setText("Background");
        getContentPane().add(background);
        background.setBounds(0, 0, 1434, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNameActionPerformed

    private void txtFieldSecurityQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldSecurityQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldSecurityQuestionActionPerformed

    private void txtFieldAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldAnswerActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int a = JOptonPane.showConfirmDialog(null, "Do you really want to save the details", "Select", JOptionPane.YES_NO_OPTION);
        User user = new User();
        user.setName(name.getText());
        user.setEmail(email.getText());
        user.setMobileNumber(mobileNumber.getText());
        user.setAddress(address.getText());
        user.setPassword(password.getText());
        user.setSecurityQuestion(securityQuestion.getText());
        user.setAnswer(answer.getText());
        user.setStatus(clear());
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptonPane.showConfirmDialog(null, "Do you really want to exit", "Select", JOptionPane.YES_NO_OPTION);
        
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Signup;
    private javax.swing.JLabel address;
    private javax.swing.JLabel answer;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnForgotPassword;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel email;
    private javax.swing.JLabel mobileNumber;
    private javax.swing.JLabel name;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordFieldPassword;
    private javax.swing.JLabel securityQuestion;
    private javax.swing.JTextField txtFieldAddress;
    private javax.swing.JTextField txtFieldAnswer;
    private javax.swing.JTextField txtFieldEmail;
    private javax.swing.JTextField txtFieldMobileNumber;
    private javax.swing.JTextField txtFieldName;
    private javax.swing.JTextField txtFieldSecurityQuestion;
    // End of variables declaration//GEN-END:variables
}
