package in.co.oop;

public class InheritanceCircle1_3 extends InheritanceShape1_1 {
	
	private double radius;
	
	//public InheritanceCircle1_3() {
		// TODO Auto-generated constructor stub
	//}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
	this.radius =radius;	
	}
	 public double area() {
		 return 3.14*radius*radius;
	 }
}
