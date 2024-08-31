package day_11;

import java.io.File;

import javax.xml.parsers.*;
import javax.xml.parsers.DocumentBuilderFactory;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.*;

public class DOM_Parser {

	public static void main(String[] args) {
		try {
			File f=new File("D:\\21cs050\\java\\college.xml");
			DocumentBuilderFactory di= DocumentBuilderFactory.newInstance();
			DocumentBuilder df=di.newDocumentBuilder();
			Document d=df.parse(f);
			NodeList nl=d.getElementsByTagName("students");
			for(int i=0;i<nl.getLength();i++)
			{  
				Node n= nl.item(i);
				if(Node.ELEMENT_NODE == n.getNodeType()) {
					Element ele = (Element)n;
					String  rollno = ele.getAttribute("rollno");
					String name = ele.getElementsByTagName("name").item(0).getTextContent();
					String email = ele.getElementsByTagName("email").item(0).getTextContent();
					
					
					System.out.println("Roll.No : "+rollno);
					System.out.println("Name : "+name);
					System.out.println("E-mail : "+email);
					
					System.out.println("-------------------------");
					
				}
				
				
				}
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
