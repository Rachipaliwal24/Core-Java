package in.co.oop;

public class Circle extends Shape{
	private int radius;
	
	public Circle() {
		}
	
	public Circle(int r) {
		super();
		 radius=r; 
	}
	
	//public int setRadius() {
		//return radius;
	//}
	
	public void getRadius(int radius) {
	this.radius=radius;
	}
	public double area () {
		return 3.14*radius*radius;
	}
	
}
