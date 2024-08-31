package day10;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class StoreData {
	
	    public static  void main(String[] str) {
	      
	       
	        try {
	           /* Scanner s = new Scanner(System.in);
	            System.out.println("Roll no");
	            int regno = s.nextInt();
	            s.nextLine(); // Consume newline left-over
	            System.out.println("Name:");
	            String name = s.nextLine();*/

	            Class.forName("com.mysql.cj.jdbc.Driver"); // Updated driver class for newer versions of MySQL
	            Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/placement", "root", "");

	           /* PreparedStatement ps = con.prepareStatement("INSERT INTO stud (rollno, name) VALUES (?, ?)");
	            ps.setInt(1, regno);
	            ps.setString(2, name);

	             ps.execute();*/
	            PreparedStatement ps=con.prepareStatement("Select* from stud");
	            ResultSet res= ps.executeQuery();
                while(res.next()) {
                	System.out.println(res.getString(1)+" "+res.getString(2));
                }
//	            if (res > 0) {
//	                System.out.println("Success");
//	            }

	            // Close resources
	            ps.close();
	            con.close();
	            //s.close();

	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }}
	
