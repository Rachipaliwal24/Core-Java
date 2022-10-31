package in.co.Methodoverriding;

public class Tringle extends Shape {

	private int base;
	private int height;
	public Tringle() {}
	public Tringle (int b, int h) {
		super();
		base=b;
		height=h;
		
		}
	
	public int getBase() {
		return base;
	}
	
	
	public int getHeight() {
		return height;
	}
	
	
	//public void setBase (int base) {
	//	this.base=base;
	//}
	
	//public void  setHeight(int height) {
		//this.height=height;
//	}
	
public double area() {
		
		return base*height;
	}
	
}
	
	
	
	
	
	
