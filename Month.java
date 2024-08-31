package day02;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Month: ");
		String m=sc.nextLine().toLowerCase();
		switch(m) {
		case "january":
		case "march":
		case "may":
		case "july":
		case "august":
		case "october":
		case "december":
			System.out.print("31 days");
		    break;
		    
		    
		case "feburary":
			System.out.print("Ordinary Year:28 days\nLeap Year:29 days");
			break;
		
		case "april":
		case "june":
		case "september":
		case "november":
			System.out.print("30 days");
			break;
		
			
		default:
			System.out.print("Not a Month");
		}
		sc.close();
	}

}