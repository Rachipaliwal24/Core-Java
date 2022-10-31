package in.co.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EncapsulationPerson2_2 {
	public static void main(String[] args) throws ParseException {
			EncapsulationPerson2_1 a= new EncapsulationPerson2_1();
	
			SimpleDateFormat formate=new SimpleDateFormat("dd-mm-yyyy");
			Date dob=formate.parse("02-05-1989");
			
			a.setName("rachi");
	        a.setAddress("dubey colony");
	        a.setdob (dob);
	        
	        String Name=a.getName ();
	        System.out.println(Name);
	        
	 
	        String Address=a.getAddress();
	        System.out.println(Address);
	        
	   
	         Date dob1 =a.getdob();
	         System.out.println(dob1);
	         
	}	        

}
