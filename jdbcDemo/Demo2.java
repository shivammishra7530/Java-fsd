package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Demo2 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String dbUrl = "jdbc:mysql://localhost:3306/animated_movies";
	String username = "root";
	String password = "987@Password";
	String query = "Call SelectAllMovies();";
	
	Connection con = null;
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection(dbUrl, username, password);
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery(query);
	
	while(rs.next()) {
		System.out.print("Title: " + rs.getString("title") + "\t");
		System.out.print("Genre: " + rs.getString("genre")+ "\t");
		System.out.println("Release Year: " + rs.getString("release_year"));
	}
}
	
	catch (Exception e) {
	System.out.println(e.getMessage());	
	}
	finally {
		con.close();
	}
	}
	
}

