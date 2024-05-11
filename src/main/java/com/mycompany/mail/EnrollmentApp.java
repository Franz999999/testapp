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
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        ScaleImg(logos);
        Test.setVisible(false);
        SignUp.setVisible(false);
        Login.setVisible(false);
        Menu1.setVisible(false);
        Menu2.setVisible(false);
        Menu3.setVisible(false);
        Menu4.setVisible(false);
        Menu5.setVisible(false);
        Menu6.setVisible(false);
        Menu7.setVisible(false);
        Menu8.setVisible(false);
        Menu9.setVisible(false);
        Menu10.setVisible(false);
        jLabel1.setIcon(LoginSignup.Captcha());
        jFileChooser1.setVisible(false);
        System.out.println();
        ClockStart();
        LoadScreen();
        PassStrength();
    }

    public int yo = 0;
    boolean loaded = false;

    void LoadScreen() {
        TimingTarget tt = new TimingTarget() {
            @Override
            public void timingEvent(float fraction) {
                load.setValue(yo);
                yo = (int) (fraction * 100);
                if (yo <= 100) {
                    loaded = true;
                }
            }

            public void end() {
                Thread t = new Thread(() -> {
                    try {
                        Thread.sleep(100);
                        EventQueue.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                //FlatAnimatedLafChange.showSnapshot();
                                //Loading.setVisible(false);
                                //Login.setVisible(true);
                                //FlatAnimatedLafChange.hideSnapshotWithAnimation();
                            }
                        });
                    } catch (InterruptedException ex) {
                        Logger.getLogger(EnrollmentApp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
                t.start();
            }
        };

        Animator a = new Animator(2000, tt);
        a.setResolution(1);
        if (!a.isRunning()) {
            a.start();
        }
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

        Loading = new javax.swing.JPanel();
        load = new javax.swing.JProgressBar();
        SignUp = new javax.swing.JPanel();
        Filter3 = new javax.swing.JPanel();
        side1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        logos1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        bg1 = new javax.swing.JLabel();
        Filter1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        fielddecor5 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        fielddecor6 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        fielddecor7 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        fielddecor8 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        fielddecor9 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        log1 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();
        Filter2 = new javax.swing.JPanel();
        side = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        logos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bg = new javax.swing.JLabel();
        Filter = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        fielddecor2 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fielddecor3 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        log = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        Menu1 = new javax.swing.JPanel();
        Menu2 = new javax.swing.JPanel();
        Menu3 = new javax.swing.JPanel();
        Menu4 = new javax.swing.JPanel();
        Menu5 = new javax.swing.JPanel();
        Menu6 = new javax.swing.JPanel();
        Menu7 = new javax.swing.JPanel();
        Menu8 = new javax.swing.JPanel();
        Menu9 = new javax.swing.JPanel();
        Menu10 = new javax.swing.JPanel();
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
        setMaximumSize(new java.awt.Dimension(1538, 866));
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

        Loading.setBackground(new java.awt.Color(255, 255, 255));
        Loading.setForeground(new java.awt.Color(236, 236, 236));
        Loading.setPreferredSize(new java.awt.Dimension(1540, 800));
        Loading.setLayout(null);

        load.setBackground(new java.awt.Color(224, 224, 224));
        load.setForeground(new java.awt.Color(255, 153, 153));
        load.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Loading.add(load);
        load.setBounds(150, 390, 1240, 40);

        SignUp.setMaximumSize(new java.awt.Dimension(1536, 864));
        SignUp.setMinimumSize(new java.awt.Dimension(1536, 864));
        SignUp.setPreferredSize(new java.awt.Dimension(1538, 800));
        SignUp.setLayout(null);

        Filter3.setBackground(new java.awt.Color(255, 255, 255));
        Filter3.setLayout(null);

        side1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        side1.add(jPanel4);
        jPanel4.setBounds(1059, 50, 1, 800);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(null);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Mongolian Baiti", 0, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Excellence");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel5.add(jLabel15);
        jLabel15.setBounds(60, 680, 240, 50);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Mongolian Baiti", 0, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Pioneering");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel5.add(jLabel17);
        jLabel17.setBounds(60, 630, 240, 50);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Mongolian Baiti", 0, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("of");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel5.add(jLabel18);
        jLabel18.setBounds(60, 580, 240, 50);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Mongolian Baiti", 0, 48)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Legacy");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel5.add(jLabel19);
        jLabel19.setBounds(60, 530, 280, 60);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Mongolian Baiti", 0, 48)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("A");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel5.add(jLabel20);
        jLabel20.setBounds(60, 480, 50, 50);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Mongolian Baiti", 0, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Conception");
        jLabel21.setToolTipText("");
        jPanel5.add(jLabel21);
        jLabel21.setBounds(170, 110, 250, 40);

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Mongolian Baiti", 0, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Immaculate");
        jLabel22.setToolTipText("");
        jPanel5.add(jLabel22);
        jLabel22.setBounds(170, 80, 190, 40);

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Mongolian Baiti", 0, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("University of the");
        jLabel23.setToolTipText("");
        jPanel5.add(jLabel23);
        jLabel23.setBounds(170, 50, 250, 40);

        logos1.setForeground(new java.awt.Color(255, 255, 255));
        logos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a.png"))); // NOI18N
        logos1.setText("Logo");
        logos1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logos1.setMaximumSize(new java.awt.Dimension(90, 90));
        logos1.setMinimumSize(new java.awt.Dimension(90, 90));
        logos1.setPreferredSize(new java.awt.Dimension(90, 90));
        jPanel5.add(logos1);
        logos1.setBounds(40, 50, 100, 90);

        side1.add(jPanel5);
        jPanel5.setBounds(1060, 0, 500, 800);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image (3).png"))); // NOI18N
        jPanel6.add(bg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-790, 0, 2350, 870));

        side1.add(jPanel6);
        jPanel6.setBounds(0, 0, 1560, 800);

        Filter3.add(side1);
        side1.setBounds(-1060, 0, 1560, 800);

        Filter1.setBackground(new java.awt.Color(255, 255, 255));
        Filter1.setForeground(new java.awt.Color(255, 102, 153));
        Filter1.setToolTipText("");
        Filter1.setEnabled(false);
        Filter1.setLayout(null);

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(123, 117, 117));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Last Name");
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Filter1.add(jLabel24);
        jLabel24.setBounds(580, 220, 80, 20);

        fielddecor5.setBackground(new java.awt.Color(255, 255, 255));
        fielddecor5.setPreferredSize(new java.awt.Dimension(20, 20));
        fielddecor5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Filter1.add(fielddecor5);
        fielddecor5.setBounds(580, 230, 83, 2);

        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setForeground(new java.awt.Color(123, 117, 117));
        jTextField6.setToolTipText("");
        jTextField6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField6.setMargin(new java.awt.Insets(2, 12, 2, 6));
        jTextField6.setSelectionColor(new java.awt.Color(123, 117, 117));
        Filter1.add(jTextField6);
        jTextField6.setBounds(560, 230, 390, 40);

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(123, 117, 117));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("First Name");
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Filter1.add(jLabel25);
        jLabel25.setBounds(150, 220, 80, 20);

        fielddecor6.setBackground(new java.awt.Color(255, 255, 255));
        fielddecor6.setPreferredSize(new java.awt.Dimension(20, 20));
        fielddecor6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Filter1.add(fielddecor6);
        fielddecor6.setBounds(146, 230, 83, 2);

        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setForeground(new java.awt.Color(123, 117, 117));
        jTextField7.setToolTipText("");
        jTextField7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField7.setMargin(new java.awt.Insets(2, 12, 2, 6));
        jTextField7.setSelectionColor(new java.awt.Color(123, 117, 117));
        Filter1.add(jTextField7);
        jTextField7.setBounds(130, 230, 360, 40);

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(123, 117, 117));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Email");
        jLabel26.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Filter1.add(jLabel26);
        jLabel26.setBounds(150, 310, 40, 20);

        fielddecor7.setBackground(new java.awt.Color(255, 255, 255));
        fielddecor7.setPreferredSize(new java.awt.Dimension(20, 20));
        fielddecor7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Filter1.add(fielddecor7);
        fielddecor7.setBounds(145, 320, 44, 2);

        jTextField8.setBackground(new java.awt.Color(255, 255, 255));
        jTextField8.setForeground(new java.awt.Color(123, 117, 117));
        jTextField8.setToolTipText("");
        jTextField8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField8.setMargin(new java.awt.Insets(2, 12, 2, 6));
        jTextField8.setSelectionColor(new java.awt.Color(123, 117, 117));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        Filter1.add(jTextField8);
        jTextField8.setBounds(130, 320, 820, 40);

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(123, 117, 117));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Password");
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Filter1.add(jLabel27);
        jLabel27.setBounds(150, 400, 80, 20);

        fielddecor8.setBackground(new java.awt.Color(255, 255, 255));
        fielddecor8.setPreferredSize(new java.awt.Dimension(20, 20));
        fielddecor8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Filter1.add(fielddecor8);
        fielddecor8.setBounds(144, 410, 78, 2);

        jTextField9.setBackground(new java.awt.Color(255, 255, 255));
        jTextField9.setForeground(new java.awt.Color(123, 117, 117));
        jTextField9.setToolTipText("");
        jTextField9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField9.setMargin(new java.awt.Insets(2, 12, 2, 6));
        jTextField9.setSelectionColor(new java.awt.Color(123, 117, 117));
        Filter1.add(jTextField9);
        jTextField9.setBounds(130, 400, 820, 40);

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(123, 117, 117));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Retype Password");
        Filter1.add(jLabel28);
        jLabel28.setBounds(150, 490, 130, 20);

        fielddecor9.setBackground(new java.awt.Color(255, 255, 255));
        fielddecor9.setPreferredSize(new java.awt.Dimension(20, 20));
        fielddecor9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Filter1.add(fielddecor9);
        fielddecor9.setBounds(145, 500, 134, 2);

        jTextField10.setBackground(new java.awt.Color(255, 255, 255));
        jTextField10.setForeground(new java.awt.Color(123, 117, 117));
        jTextField10.setToolTipText("");
        jTextField10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField10.setMargin(new java.awt.Insets(2, 12, 2, 6));
        jTextField10.setSelectionColor(new java.awt.Color(123, 117, 117));
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        Filter1.add(jTextField10);
        jTextField10.setBounds(130, 500, 820, 40);

        log1.setBackground(new java.awt.Color(253, 193, 200));
        log1.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        log1.setForeground(new java.awt.Color(255, 255, 255));
        log1.setText("Create Account");
        log1.setFocusable(false);
        log1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log1ActionPerformed(evt);
            }
        });
        Filter1.add(log1);
        log1.setBounds(130, 590, 820, 40);

        jLabel29.setFont(new java.awt.Font("Inter", 1, 48)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Create Account");
        Filter1.add(jLabel29);
        jLabel29.setBounds(0, 90, 1040, 60);

        jLabel3.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setText("Login");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        Filter1.add(jLabel3);
        jLabel3.setBounds(310, 640, 40, 20);

        jLabel8.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Already have an account?");
        Filter1.add(jLabel8);
        jLabel8.setBounds(130, 640, 180, 20);

        Filter3.add(Filter1);
        Filter1.setBounds(500, 0, 1110, 800);

        SignUp.add(Filter3);
        Filter3.setBounds(0, 0, 1550, 800);

        Login.setMaximumSize(new java.awt.Dimension(1536, 864));
        Login.setMinimumSize(new java.awt.Dimension(1536, 864));
        Login.setPreferredSize(new java.awt.Dimension(1538, 866));

        Filter2.setBackground(new java.awt.Color(255, 255, 255));
        Filter2.setLayout(null);

        side.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        side.add(jPanel3);
        jPanel3.setBounds(1059, 50, 1, 800);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Mongolian Baiti", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Excellence");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel6);
        jLabel6.setBounds(60, 680, 240, 50);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Mongolian Baiti", 0, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Pioneering");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel11);
        jLabel11.setBounds(60, 630, 240, 50);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Mongolian Baiti", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("of");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel10);
        jLabel10.setBounds(60, 580, 240, 50);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Mongolian Baiti", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Legacy");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel9);
        jLabel9.setBounds(60, 530, 280, 60);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Mongolian Baiti", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("A");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel12);
        jLabel12.setBounds(60, 480, 50, 50);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Mongolian Baiti", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Conception");
        jLabel7.setToolTipText("");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(170, 110, 250, 40);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Mongolian Baiti", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Immaculate");
        jLabel16.setToolTipText("");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(170, 80, 190, 40);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Mongolian Baiti", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("University of the");
        jLabel13.setToolTipText("");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(170, 50, 250, 40);

        logos.setForeground(new java.awt.Color(255, 255, 255));
        logos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a.png"))); // NOI18N
        logos.setText("Logo");
        logos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logos.setMaximumSize(new java.awt.Dimension(90, 90));
        logos.setMinimumSize(new java.awt.Dimension(90, 90));
        logos.setPreferredSize(new java.awt.Dimension(90, 90));
        jPanel2.add(logos);
        logos.setBounds(40, 50, 100, 90);

        side.add(jPanel2);
        jPanel2.setBounds(1060, 0, 500, 800);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image (3).png"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-790, 0, 2350, 870));

        side.add(jPanel1);
        jPanel1.setBounds(0, 0, 1560, 800);

        Filter2.add(side);
        side.setBounds(-1060, 0, 1560, 800);

        Filter.setBackground(new java.awt.Color(255, 255, 255));
        Filter.setToolTipText("");
        Filter.setEnabled(false);
        Filter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(123, 117, 117));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Email");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Filter.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 314, 40, 20));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-eye-30.png"))); // NOI18N
        Filter.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 414, 50, 40));

        fielddecor2.setBackground(new java.awt.Color(255, 255, 255));
        fielddecor2.setPreferredSize(new java.awt.Dimension(20, 20));
        fielddecor2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Filter.add(fielddecor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 324, 44, 2));

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
        Filter.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 324, 820, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(123, 117, 117));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Password");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Filter.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 404, 80, 20));

        fielddecor3.setBackground(new java.awt.Color(255, 255, 255));
        fielddecor3.setPreferredSize(new java.awt.Dimension(20, 20));
        fielddecor3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Filter.add(fielddecor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 414, 78, 2));

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setForeground(new java.awt.Color(123, 117, 117));
        jTextField4.setToolTipText("");
        jTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField4.setMargin(new java.awt.Insets(2, 12, 2, 6));
        jTextField4.setSelectionColor(new java.awt.Color(123, 117, 117));
        Filter.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 414, 820, 40));

        log.setBackground(new java.awt.Color(253, 193, 200));
        log.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        log.setForeground(new java.awt.Color(255, 255, 255));
        log.setText("Login");
        log.setToolTipText("");
        log.setFocusable(false);
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        Filter.add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 494, 820, 40));

        jLabel14.setFont(new java.awt.Font("Inter", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Login to Account");
        Filter.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1040, 60));

        jLabel2.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("Create an account");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        Filter.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 544, 134, 20));

        jLabel30.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setText("Don't have an account?");
        jLabel30.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Filter.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 544, 166, 30));

        Filter2.add(Filter);
        Filter.setBounds(500, 0, 1110, 800);

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Filter2, javax.swing.GroupLayout.PREFERRED_SIZE, 1550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Filter2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Menu1.setBackground(new java.awt.Color(255, 255, 255));
        Menu1.setMinimumSize(new java.awt.Dimension(1540, 876));

        javax.swing.GroupLayout Menu1Layout = new javax.swing.GroupLayout(Menu1);
        Menu1.setLayout(Menu1Layout);
        Menu1Layout.setHorizontalGroup(
            Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
        );
        Menu1Layout.setVerticalGroup(
            Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Menu2.setBackground(new java.awt.Color(255, 255, 255));
        Menu2.setMinimumSize(new java.awt.Dimension(1540, 876));
        Menu2.setLayout(null);

        Menu3.setBackground(new java.awt.Color(255, 255, 255));
        Menu3.setMinimumSize(new java.awt.Dimension(1540, 876));
        Menu3.setLayout(null);

        Menu4.setBackground(new java.awt.Color(255, 255, 255));
        Menu4.setMinimumSize(new java.awt.Dimension(1540, 876));
        Menu4.setLayout(null);

        Menu5.setBackground(new java.awt.Color(255, 255, 255));
        Menu5.setMinimumSize(new java.awt.Dimension(1540, 876));
        Menu5.setLayout(null);

        Menu6.setBackground(new java.awt.Color(255, 255, 255));
        Menu6.setMinimumSize(new java.awt.Dimension(1540, 876));
        Menu6.setLayout(null);

        Menu7.setBackground(new java.awt.Color(255, 255, 255));
        Menu7.setMinimumSize(new java.awt.Dimension(1540, 876));
        Menu7.setLayout(null);

        Menu8.setBackground(new java.awt.Color(255, 255, 255));
        Menu8.setMinimumSize(new java.awt.Dimension(1540, 876));
        Menu8.setLayout(null);

        Menu9.setBackground(new java.awt.Color(255, 255, 255));
        Menu9.setMinimumSize(new java.awt.Dimension(1540, 876));
        Menu9.setLayout(null);

        Menu10.setBackground(new java.awt.Color(255, 255, 255));
        Menu10.setMinimumSize(new java.awt.Dimension(1540, 876));
        Menu10.setLayout(null);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu6, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu9, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Loading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu8, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu7, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu4, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu10, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu5, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu6, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Test, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu9, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Loading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu8, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu7, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu4, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu10, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu5, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

    public int x = -1060;
    public boolean pressed = false;

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        TimingTarget tt = new TimingTarget() {
            @Override
            public void timingEvent(float fraction) {
                log.setEnabled(false);
                side.setLocation(x, 0);
                float ein = fraction * fraction;
                float eout = 1 - fraction * fraction;
                x += 45.5 * ein * eout;
            }
        };

        Animator move = new Animator(2500, tt);
        move.setResolution(1);
        if (!move.isRunning() & !pressed) {
            move.start();
            pressed = true;
        }
    }//GEN-LAST:event_logActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void log1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log1ActionPerformed
        TimingTarget tt = new TimingTarget() {
            @Override
            public void timingEvent(float fraction) {
                log1.setEnabled(false);
                side1.setLocation(x, 0);
                float ein = fraction * fraction;
                float eout = 1 - fraction * fraction;
                x += 45.5 * ein * eout;
            }

            public void end() {
                System.out.println(side.getX() + " " + side.getY());
            }
        };

        Animator move = new Animator(2500, tt);
        move.setResolution(1);
        if (!move.isRunning() & !pressed) {
            move.start();
            pressed = true;
        }
    }//GEN-LAST:event_log1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FlatAnimatedLafChange.showSnapshot();
                SignUp.setVisible(false);
                Login.setVisible(true);
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            }
        });
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FlatAnimatedLafChange.showSnapshot();
                SignUp.setVisible(true);
                Login.setVisible(false);
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            }
        });
    }//GEN-LAST:event_jLabel2MouseClicked

    static void ArcComps() {
        UIManager.put("Button.arc", 20);
        UIManager.put("Component.arc", 20);
        UIManager.put("CheckBox.arc", 20);
        UIManager.put("ProgressBar.arc", 20);
        UIManager.put("TextComponent.arc", 20);
        UIManager.put("ProgressBar.arc", 20);
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
    private javax.swing.JPanel Filter1;
    private javax.swing.JPanel Filter2;
    private javax.swing.JPanel Filter3;
    private javax.swing.JPanel Loading;
    private javax.swing.JPanel Login;
    private javax.swing.JPanel Menu1;
    private javax.swing.JPanel Menu10;
    private javax.swing.JPanel Menu2;
    private javax.swing.JPanel Menu3;
    private javax.swing.JPanel Menu4;
    private javax.swing.JPanel Menu5;
    private javax.swing.JPanel Menu6;
    private javax.swing.JPanel Menu7;
    private javax.swing.JPanel Menu8;
    private javax.swing.JPanel Menu9;
    private javax.swing.JPanel SignUp;
    private javax.swing.JPanel Test;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bg1;
    private javax.swing.JTextField ca;
    private javax.swing.JButton cap;
    private javax.swing.JLabel clock;
    private javax.swing.JTextField em;
    private javax.swing.JLabel emlabel;
    private javax.swing.JLabel emlabel1;
    private javax.swing.JTextField field;
    private javax.swing.JPanel fielddecor2;
    private javax.swing.JPanel fielddecor3;
    private javax.swing.JPanel fielddecor5;
    private javax.swing.JPanel fielddecor6;
    private javax.swing.JPanel fielddecor7;
    private javax.swing.JPanel fielddecor8;
    private javax.swing.JPanel fielddecor9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JProgressBar load;
    private javax.swing.JButton log;
    private javax.swing.JButton log1;
    private javax.swing.JButton login1;
    private javax.swing.JLabel logos;
    private javax.swing.JLabel logos1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel passlabel;
    private javax.swing.JRadioButton shop;
    private javax.swing.JPanel side;
    private javax.swing.JPanel side1;
    private javax.swing.JLabel str;
    private javax.swing.JTable t;
    private javax.swing.JButton up;
    // End of variables declaration//GEN-END:variables
}
