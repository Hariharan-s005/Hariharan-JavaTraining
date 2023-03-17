

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private Database() {
		
	}
	public static Connection getConnection() {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;       
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/enine","root","ElPsyCongroo#05");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
}
