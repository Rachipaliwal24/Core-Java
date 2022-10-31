package in.co.Collection;

import java.util.ArrayList;

public class ArrListExam {                                                        
       public static void main(String[] args) {
		
		ArrayList a =new ArrayList();
		a.add("one");
		a.add("two");
		a.add("three");
		a.add("four");
		
		System.out.println(a);
		
		
		int size = a.size();
		System.out.println(size); 
		
		
	for(int i=0; i<a.size(); i++) {
		
		System.out.println(i+":"+a.get(i));
		
	}
		for (Object obj:a) {
			System.out.println(obj);
			
		}
		
		Integer i=new Integer(4);
		a.add(i);
		System.out.println(a);
		
       

	
		
	}}

		
	
		
	
