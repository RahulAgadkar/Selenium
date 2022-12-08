package Genric_Scripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Database {
	@Test
	public void data() throws SQLException {
	String un="root";
	String pwd="root";
	String url="jdbc:mysql://localhost:3306/logdata";
	Connection dm =DriverManager.getConnection(url,un,pwd);
	Statement create = dm.createStatement();
	ResultSet out = create.executeQuery("select * from userdata;");
	out.next();
	out.next();
	System.out.println(out.getString("username"));
	System.out.println(out.getString("password"));
}
}
