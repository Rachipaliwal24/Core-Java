package in.co.Collection;

import java.util.ArrayList;

public class TestCollection12 {
 public static void main(String[] args) {
	 ArrayList a = new  ArrayList();
	 
	  a.add("mera nam rachi");
	 
	 a.add("my name rachi");
	 
	 System.out.println(a);
	 
	//int size = a.size();
	//System.out.println(size);           1 // both are same method
	System.out.println(a.size());       //2
	 
	//print all element on collection 
	//for (Object b: a);
		//System.out.println(b);
	
		
		
	//convert collection into array
	Object[]arr = a.toArray();
	for (Object ele : arr) {
		String s= ele.toString();   //object covert string
		System.out.println(s);
	}
	
		for(int i=0; i<a.size(); i++) {
		System.out.println(i+""+a.get(i));
		}
		
		Integer c= new Integer(4);
		a.add(c);
		System.out.println(c);
		
		
	}
}

