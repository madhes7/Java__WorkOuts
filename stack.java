package day7;
import java.util.*;

public class stack {

	public static void main(String[] args) {
		Stack<String> animal=new Stack<>();
		animal.push("Dog");
		animal.push("Cat");
		System.out.println(animal.peek());
		System.out.println(animal);
		System.out.println(animal.pop());
		System.out.println(animal.pop());
		System.out.println(animal);

	}

}
