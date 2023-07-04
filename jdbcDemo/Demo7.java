package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo7 {
public static void main(String[] args) throws SQLException {
	String dbUrl = "jdbc:mysql://localhost:3306/animated_movies";
	String username = "root";
	String password = "987@Password";
	String query = "update movies SET genre = 'Comedy Drama' where  title = 'Inside Out';";
	
	Connection con = null;
	try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbUrl, username, password);
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			con.close();
		}
		}
}



