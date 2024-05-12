/*
 * Created by JFormDesigner on Mon May 13 04:50:36 SGT 2024
 */

package com.mycompany.mail;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author MY PC
 */
public class ActualEnrollmentForm_Unsure extends JPanel {
    public ActualEnrollmentForm_Unsure() {
	initComponents();
    }

    private void initComponents() {
	// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
	// Generated using JFormDesigner Evaluation license - Francis Neil Cuadra
	panel1 = new JPanel();
	label1 = new JLabel();
	label2 = new JLabel();

	//======== this ========
	setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
	EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing
	. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font .BOLD ,12 ),
	java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( )
	{ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er" .equals (e .getPropertyName () ))
	throw new RuntimeException( ); }} );
	setLayout(new MigLayout(
	    "fill,insets 0,hidemode 3",
	    // columns
	    "[0,fill]" +
	    "[fill]",
	    // rows
	    "[]" +
	    "[]" +
	    "[]"));

	//======== panel1 ========
	{
	    panel1.setBackground(new Color(0xff6699));
	    panel1.setLayout(new MigLayout(
		"filly,insets 0,hidemode 3",
		// columns
		"[fill]" +
		"[fill]",
		// rows
		"[]" +
		"[]" +
		"[]"));

	    //---- label1 ----
	    label1.setText("UIC");
	    label1.setFont(new Font("Mongolian Baiti", Font.BOLD, 36));
	    label1.setHorizontalAlignment(SwingConstants.LEFT);
	    label1.setForeground(Color.white);
	    panel1.add(label1, "cell 0 0 2 1,aligny top,growy 0");

	    //---- label2 ----
	    label2.setText("EduGate");
	    label2.setFont(new Font("Mongolian Baiti", Font.BOLD, 36));
	    label2.setForeground(Color.white);
	    panel1.add(label2, "cell 0 1 2 1,aligny top,growy 0");
	}
	add(panel1, "cell 0 0 1 3,growy");
	// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Francis Neil Cuadra
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
