package day10;
import java.sql.*;
public class connectivity {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","madhes","madhes");
			String s="insert into data(cid,name) values('"+10+"','"+"Mady"+"')";
//			PreparedStatement p=c.prepareStatement(s);
//			p.executeUpdate();
			Statement st=c.createStatement();
			String d="1";
			ResultSet rs=st.executeQuery("select* from data where cid="+d);
			while(rs.next()) {
				System.out.print(rs.getString("cid")+" "+rs.getString("name"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
