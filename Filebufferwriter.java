package day9;

import java.io.*;


public class Filebufferwriter {
	public static void main(String[] args) {
		try {
			File f=new File("D:\\21cs050\\java\\happy1.txt");
			FileOutputStream o=new FileOutputStream(f);
//			BufferedOutputStream bf=new BufferedOutputStream(o);
			FilterOutputStream fo=new FilterOutputStream(o);
			
			String s="Welcome123";
			byte[] b=s.getBytes();
			fo.write(b);
			fo.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
}
