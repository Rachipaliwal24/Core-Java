package in.co.Collection;

import java.util.*;

public class TestCollection {
	public static void main(String[] args) {
		Collection C =new ArrayList();
		
		// add element into collection
		
		C.add("bura mat dekho");           //index 0
        C.add("bura mat suno");            //index 1
        C.add("bura mat kaho");            //index 2
        
        System.out.println("lenght of collection :"+ C.size());
        
        // print all element of a collection 
               
        		for (Object ele:C) {
        	System.out.println(ele);
        }System.out.println();
        // convert collection into array
        Object []arr= C.toArray();
        for (Object ele : arr) {
        	String s = ele.toString();
        	System.out.println(s);
        }
	
	
	
	}

}
