package day5;
/*4.Write a Java program to divide a string into n equal parts.
 *  The given string is: abcdefghijklmnopqrstuvwxy
The string divided into 5 parts and they are:
abcde
fghij
klmno
pqrst
uvwxy*/
import java.util.*;
public class Stringequalparts {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int c=1;
		String a=s.nextLine();
		int x=a.length();
		for(int i=2;i<=(x/2);i++) {
			if(x%i==0) {
				c=i;
				break;
			}
		}
		int k=0;
		for(int i=0;i<(x/c);i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a.charAt(k));
				k++;
			}
			System.out.println();
		}
s.close();
	}

}
