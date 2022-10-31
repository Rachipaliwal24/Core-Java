
package in.co.oop;

public class InheritanceTriangle1_2 extends InheritanceShape1_1  {

	private int base;
	private int height;
	
	public int getBase() {
		return base;
	}
	
	public int getHeight () {
		return height;
	}
	
	public void setBase(int base) {
		this.base=base;
	}
	
	public void setHeight (int height) {
	this.height=height;
	}
	
	public double area() {
		return 0.5*base*height;
		}
	    }
