package in.co.exercise64;

public class Occurrence {
	public static void main(String[] args) {
		String s1= "ramsham rachirakesh"; 
		String s =s1.toLowerCase();         // convert upper case to lower case
		int t=0;
		
		
		
		for (char c='a' ;  c<='z';  c++, t=0) { //char a to z loop
			for (int i=0; i<s.length(); i++) {
				
				if(s.charAt(i)==c ) {
			t++;	
			}
		    }
			if(t!=0) {
				System.out.println(c +"="+ t);
				t=0;
			}
	        }		
	        }
}

