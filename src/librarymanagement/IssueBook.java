package librarymanagement;



import librarymanagement.Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author bsaik
 */
public class IssueBook extends javax.swing.JFrame {

    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookIDLabel = new javax.swing.JLabel();
        studentIDLabel = new javax.swing.JLabel();
        issueDateLabel = new javax.swing.JLabel();
        dueDateLabel = new javax.swing.JLabel();
        bookIDTextField = new javax.swing.JTextField();
        studentIDTextField = new javax.swing.JTextField();
        issueDateChooser = new com.toedter.calendar.JDateChooser();
        dueDateChooser = new com.toedter.calendar.JDateChooser();
        issueButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        issueBookBackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 125));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookIDLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bookIDLabel.setText("Book ID");
        getContentPane().add(bookIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 129, -1, -1));

        studentIDLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studentIDLabel.setText("Student ID");
        getContentPane().add(studentIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 169, -1, -1));

        issueDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        issueDateLabel.setText("Issue Date");
        getContentPane().add(issueDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 207, -1, -1));

        dueDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dueDateLabel.setText("Due Date");
        getContentPane().add(dueDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 247, -1, -1));

        bookIDTextField.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(bookIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 129, 226, -1));

        studentIDTextField.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(studentIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 167, 226, -1));
        getContentPane().add(issueDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 205, 226, -1));
        getContentPane().add(dueDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 245, 226, -1));

        issueButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        issueButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagement/images/issue book.png"))); // NOI18N
        issueButton.setText("Issue");
        issueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueButtonActionPerformed(evt);
            }
        });
        getContentPane().add(issueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 285, -1, -1));

        closeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagement/images/red-x-mark-transparent-background-3.png"))); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 285, -1, -1));

        issueBookBackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagement/images/123456.png"))); // NOI18N
        getContentPane().add(issueBookBackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
//        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void issueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueButtonActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String bookID = bookIDTextField.getText();
        String studentID = studentIDTextField.getText();
        String issueDate = dateFormat.format(issueDateChooser.getDate());
        String dueDate = dateFormat.format(dueDateChooser.getDate());
        String returnBook = "NO";
        
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(String.format("select * from book where bookID = '%s'",bookID));
            if(resultSet.next()){
                ResultSet resultSet1 = statement.executeQuery(String.format("select * from student where studentID = '%s'",studentID));
                if(resultSet1.next()){
                    statement.executeUpdate(String.format("insert into issue values('%s','%s','%s','%s','%s')",
                                                            bookID, studentID, issueDate, dueDate, returnBook));
                    JOptionPane.showMessageDialog(null, "Successfully Issued");
                    setVisible(false);
                    new IssueBook().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect StudentID");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect BookID");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Connection error");
//            setVisible(false);
//            new NewStudent().setVisible(true);
        }
    }//GEN-LAST:event_issueButtonActionPerformed

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookIDLabel;
    private javax.swing.JTextField bookIDTextField;
    private javax.swing.JButton closeButton;
    private com.toedter.calendar.JDateChooser dueDateChooser;
    private javax.swing.JLabel dueDateLabel;
    private javax.swing.JLabel issueBookBackgroundLabel;
    private javax.swing.JButton issueButton;
    private com.toedter.calendar.JDateChooser issueDateChooser;
    private javax.swing.JLabel issueDateLabel;
    private javax.swing.JLabel studentIDLabel;
    private javax.swing.JTextField studentIDTextField;
    // End of variables declaration//GEN-END:variables
}
