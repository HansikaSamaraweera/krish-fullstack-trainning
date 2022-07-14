package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Administrator {
	private static volatile Administrator admin; //= new Administrator();
	private static volatile Connection connection; 
	
	
	private Administrator() {
		if(admin != null) {
			throw new RuntimeException(" please use getAdmin method!");
		}
		
	}
	public static Administrator getAdmin() {
		
		if(admin==null) {
			
			synchronized (Administrator.class) {
				if(admin==null) {
			
					admin= new Administrator();
				}
			}
		}
			
		return admin;
	}
	
	public Connection getConnection() {
		
		if(connection == null) {
			synchronized (Administrator.class) {
				if(connection==null) {
					String url = "jdbc:derby:memory:sample:create= true";
					try {
						connection = DriverManager.getConnection(url);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		}
		
		return connection;
	}

}
