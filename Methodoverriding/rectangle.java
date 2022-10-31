package in.co.Methodoverriding;

//oop ex que 5 immuteable class
//can not be child created



public final class rectangle extends Shape{ 
	private final int lenght;
	private final int width;
	
	//public rectangle(){  
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
