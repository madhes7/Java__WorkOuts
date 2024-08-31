package day9;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class File_Reader {

	public static void main(String[] args) {
		try
		{
			File f=new File("D:\\21cs050\\java\\happy1.txt");
			FileInputStream fin=new FileInputStream(f); 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","madhes","madhes");
			PreparedStatement p=c.prepareStatement("insert into file values(?,?);");
			p.setString(1, "fi-1");
			p.setBlob(2,fin,fin.available());
			int r=p.executeUpdate();
			if(r>0)
				System.out.println("dbjdsbfjsb");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
