package day6;

import java.util.Scanner;
/*3.Write a Java program to create a class called Shape with a method called getArea(). 
 * Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.*/
class Shape{
	void getArea(int l,  int b) {
		System.out.println("The area of square is"+l*l);
	}
}
class Rectangle extends Shape{
	void getArea(int l,  int b) {
		
		System.out.println("The area of Rectangle is"+l*b);
	}
}

public class Area {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int b=s.nextInt();
		Rectangle r=new Rectangle();
		r.getArea(l, b);
s.close();
	}

}
