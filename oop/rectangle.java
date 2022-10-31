package in.co.oop;

public class rectangle extends Shape{
	private int lenght;
	private int width;
	
	public rectangle (){  }
	public rectangle (int i,int j) {   
		super();
		lenght=i;
		width=j;
		
	}
	
	public int getLenght() {
		return lenght;
	}
	
	public int getWidht() {
		return width;
	}
	
	//public void setLenght(int lenght) {
		//this.lenght= lenght;
	//}
	 
	//public void setWidth (int width) {
		//this.width=width;
	//}
public double area() {
		
		return lenght*width;
	}
	
	

}
