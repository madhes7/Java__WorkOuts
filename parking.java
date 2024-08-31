package day3;
import java.util.*;
public class parking {

	public static void main(String[] args) {
		
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the condition : Parking-> P & Moving-> M");
				char n = s.next().charAt(0); 
				int arr[] = new int[20];
				
				if(n == 'P') {
					
					System.out.println("Enter the slat number *index : ");
					int i = s.nextInt();
					System.out.println("Enter the car number: ");
					System.out.println("Now slot storage is: "+arr[i]);
					int s1  = s.nextInt();
					arr[i] = s1;
					System.out.println("Your car is parked on  sloat number:"+i+" -> "+arr[i]);
					
				}
				if(n=='M') {
					System.out.println("Enter the slat *index  number:");
					int sn = s.nextInt();
					if(sn!=0) {
						arr[sn]=0;
						System.out.println("The slot is zero now");
						System.out.println("slot is :"+arr[sn]);
					}
				}
				
				s.close();
			}

		}