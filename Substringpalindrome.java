package day5;/*Write a java progarm to find the longest palindromic substring within a string.
 * str=thequickbrownfoxxofnworbquickthe
 * ans brownfoxxofnworb
 */



import java.util.Scanner;
public class Substringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str="thequickbrownfoxxofnworbquickthe";
		int prev=0;
		
		int i1=0,j1=0;
		for(int i=0;i<str.length();i++) {
			int c=0;
			for(int j=str.length();j>i;j--) {
				String a=str.substring(i,j);
				StringBuilder s=new StringBuilder(a);
				s.reverse();
				
				if((s+"").equals(a)){c=a.length();if(prev<c) {prev=c; i1=i;j1=j;}}
			}
		}System.out.print(str.substring(i1,j1));
		sc.close();
	}

}