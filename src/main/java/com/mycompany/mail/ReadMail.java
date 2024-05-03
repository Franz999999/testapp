package com.mycompany.mail;

import jakarta.mail.Folder;
import jakarta.mail.Message;
import jakarta.mail.Session;
import jakarta.mail.Store;
import java.util.Properties;

import com.sun.mail.imap.*;
import jakarta.mail.BodyPart;
import jakarta.mail.Multipart;

public class ReadMail {

    static void getProps(String user, String pass) {
        try {
            Properties prop = new Properties();
            prop.put("mail.pop3.host", "pop.gmail.com");
            prop.put("mail.pop3.port", "995");
            prop.put("mail.pop3.starttls.enable", "true");

            Session sesh = Session.getDefaultInstance(prop); 
            
            Store store = sesh.getStore("pop3s");
            
            store.connect("pop.gmail.com", "helperbot999999999@gmail.com", "cipb xbfj oson iixh");
            
            Folder folder = store.getFolder("INBOX");
            folder.open(Folder.READ_ONLY);
            
            Message msgs[] = folder.getMessages();
            
            int i = ((msgs.length) - 1);
            
            Message msg = msgs[i];
            
            System.out.println("Subject: " + msg.getSubject());
            Multipart multipart = (Multipart) msgs[i].getContent();
            BodyPart part = multipart.getBodyPart(0);
            part.toString();
            System.out.println("Message: \n" + part.getContent().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
