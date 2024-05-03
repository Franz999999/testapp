package com.mycompany.mail;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.basic.BasicSliderUI;
import javax.swing.table.DefaultTableModel;

public class EnrollmentApp extends javax.swing.JFrame {

    private static final String EMAIL_FROM = "helperbot999999999@gmail.com";
    private static final String EMAIL_TO = "franzilator9@gmail.com";
    private static final String APP_PASSWORD = "cipb xbfj oson iixh";
    boolean dark = false;

    DefaultTableModel tmodel;

    public EnrollmentApp() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Login.setVisible(false);
        jLabel1.setIcon(LoginSignup.Captcha());

        Thread thread = new Thread(() -> {
            while (true) {
                clock.setText(Utilities.Clock());
            }
        });
        thread.start();

        field.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                str.setText(LoginSignup.PassStrength(field.getText()));
            }

            public void removeUpdate(DocumentEvent e) {
                str.setText(LoginSignup.PassStrength(field.getText()));
            }

            public void insertUpdate(DocumentEvent e) {
                str.setText(LoginSignup.PassStrength(field.getText()));
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        Filter = new javax.swing.JPanel();
        jButton = new javax.swing.JButton();
        Filter2 = new javax.swing.JPanel();
        Test = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        field = new javax.swing.JTextField();
        str = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        t = new javax.swing.JTable();
        em = new javax.swing.JTextField();
        jFileChooser1 = new javax.swing.JFileChooser();
        passlabel = new javax.swing.JLabel();
        emlabel = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        shop = new javax.swing.JRadioButton();
        login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1536, 864));
        setMinimumSize(new java.awt.Dimension(1536, 864));
        setUndecorated(true);
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                formAncestorResized(evt);
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        Login.setMaximumSize(new java.awt.Dimension(1536, 864));
        Login.setMinimumSize(new java.awt.Dimension(1536, 864));
        Login.setPreferredSize(new java.awt.Dimension(1538, 866));
        Login.setLayout(null);

        Filter.setLayout(null);

        jButton.setText("Switch Mode");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });
        Filter.add(jButton);
        jButton.setBounds(40, 40, 110, 23);

        Login.add(Filter);
        Filter.setBounds(0, 0, 580, 870);

        Filter2.setBackground(new java.awt.Color(255, 217, 225));
        Filter2.setLayout(null);
        Login.add(Filter2);
        Filter2.setBounds(0, 0, 1540, 870);

        getContentPane().add(Login);
        Login.setBounds(0, 0, 1538, 866);

        Test.setMaximumSize(new java.awt.Dimension(1536, 864));
        Test.setMinimumSize(new java.awt.Dimension(1536, 864));
        Test.setPreferredSize(new java.awt.Dimension(1536, 864));
        Test.setLayout(null);

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Test.add(jButton1);
        jButton1.setBounds(60, 40, 72, 23);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MY PC\\Downloads\\13.png")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(300, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(300, 50));
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 50));
        Test.add(jLabel1);
        jLabel1.setBounds(60, 80, 170, 50);
        Test.add(field);
        field.setBounds(60, 150, 170, 22);

        str.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        str.setText(" ");
        Test.add(str);
        str.setBounds(240, 180, 70, 20);

        clock.setText("jLabel2");
        Test.add(clock);
        clock.setBounds(60, 190, 250, 16);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Test.add(jComboBox1);
        jComboBox1.setBounds(310, 130, 72, 22);

        t.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"franz@g.com", "123123123", null, null, null},
                {"1", "1", null, null, null}
            },
            new String [] {
                "Email", "Password", "First Name", "Last Name", "Phone Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(t);

        Test.add(jScrollPane1);
        jScrollPane1.setBounds(990, 30, 452, 402);
        Test.add(em);
        em.setBounds(150, 430, 340, 30);

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });
        Test.add(jFileChooser1);
        jFileChooser1.setBounds(840, 470, 597, 347);

        passlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passlabel.setText("Password: ");
        Test.add(passlabel);
        passlabel.setBounds(150, 470, 80, 20);

        emlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emlabel.setText("Email: ");
        Test.add(emlabel);
        emlabel.setBounds(150, 410, 40, 20);

        pass.setToolTipText("");
        Test.add(pass);
        pass.setBounds(150, 490, 340, 30);

        jButton2.setText("Switch Mode");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Test.add(jButton2);
        jButton2.setBounds(310, 90, 110, 23);

        shop.setText(" Show Password");
        shop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopActionPerformed(evt);
            }
        });
        Test.add(shop);
        shop.setBounds(380, 530, 110, 20);

        login.setText("Log-In");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        Test.add(login);
        login.setBounds(150, 560, 340, 30);

        getContentPane().add(Test);
        Test.setBounds(0, 0, 1536, 864);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange

    }//GEN-LAST:event_formPropertyChange

    private void formAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorResized
        System.out.println("changed");
    }//GEN-LAST:event_formAncestorResized

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SendMail.Send(EMAIL_FROM, EMAIL_TO, APP_PASSWORD);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Utilities.Notifications();
        } catch (AWTException ex) {
            Logger.getLogger(EnrollmentApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                if (dark) {
                    FlatAnimatedLafChange.showSnapshot();
                    Filter2.setBackground(new Color(231, 60, 151));
                    FlatLightLaf.setup();
                    FlatLaf.updateUI();
                    FlatAnimatedLafChange.hideSnapshotWithAnimation();
                    dark = false;
                } else {
                    FlatAnimatedLafChange.showSnapshot();
                    Filter2.setBackground(new Color(231, 60, 151));
                    FlatDarkLaf.setup();
                    FlatLaf.updateUI();
                    FlatAnimatedLafChange.hideSnapshotWithAnimation();
                    dark = true;
                }
            }
        });
    }//GEN-LAST:event_jButtonActionPerformed

    private void shopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopActionPerformed
        if (shop.isSelected()) {
            pass.setEchoChar((char) 0);
        } else {
            pass.setEchoChar('●');
        }
    }//GEN-LAST:event_shopActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

    }//GEN-LAST:event_loginActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        tmodel = (DefaultTableModel) t.getModel();
        boolean loggedin = false;

        for (int i = 0; i < tmodel.getRowCount(); i++) {
            if (tmodel.getValueAt(i, 0).equals(em.getText()) && tmodel.getValueAt(i, 1).equals(pass.getText())) {
                loggedin = true;
            }
        }

        if (loggedin) {
            JOptionPane.showMessageDialog(null, "Logged In");
        } else if (!loggedin) {
            JOptionPane.showMessageDialog(null, "Wrong Email or Password");
        }
    }//GEN-LAST:event_loginMouseClicked

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        File file = new File(jFileChooser1.getSelectedFile().getPath());

        //
        //if (jFileChooser1.showOpenDialog(null) == jFileChooser1.APPROVE_OPTION) {
        //    JOptionPane.showMessageDialog(null, "Opened");
        //}

    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                if (dark) {
                    FlatAnimatedLafChange.showSnapshot();
                    Filter2.setBackground(new Color(231, 60, 151));
                    FlatLightLaf.setup();
                    FlatLaf.updateUI();
                    FlatAnimatedLafChange.hideSnapshotWithAnimation();
                    dark = false;
                } else {
                    FlatAnimatedLafChange.showSnapshot();
                    Filter2.setBackground(new Color(231, 60, 151));
                    FlatDarkLaf.setup();
                    FlatLaf.updateUI();
                    FlatAnimatedLafChange.hideSnapshotWithAnimation();
                    dark = true;
                }
            }
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        UIManager.put("Button.arc", 999);
        UIManager.put("Component.arc", 999);
        UIManager.put("CheckBox.arc", 999);
        UIManager.put("ProgressBar.arc", 999);
        UIManager.put("TextComponent.arc", 999);
        UIManager.put("ProgressBar.arc", 999);
        UIManager.put("Component.arc", 999);
        FlatLightLaf.setup();

        java.awt.EventQueue.invokeLater(() -> {
            new EnrollmentApp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Filter;
    private javax.swing.JPanel Filter2;
    private javax.swing.JPanel Login;
    private javax.swing.JPanel Test;
    private javax.swing.JLabel clock;
    private javax.swing.JTextField em;
    private javax.swing.JLabel emlabel;
    private javax.swing.JTextField field;
    private javax.swing.JButton jButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel passlabel;
    private javax.swing.JRadioButton shop;
    private javax.swing.JLabel str;
    private javax.swing.JTable t;
    // End of variables declaration//GEN-END:variables
}
