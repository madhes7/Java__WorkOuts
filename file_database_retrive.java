package day10;
import java.io.*;
// clob
import java.sql.*;
public class file_database_retrive {
public static void main(String dbd[])
{
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","madhes","madhes");
		Statement s=c.createStatement();
		ResultSet r=s.executeQuery("select*from file1");

		while(r.next()) {
			String g=r.getString(1);
			//Blob b=r.getBlob(2);
			Clob z=r.getClob(2);
			Reader b=z.getCharacterStream();
			
			//byte[] x=b.getBytes(1, (int)b.length());
			java.util.Random a=new java.util.Random();
			int ran=a.nextInt(100);
			File f=new File("D:\\21cs050\\java\\happy"+ran+".txt");
			//FileOutputStream o=new FileOutputStream(f);
			FileWriter o=new FileWriter(f);
			int i;
			while(( i=b.read())!=-1) {
				
			
			o.write(i);}
			o.close();
		}
	}catch(Exception ex)
	{
		ex.printStackTrace();
	}
}
}