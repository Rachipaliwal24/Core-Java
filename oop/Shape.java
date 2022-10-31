package in.co.oop;

public abstract class Shape {
	
	private String color;
	private int boaderwidth;

	public int getBoaderwidth() {
		return boaderwidth;
	}

	public void setBoaderwidth(int boaderwidth) {
		this.boaderwidth = boaderwidth;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double area() ;
	 

}
