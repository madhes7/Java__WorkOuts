package day5;
import java.util.*;
public class DifferentnumberpatternTallently {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int m = s.nextInt();
	    for(int i =n;i>0;i--)
	    {
	      
	      for(int j =m;j>0;j--)
	      {
	        if(j>=i)
	        {
	        System.out.print(" "+j);
	        }
	        else
	        {
	        System.out.print(" "+i);
	        }
	      }
	      System.out.println();
	    }
	  s.close();

	}

}
