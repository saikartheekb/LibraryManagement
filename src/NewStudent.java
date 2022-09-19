/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.*;
import Project.ConnectionProvider;
import javax.swing.JOptionPane;
/**
 *
 * @author bsaik
 */
public class NewStudent extends javax.swing.JFrame {

    /**
     * Creates new form NewStudent
     */
    public NewStudent() {
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

        studentIDLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        parentNameLabel = new javax.swing.JLabel();
        courseNameLabel = new javax.swing.JLabel();
        branchNameLabel = new javax.swing.JLabel();
        studentIDField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        parentNameTextField = new javax.swing.JTextField();
        courseNameComboBox = new javax.swing.JComboBox<>();
        branchNameComboBox = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        newStudentBackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 125));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentIDLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studentIDLabel.setText("Student ID");
        getContentPane().add(studentIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 105, -1, -1));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLabel.setText("Name");
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 149, -1, -1));

        parentNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        parentNameLabel.setText("Parent Name");
        getContentPane().add(parentNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 196, -1, -1));

        courseNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        courseNameLabel.setText("Course name");
        getContentPane().add(courseNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        branchNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        branchNameLabel.setText("BranchName");
        getContentPane().add(branchNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 284, -1, -1));

        studentIDField.setBackground(new java.awt.Color(255, 255, 204));
        studentIDField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(studentIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 102, 226, -1));

        nameTextField.setBackground(new java.awt.Color(255, 255, 204));
        nameTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 146, 226, -1));

        parentNameTextField.setBackground(new java.awt.Color(255, 255, 204));
        parentNameTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(parentNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 193, 226, -1));

        courseNameComboBox.setBackground(new java.awt.Color(255, 255, 204));
        courseNameComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        courseNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech.", "B.E.", "B.Sc.", "B.A." }));
        getContentPane().add(courseNameComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 237, 226, -1));

        branchNameComboBox.setBackground(new java.awt.Color(255, 255, 204));
        branchNameComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        branchNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "IT", "Mechanical", "Civil", "ECE", "EEE" }));
        getContentPane().add(branchNameComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 281, 226, -1));

        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save-icon--1.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 325, -1, -1));

        closeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/red-x-mark-transparent-background-3.png"))); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 325, -1, -1));

        newStudentBackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/123456.png"))); // NOI18N
        getContentPane().add(newStudentBackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        String studentID = studentIDField.getText();
        String name = nameTextField.getText();
        String parentName = parentNameTextField.getText();
        String courseName = (String) courseNameComboBox.getSelectedItem();
        String branchName = (String) branchNameComboBox.getSelectedItem();
        
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement statement = con.createStatement();
            statement.executeUpdate(String.format("insert into student values('%s','%s','%s','%s','%s')",
                                            studentID, name, parentName, courseName, branchName));
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            setVisible(false);
            new NewStudent().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "StudentID already exists");
            setVisible(false);
            new NewStudent().setVisible(true);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        dispose();
//        setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> branchNameComboBox;
    private javax.swing.JLabel branchNameLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JComboBox<String> courseNameComboBox;
    private javax.swing.JLabel courseNameLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel newStudentBackgroundImage;
    private javax.swing.JLabel parentNameLabel;
    private javax.swing.JTextField parentNameTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField studentIDField;
    private javax.swing.JLabel studentIDLabel;
    // End of variables declaration//GEN-END:variables
}
