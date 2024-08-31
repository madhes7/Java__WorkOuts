package day_11;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JAXB_demo_main {

	public static void main(String[] args) {
		try {
			 File f=new File("D:\\21cs050\\java\\employee.xml");
			 FileOutputStream fo=new FileOutputStream(f);
			 JAXB_Demo j=new JAXB_Demo();
			 JAXBContext x=JAXBContext.newInstance(JAXB_Demo.class);
			 Marshaller m=x.createMarshaller();
			 j.setEmp_id("emp_1");
			 j.setEmp_name("ABC");
			 j.setDesignation("ASDSA");
			 j.setSalary(200000.000);
			 
			 m.marshal(j, fo);
			
			 fo.close();
			 
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
