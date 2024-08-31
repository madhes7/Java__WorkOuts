package day_11;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class XML_Example_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			XML_Example xe=new XML_Example();
			File f=new File("D:\\21cs050\\java\\college.xml");
			SAXParserFactory sf=SAXParserFactory.newInstance() ;
			SAXParser sp=sf.newSAXParser();
			sp.parse(f, xe);
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
