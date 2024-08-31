package day6;
//Write a Java program to create a class called Animal with a method called makeSound(). 
//Create a subclass called Cat that overrides the makesound() method to bark

class Dog{
	void makeSound(){
		System.out.println("B");
	}
}
class Cat extends Dog{
	void makeSound(){
		System.out.println("A");
	}
}
public class Dogcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.makeSound();
		
	}

}
