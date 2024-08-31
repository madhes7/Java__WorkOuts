package day_11;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XML_Example extends DefaultHandler {
	boolean sname=false , semail=false;
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		
		if(qName.equals("students")) {
			String no=attributes.getValue("rollno");
			System.out.println("Roll no :"+no);
		}
		else if(qName.equals("name")) {
			sname=true;
		}
		else if(qName.equals("email")) {
			semail=true;
		}
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if(sname) {
			String name=new String(ch,start,length);
			System.out.println("Name :"+name);
			sname=false;
		}
		else if(sname) {
			String email=new String(ch,start,length);
			System.out.println("Name :"+email);
			semail=false;
		}
	}
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equals("students")) {
			System.out.println("*****************************************************");
		}
	}
}
