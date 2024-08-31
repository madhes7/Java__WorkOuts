package day9;

import java.io.*;

public class File_Writter {

	public static void main(String[] args) {
		try {
		File f=new File("D:\\21cs050\\java\\happy.txt");
		String x="AAAA788A";
     	FileWriter d=new FileWriter(f);
     	BufferedWriter b=new BufferedWriter(d);
		
		
		b.write(x);
		b.close();
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
