package day6;
/*2.Write a Java program to create a class called Vehicle with a method called drive().
 *  Create a subclass called Car that overrides the drive() method to print "Repairing a car".*/
class Vehical{
	void drive(){
		System.out.println("The Vehical");
	}
}
class Car extends Vehical{
	void drive(){
		System.out.println("Repairing car");
	}
}
public class VehicleCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Car c=new Car();
		c.drive();

	}

}
