package in.co.oop;

public class StudentTest {
public static void main(String[] args) {
	StudentBeen a=new StudentBeen();
		a.setRollNO("123");
	    a.setFirstName("rachi");
	    a.setLastName("paliwal");
		a.setSession("first");
		
		
		String rollNO =a.getRollNO();
		System.out.println(rollNO);
		
		String firstName = a.getFirstName();
		System.out.println(firstName);    
		
		String lastName = a.getLastName();
		System.out.println(lastName);
		
		String session =a.getSession();
		System.out.println(session);
	
}
}
