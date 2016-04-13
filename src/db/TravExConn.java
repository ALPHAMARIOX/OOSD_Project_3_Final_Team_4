package db; //Database package.
import java.sql.*; //Import the SQL package.
import java.util.ArrayList;
import java.util.Calendar;

import com.sun.crypto.provider.RSACipher;

import TE_OBJ.TE_Classes.*;

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
			//String username = stmt.get;
			//String password;
			//stmt.setString(1, username);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				//if(password.equals(rs.getString(3))){
					//request.getSession().setAttribute("id", rs.getString(2));
				//}
				//else{
					//request.getSession().setAttribute("failedLogin",  "Invalid User ID or Password");
				//}
			}
			else{
				//request.getSession().setAttribute("failedLogin",  "Invalid User ID or Password");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Get all agents.
	public ArrayList<Agent> getAllAgents() {
		ArrayList<Agent> agents = new ArrayList<Agent>();
		Connection conn = getConnection();
		String sql = "SELECT * FROM Agents";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				for (Agent agent : agents) {
					agent.setAgentId(Integer.parseInt(rs.getString(1)));
					agent.setAgtFirstName(rs.getString(2));
					agent.setAgtMiddleInitials(rs.getString(3));
					agent.setAgtLastName(rs.getString(4));
					agent.setAgtBusPhone(rs.getString(5));
					agent.setAgtEmail(rs.getString(6));
					agent.setAgtPosition(rs.getString(7));
					agent.setAgtPosition(rs.getString(8));
				}
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return agents;
	}
	
	public Agent getAgents() {
		Agent agent = new Agent();
		Connection conn = getConnection();
		String sql = "SELECT * FROM Agents";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				agent.setAgentId(Integer.parseInt(rs.getString(1)));
				agent.setAgtFirstName(rs.getString(2));
				agent.setAgtMiddleInitials(rs.getString(3));
				agent.setAgtLastName(rs.getString(4));
				agent.setAgtBusPhone(rs.getString(5));
				agent.setAgtEmail(rs.getString(6));
				agent.setAgtPosition(rs.getString(7));
				agent.setAgencyId(Integer.parseInt(rs.getString(8)));
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return agent;
	}
	
	//Get all customers.
		public ArrayList<Customer> getAllCustomers() {
			ArrayList<Customer> custs = new ArrayList<Customer>();
			Connection conn = getConnection();
			String sql = "SELECT CustomerId,CustFirstName,CustLastName,AgentId FROM Customers";
			try {
				PreparedStatement stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();
				while(rs.next())
				{
					for (Customer cust : custs) {
						cust.setCustomerId(Integer.parseInt(rs.getString(1)));
						cust.setCustFirstName(rs.getString(2));
						cust.setCustLastName(rs.getString(3));
						cust.setAgtId(Integer.parseInt(rs.getString(4)));
					}
				}
			}
			catch (Exception e){
				e.printStackTrace();
			}
			return custs;
		}
		
		public ArrayList<TPackage> getAllPackages() {
			ArrayList<TPackage> packs = new ArrayList<TPackage>();
			Connection conn = getConnection();
			String sql = "SELECT * FROM Packages";
			try {
				PreparedStatement stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();
				while(rs.next())
				{
					for (TPackage pack : packs) {
						pack.setPackageId(Integer.parseInt(rs.getString(1)));
						pack.setPkgName(rs.getString(2));
						pack.setPkgStartDate(rs.getString(3));
						pack.setPkgEndDate(rs.getString(4));
						pack.setPkgBasePrice(Double.parseDouble(rs.getString(5)));
						pack.setPkgAgencyCommission(Double.parseDouble(rs.getString(6)));
						pack.setPkgDesc(rs.getString(7));
					}
				}
			}
			catch (Exception e){
				e.printStackTrace();
			}
			return packs;
		}
}
