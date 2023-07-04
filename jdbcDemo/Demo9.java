package jdbcDemo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo9 {
public static void main(String[] args) throws SQLException {
	String dbUrl = "jdbc:mysql://localhost:3306";
	String username = "root";
	String password = "987@Password";
	
	String query = "Create Database ecommerce;";
	String query2 = "CREATE TABLE products (" +
            "product_id INT PRIMARY KEY," +
            "product_name VARCHAR(255)," +
            "product_price DECIMAL(10,2)" +
            ")";
	
	
	Connection con = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = con.createStatement();
		stmt.execute(query);
	}
	catch (Exception e) {
		System.out.println("e.getMessage()");
	}
	finally {
		con.close();
	}
}
}
