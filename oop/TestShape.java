
package in.co.oop;

public class TestShape {
	public static void main(String[] args) {

		Shape []s = new Shape[3];
        s[0]  = getShap(1);
		s [1] = getShap(2);
		s [2] = getShap(3);
		
		
		
double d=calarea(s);
System.out.println("TotelArea="+d);
	}
        private static Shape getShap(int i) {
		if(i==1)return new rectangle(7, 8);
		if(i==2)return new Tringle(6, 8);
		if(i==3)return new Circle(6);
		return null;
	}

	private static double calarea(Shape[] s) {
		double t=0;
		

		for(int i=0;i<s.length;i++) {
			t=t+s[i].area();
			System.out.println("Area ="+s[i].area());
		}
		return t;
	}
	

}
