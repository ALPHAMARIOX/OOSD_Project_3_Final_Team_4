package db; //Database package.
import java.sql.*; //Import the SQL package.

public class TravExConn {

	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelexperts", "root", "");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void auth() {
		Connection conn = getConnection();
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM customerlogin WHERE username=?");
			String username;
			String password;
			stmt.setString(1, username);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				if(password.equals(rs.getString(3))){
					request.getSession().setAttribute("id", rs.getString(2));
				}
				else{
					request.getSession().setAttribute("failedLogin",  "Invalid User ID or Password");
				}
			}
			else{
				request.getSession().setAttribute("failedLogin",  "Invalid User ID or Password");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
