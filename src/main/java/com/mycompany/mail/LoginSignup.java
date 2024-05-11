package com.mycompany.mail;

import com.mewebstudio.captcha.Captcha;
import com.mewebstudio.captcha.GeneratedCaptcha;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;

public class LoginSignup {

    static String PassStrength(String pass) {
        String str = "";
        int score = 0;
        
        if(pass.length() > 0) str = "Weak";
                
        if (Pattern.matches(".*[A-Z].*", pass)) score++;
        if (Pattern.matches(".*[a-z].*", pass)) score += 2;
        if (Pattern.matches(".*[0-9].*", pass)) score += 3;
        if (pass.length() >= 8) score += 2;
        if (Pattern.matches(".*[^a-zA-Z\\d\\s].*", pass)) score += 3;

        if (score > 10) {
            str = "Very Strong";
        } else if (score > 7) {
            str = "Strong";
        } else if (score > 4) {
            str = "Moderate";
        }

        return str;
    }
    
    static boolean EmailIsValid(String email) {
        boolean valid = false;
        if (Pattern.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", email)) valid = true;
        
        return valid;
    }
    
    static ImageIcon Captcha() {
        Captcha captcha = new Captcha();
        captcha.getConfig().setNoise(0);
        captcha.getConfig().setDark(true);
        captcha.getConfig().setDarkBackgroundColor(Color.DARK_GRAY);
        captcha.getConfig().setWidth(200);
        captcha.getConfig().setHeight(40);
        GeneratedCaptcha gencaptcha = captcha.generate();
        BufferedImage capImg = gencaptcha.getImage();
        ImageIcon imgicon = new ImageIcon(capImg);
        EnrollmentAppOld.code = gencaptcha.getCode();
        return imgicon;
    }
}
