package day10;


import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class File_indatabase {
	
// Clob only store the character
	
	public static void main(String[] args) {
		try
		{
			File f=new File("D:\\21cs050\\java\\WhatsApp Image 2024-06-06 at 15.24.48_019ac9c5.jpg");
			//FileReader fin=new FileReader(f); 
			FileInputStream fin=new FileInputStream(f);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","madhes","madhes");
//			PreparedStatement p=c.prepareStatement("insert into file2 values(?,?)");
			PreparedStatement p=c.prepareStatement("insert into file1 values(?,?)");
			p.setString(1,"fi-1");
			//p.setCharacterStream(2,fin,(int)f.length());
			p.setBinaryStream(2,fin,fin.available());
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



