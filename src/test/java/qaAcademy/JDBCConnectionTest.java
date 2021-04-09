package qaAcademy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBCConnectionTest {

	public static void main(String[] args) throws SQLException {
		
		// TODO Auto-generated method stub
		String host = "localhost";
		String port = "3306";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadbt", "root", "admin");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from credentialInfo where user = 'admin'");
		
		while(rs.next())
		{
        System.out.println(rs.getString("userid"));
        System.out.println(rs.getString("password"));
		}
	}

}
