package in.co.oop;

public class ConstructorsPerson1_2 {
	public static void main(String[] args) {
		
		ConstructorsPerson1_1 c = new ConstructorsPerson1_1("rachi", "paliwal",1 );
		
		
		String name=c.getName();
		System.out.println(name);
		
		String password = c.getPassword();
	    System.out.println(password);
	    
		int id= c.getId();
		System.out.println(id);
	}
}
