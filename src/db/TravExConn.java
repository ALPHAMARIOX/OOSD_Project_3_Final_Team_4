package db; //Database package.
import java.sql.*; //Import the SQL package.

public class TravExConn {
	public void connect() throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelexperts", "root", "");
	}
}
