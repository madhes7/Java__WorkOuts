package day02;



public class Alternateprimenumber {

	public static void main(String[] args) {
		
		
		int a=100;
		int x=2;
		int s=0;
		while(a>0) {
			int i=2;
			int temp=(x/2);
			int f=0;
			
				 while(i<=temp) {
			 
				if(x%i==0) {
					
					f++;
					break;
				}
			i++;}
			if(f==0) {
				if(s%2==0) {
				System.out.print(x+" ");
				a--;
				}
				s++;
			}
	        x++;	
	}
			
	}

}
