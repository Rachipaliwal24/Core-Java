package in.co.oop;

public class InheritanceRectangle1_4 {
	private double lenght;
	private double width;
	
	public double getLenght() {
		return lenght;
	}
	
    public void setlenght (double lenght) {
		this.lenght=lenght;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setwidth (double width) {
		this.width=width;
	}

	public double area() {
		
		return getLenght()*getWidth();
	}

}
