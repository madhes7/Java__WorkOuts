package day9;


import java.io.*;

public class File_Explore {

	public static void main(String[] args) {
		try { 
			File f=new File("D:\\21cs050\\java\\happy.txt");
			FileOutputStream o=new FileOutputStream(f);
			
			int i=10;
			while( i!=0) {
				String s="Welcome";
				s+=i;
				byte[] b=s.getBytes();
			o.write(b);
			i--;}
		
			o.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
