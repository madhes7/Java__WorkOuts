package day02;

import java.util.Scanner;
public class Hike {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		double salary,performance,hike;
		salary=sc.nextDouble()*12;
		performance=sc.nextDouble();
		if(performance>=80) {
			hike=salary*0.3;
		}
		else {
//			double diff=80-performance;
//			hike=salary*((30-((diff)*(0.3)))/100);
			double diff=(performance/80)*100;
			hike=salary*((30*diff)/100)/100;
		}
		System.out.print("Annual CTC:"+(salary+hike)+("\n[Salary:"+salary+"  hike:"+hike+"]"));
		sc.close();
	}
}

