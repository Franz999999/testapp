package com.mycompany.mail;

import jakarta.mail.Folder;
import jakarta.mail.Message;
import jakarta.mail.Session;
import jakarta.mail.Store;
import java.util.Properties;

import com.sun.mail.imap.*;

public class ReadMail {

    static void getProps(String user, String pass) {
        try {
            Properties prop = new Properties();

            Session sesh = Session.getDefaultInstance(prop); 
            
            Store store = sesh.getStore("imap");
            
            store.connect("pop.gmail.com", user, pass);
            
            Folder folder = store.getFolder("INBOX");
            folder.open(Folder.READ_ONLY);
            
            Message[] messages = folder.getMessages();
            System.out.println("message_length: " + messages.length);
            
            for (int i = 0, n = messages.length; i < n; i++) {
                System.out.println("sd");
                Message message = messages[i];
                System.out.println("Email Number: " + (i+1));
                System.out.println("Subject: " + message.getSubject());
                System.out.println("From: " + message.getFrom()[0]);
                System.out.println("Subject: " + message.getContent());
            }
            
            folder.close(false);
            store.close();
            
        } catch (Exception e) {

        }
    }
}
