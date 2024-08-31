package day02;
import java.util.*;
public class HiiHelloWelcome {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
				int a1=obj.nextInt();
				int a=1;
				while(a<=a1) {
				
				if(a%3==0 && a%5!=0)
				{
					System.out.println("Hai");
				}
				else if(a%5==0 && a%3!=0)
				{
					System.out.println("Hello");
				}
				
				else if(a%3==0 && a%5==0)
				{
					System.out.println("Welcome");
				}
				else
				{
					System.out.println("Not Divisible");
				}
				a++;
			}
obj.close();
		}}

	