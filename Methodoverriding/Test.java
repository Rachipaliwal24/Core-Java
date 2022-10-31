package in.co.Methodoverriding;

public class Test  {
	public static void main(String[] args) {
		
		Shape A = new Shape ("black",4);
		
		Tringle B =new Tringle(5,10);
		rectangle C= new rectangle (2,10);
		Circle D=new Circle (10);
		
		System.out.println(B.area());
		System.out.println(C.area());
		System.out.println(D.area());
		System.out.println(A.getBoaderwidth());
		System.out.println(A.getColor());
		
		
		
		
		//Shape []s=new Shape[3];
		//s[0]=new Circle();
		//Circle c=(Circle)s[0];
		//c.set
		
		
		
		
		
		//System.out.println(s.getColor());
		//System.out.println(s.getBoaderwidth());
		
}
		

}
