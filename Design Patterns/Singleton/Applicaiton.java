package Singleton;

import java.sql.Connection;

public class Applicaiton {
	public static void main(String[] args) {
		
		long start;
		long end;
		
		Administrator admin = Administrator.getAdmin();
		System.out.println(admin);
		
		start = System.currentTimeMillis();
		Connection connection = admin.getConnection();
		end = System.currentTimeMillis();
		
		Administrator admin2 = Administrator.getAdmin();
		
		start = System.currentTimeMillis();
		Connection connection2 = admin2.getConnection();
		end = System.currentTimeMillis();
		
		System.out.println(end-start);
	
	}
}
