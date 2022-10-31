package in.co.oop;

public class InheritanceTestShape1_5 {
	public static void main(String[] args) {
		
	
		 InheritanceCircle1_3 c = new InheritanceCircle1_3 (); 
		 InheritanceTriangle1_2 t = new InheritanceTriangle1_2 ();
		 InheritanceRectangle1_4 r = new InheritanceRectangle1_4 ();
		 
		 c.setRadius(5); 
		 t.setBase(8); 
		 t.setHeight(8);
		 r.setlenght(6);
		 r.setwidth(9); 
		 
		 
		System.out.println(c.area());
		System.out.println(t.area()); System.out.println(r.area());
	
	
	
		
	
	
	}

	
	
}
