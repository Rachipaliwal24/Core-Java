package in.co.Methodoverriding;

public class Shape {
	
	private String color;
	private int boaderwidth;
	
	public Shape() {
		
	}
	
	public Shape (String c, int b) {
	this.color =c;
	this.boaderwidth =b;
		
	}

	public int getBoaderwidth() {
		return boaderwidth;
	}

	//public void setBoaderwidth(int boaderwidth) {
		//this.boaderwidth = boaderwidth;
	//}

	public String getColor() {
		return color;
	}

	//public void setColor(String color) {
	//	this.color = color;
	//}
	
	public  double area() {
		return 0;
		
	}
	 

}
