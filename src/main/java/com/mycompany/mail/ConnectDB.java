package com.mycompany.mail;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {

    static final String DB_HOST = "jdbc:mysql://u39tvnus74utdpon:EleHKK8HZdBjwod0Phph@b9p4pg0h7pdtktb9cfru-mysql.services.clever-cloud.com:3306/b9p4pg0h7pdtktb9cfru";
    static final String DB_USER = "'u39tvnus74utdpon'@'b9p4pg0h7pdtktb9cfru-mysql.services.clever-cloud.com'";
    static final String DB_PASS = "EleHKK8HZdBjwod0Phph";

    static void Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_HOST, DB_USER, DB_PASS);

            System.out.println("Connected");

            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = statement.executeQuery("select * from accounts");
            
            while (rs.next()) {
                System.out.println(rs.getString(2));
            }
            
            rs.last();
            
            AddAcc(connection, statement, rs);
                    
            System.out.println(rs.getString(2));

        } catch (Exception e) {
        }
    }

    static void AddAcc(Connection connection, Statement statement, ResultSet rs) {
        try {
            //INSERT INTO `accounts` (`USER_ID`, `FIRST_NAME`, `LAST_NAME`, `EMAIL`, `PHONE_NUMBER`, `PASSWORD`, `BIRTHDATE`) VALUES ('6', 'e', 'e', 'ee', 'ee', 'ee', 'eee');
            rs.moveToInsertRow();
            rs.updateString(1, "9");
            rs.updateString(2, "9");
            rs.updateString(3, "9");
            rs.updateString(4, "9");
            rs.updateString(5, "9");
            rs.updateString(6, "9");
            rs.updateString(7, "9");
            rs.insertRow();
            
            System.out.println("Inserted");
            
        } catch (Exception e) {
        }

    }

}
