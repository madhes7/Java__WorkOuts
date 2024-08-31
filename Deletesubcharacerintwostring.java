package day5;

public class Deletesubcharacerintwostring {

	public static void main(String[] args) {
		
		String a="the quick brown fox";
		String aa="queen";
		StringBuilder b=new StringBuilder(a);
		StringBuilder c1=new StringBuilder();
		for(int i=0;i<aa.length();i++) {
           char c=aa.charAt(i);
        	
        	for(int j=0;j<b.length();j++) {
        		char d=b.charAt(j);
        		
        		if(c==d) {
        			 
                   b.setCharAt(j, '#');
        			break;
        		}
		}}
        	for(int i=0;i<b.length();i++) {
        		if(b.charAt(i)!='#') {
        			c1.append(b.charAt(i));
        		}
        	}

	
System.out.print(c1);
}

	}


