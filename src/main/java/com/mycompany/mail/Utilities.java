package com.mycompany.mail;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Utilities {

    static String Clock() {
            SimpleDateFormat tformat = new SimpleDateFormat("hh:mm:ss a");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return tformat.format(Calendar.getInstance().getTime());
    }
    
    static void Notifications() throws AWTException {
        SystemTray tray = SystemTray.getSystemTray();
        
        Image img = Toolkit.getDefaultToolkit().getImage("icon.png");
        TrayIcon icon = new TrayIcon(img, "tray");

        icon.setImageAutoSize(true);
        icon.setToolTip(null);
        tray.add(icon);
        icon.displayMessage("Enrollment Update", "Your enrollment is being reviewed", MessageType.INFO);
    }
}
