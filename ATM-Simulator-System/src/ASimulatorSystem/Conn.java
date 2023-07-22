package ASimulatorSystem;

import java.sql.*;  

public class Conn{
	
    Connection c;
    Statement s;
    
    public Conn(){  
        try{
        	
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "Directory", "password");    
            s = c.createStatement();
            
            
        } catch (Exception e) { 
            System.out.println(e);
        }  
    }  
}  