package com.mycompany.mail;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.util.Animator;
import com.formdev.flatlaf.util.Animator.Interpolator;
import com.formdev.flatlaf.util.Animator.TimingTarget;
import com.formdev.flatlaf.util.ScaledImageIcon;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
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
    public static String code;

    public EnrollmentApp() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        ScaleImg(logos);
        Test.setVisible(false);
        jLabel1.setIcon(LoginSignup.Captcha());
        jFileChooser1.setVisible(false);
        ClockStart();
        PassStrength();
    }

    void ScaleImg(JLabel label) {
        ImageIcon ic = (ImageIcon) label.getIcon();
        Image scaled = ic.getImage().getScaledInstance(logos.getWidth(), logos.getHeight(), Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(scaled));
    }

    void LoadFont() {
        try {
            File fof = new File("C:\\Users\\MY PC\\Downloads\\Inter\\Inter-VariableFont_slnt,wght.ttf");

            Font font = Font.createFont(Font.TRUETYPE_FONT, fof);
            GraphicsEnvironment graenv = GraphicsEnvironment.getLocalGraphicsEnvironment();

            graenv.registerFont(font);
            emlabel.setFont(font);
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(EnrollmentApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FontFormatException ex) {
            Logger.getLogger(EnrollmentApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EnrollmentApp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void PassStrength() {
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

    void ClockStart() {
        Thread thread = new Thread(() -> {
            while (true) {
                clock.setText(Utilities.Clock());
            }
        });
        thread.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        Filter2 = new javax.swing.JPanel();
        side = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        logos = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        Filter = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fielddecor = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fielddecor1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fielddecor2 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fielddecor3 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fielddecor4 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
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
        cap = new javax.swing.JButton();
        up = new javax.swing.JButton();
        ca = new javax.swing.JTextField();
        emlabel1 = new javax.swing.JLabel();
        login1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UIC EduGate");
        setMaximumSize(new java.awt.Dimension(1536, 864));
        setMinimumSize(new java.awt.Dimension(1536, 864));
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

        Filter2.setBackground(new java.awt.Color(255, 255, 255));
        Filter2.setLayout(null);

        side.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Mongolian Baiti", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Excellence");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        side.add(jLabel6);
        jLabel6.setBounds(60, 680, 240, 50);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Mongolian Baiti", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Conception");
        jLabel7.setToolTipText("");
        side.add(jLabel7);
        jLabel7.setBounds(170, 110, 250, 40);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Mongolian Baiti", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Legacy");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        side.add(jLabel9);
        jLabel9.setBounds(60, 530, 280, 60);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Mongolian Baiti", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("of");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        side.add(jLabel10);
        jLabel10.setBounds(60, 580, 240, 50);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Mongolian Baiti", 0, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Pioneering");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        side.add(jLabel11);
        jLabel11.setBounds(60, 630, 240, 50);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Mongolian Baiti", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("A");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        side.add(jLabel12);
        jLabel12.setBounds(60, 480, 50, 50);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Mongolian Baiti", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("University of the");
        jLabel13.setToolTipText("");
        side.add(jLabel13);
        jLabel13.setBounds(170, 50, 250, 40);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Mongolian Baiti", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("mmaculate");
        jLabel14.setToolTipText("");
        side.add(jLabel14);
        jLabel14.setBounds(196, 80, 190, 40);

        logos.setForeground(new java.awt.Color(255, 255, 255));
        logos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a.png"))); // NOI18N
        logos.setText("Logo");
        logos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logos.setMaximumSize(new java.awt.Dimension(90, 90));
        logos.setMinimumSize(new java.awt.Dimension(90, 90));
        logos.setPreferredSize(new java.awt.Dimension(90, 90));
        side.add(logos);
        logos.setBounds(60, 50, 100, 90);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Mongolian Baiti", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("I");
        jLabel16.setToolTipText("");
        side.add(jLabel16);
        jLabel16.setBounds(178, 80, 20, 40);

        bg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vecteezy_beautiful-pink-color-gradient-background_7383249.jpg"))); // NOI18N
        bg.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        side.add(bg);
        bg.setBounds(0, 0, 480, 870);

        Filter2.add(side);
        side.setBounds(0, 0, 480, 870);

        Filter.setBackground(new java.awt.Color(255, 255, 255));
        Filter.setToolTipText("");
        Filter.setEnabled(false);
        Filter.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(123, 117, 117));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Last Name");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Filter.add(jLabel2);
        jLabel2.setBounds(617, 220, 80, 20);

        fielddecor.setBackground(new java.awt.Color(255, 255, 255));
        fielddecor.setPreferredSize(new java.awt.Dimension(20, 20));
        fielddecor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Filter.add(fielddecor);
        fielddecor.setBounds(615, 230, 83, 2);

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(123, 117, 117));
        jTextField1.setToolTipText("");
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.setMargin(new java.awt.Insets(2, 12, 2, 6));
        jTextField1.setSelectionColor(new java.awt.Color(123, 117, 117));
        Filter.add(jTextField1);
        jTextField1.setBounds(600, 230, 410, 40);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(123, 117, 117));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("First Name");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Filter.add(jLabel3);
        jLabel3.setBounds(152, 220, 80, 20);

        fielddecor1.setBackground(new java.awt.Color(255, 255, 255));
        fielddecor1.setPreferredSize(new java.awt.Dimension(20, 20));
        fielddecor1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Filter.add(fielddecor1);
        fielddecor1.setBounds(150, 230, 83, 2);

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setForeground(new java.awt.Color(123, 117, 117));
        jTextField2.setToolTipText("");
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField2.setMargin(new java.awt.Insets(2, 12, 2, 6));
        jTextField2.setSelectionColor(new java.awt.Color(123, 117, 117));
        Filter.add(jTextField2);
        jTextField2.setBounds(130, 230, 400, 40);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(123, 117, 117));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Email");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Filter.add(jLabel4);
        jLabel4.setBounds(147, 310, 40, 20);

        fielddecor2.setBackground(new java.awt.Color(255, 255, 255));
        fielddecor2.setPreferredSize(new java.awt.Dimension(20, 20));
        fielddecor2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Filter.add(fielddecor2);
        fielddecor2.setBounds(145, 320, 44, 2);

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setForeground(new java.awt.Color(123, 117, 117));
        jTextField3.setToolTipText("");
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField3.setMargin(new java.awt.Insets(2, 12, 2, 6));
        jTextField3.setSelectionColor(new java.awt.Color(123, 117, 117));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        Filter.add(jTextField3);
        jTextField3.setBounds(130, 320, 880, 40);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(123, 117, 117));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Password");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Filter.add(jLabel5);
        jLabel5.setBounds(143, 400, 80, 20);

        fielddecor3.setBackground(new java.awt.Color(255, 255, 255));
        fielddecor3.setPreferredSize(new java.awt.Dimension(20, 20));
        fielddecor3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Filter.add(fielddecor3);
        fielddecor3.setBounds(140, 410, 78, 2);

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setForeground(new java.awt.Color(123, 117, 117));
        jTextField4.setToolTipText("");
        jTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField4.setMargin(new java.awt.Insets(2, 12, 2, 6));
        jTextField4.setSelectionColor(new java.awt.Color(123, 117, 117));
        Filter.add(jTextField4);
        jTextField4.setBounds(130, 410, 880, 40);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(123, 117, 117));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Retype Password");
        Filter.add(jLabel8);
        jLabel8.setBounds(153, 490, 130, 20);

        fielddecor4.setBackground(new java.awt.Color(255, 255, 255));
        fielddecor4.setPreferredSize(new java.awt.Dimension(20, 20));
        fielddecor4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Filter.add(fielddecor4);
        fielddecor4.setBounds(145, 500, 134, 2);

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setForeground(new java.awt.Color(123, 117, 117));
        jTextField5.setToolTipText("");
        jTextField5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField5.setMargin(new java.awt.Insets(2, 12, 2, 6));
        jTextField5.setSelectionColor(new java.awt.Color(123, 117, 117));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        Filter.add(jTextField5);
        jTextField5.setBounds(130, 500, 880, 40);

        jButton3.setBackground(new java.awt.Color(253, 193, 200));
        jButton3.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Create Account");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Filter.add(jButton3);
        jButton3.setBounds(130, 600, 880, 40);

        Filter2.add(Filter);
        Filter.setBounds(480, 0, 1130, 880);

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
                {"f", "f", null, null, null}
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
        emlabel.setText("Captcha: ");
        Test.add(emlabel);
        emlabel.setBounds(150, 310, 50, 20);

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

        cap.setText("Send");
        cap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                capMouseClicked(evt);
            }
        });
        cap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capActionPerformed(evt);
            }
        });
        Test.add(cap);
        cap.setBounds(150, 370, 340, 30);

        up.setText("update");
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        Test.add(up);
        up.setBounds(790, 120, 72, 23);
        Test.add(ca);
        ca.setBounds(150, 330, 340, 30);

        emlabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emlabel1.setText("Email: ");
        Test.add(emlabel1);
        emlabel1.setBounds(150, 410, 40, 20);

        login1.setText("Log-In");
        login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login1MouseClicked(evt);
            }
        });
        login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login1ActionPerformed(evt);
            }
        });
        Test.add(login1);
        login1.setBounds(150, 560, 340, 30);

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
            Logger.getLogger(EnrollmentApp.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void shopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopActionPerformed
        if (shop.isSelected()) {
            pass.setEchoChar((char) 0);
        } else {
            pass.setEchoChar('●');
        }
    }//GEN-LAST:event_shopActionPerformed

    private void capActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capActionPerformed
        if (ca.getText().equals(code)) {
            JOptionPane.showMessageDialog(null, "Captcha Correct");
        }
    }//GEN-LAST:event_capActionPerformed

    private void capMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_capMouseClicked

    }//GEN-LAST:event_capMouseClicked

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        //File file = new File();

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

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        ConnectDB.Connect();
    }//GEN-LAST:event_upActionPerformed

    private void login1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_login1MouseClicked

    private void login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login1ActionPerformed
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

        jFileChooser1.setVisible(true);
        if (jFileChooser1.showOpenDialog(null) == jFileChooser1.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(null, jFileChooser1.getSelectedFile().getPath());
        }
        jFileChooser1.setVisible(true);
    }//GEN-LAST:event_login1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    public int x = 0;

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TimingTarget tt = new TimingTarget() {
            @Override
            public void timingEvent(float fraction) {
                side.setLocation(x, 0);
                
                float sqr = fraction * fraction;
                float ease = sqr / (2.0f * (sqr - fraction) + 1.0f);
                System.out.println(sqr);
                x += 5 * ease;
            }
        };

        Animator move = new Animator(2000, tt);
        move.setResolution(1);
        if (!move.isRunning()) {
            move.start();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    static void ArcComps() {
        UIManager.put("Button.arc", 20);
        UIManager.put("Component.arc", 20);
        UIManager.put("CheckBox.arc", 20);
        UIManager.put("ProgressBar.arc", 20);
        UIManager.put("TextComponent.arc", 20);
        UIManager.put("ProgressBar.arc", 20);
        UIManager.put("Component.arc", 20);
        FlatLaf.setGlobalExtraDefaults(Collections.singletonMap("@accentColor", "#7B7575"));
    }

    public static void main(String args[]) {
        ArcComps();
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
    private javax.swing.JLabel bg;
    private javax.swing.JTextField ca;
    private javax.swing.JButton cap;
    private javax.swing.JLabel clock;
    private javax.swing.JTextField em;
    private javax.swing.JLabel emlabel;
    private javax.swing.JLabel emlabel1;
    private javax.swing.JTextField field;
    private javax.swing.JPanel fielddecor;
    private javax.swing.JPanel fielddecor1;
    private javax.swing.JPanel fielddecor2;
    private javax.swing.JPanel fielddecor3;
    private javax.swing.JPanel fielddecor4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton login1;
    private javax.swing.JLabel logos;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel passlabel;
    private javax.swing.JRadioButton shop;
    private javax.swing.JPanel side;
    private javax.swing.JLabel str;
    private javax.swing.JTable t;
    private javax.swing.JButton up;
    // End of variables declaration//GEN-END:variables
}
