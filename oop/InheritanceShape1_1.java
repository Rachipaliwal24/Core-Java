package in.co.oop;

public class InheritanceShape1_1 {

	private String color;
	private int bw;
	private int side;
	
	public String getColor(){
		return color;
	}                                //public void setColor(String color){
                                     // this.color=color;}
	public int getBw() {
		return bw;
	}
	
	public int getSide() {
		return side;
	}                            
	
	// two parameterized constructor
	//public InheritanceShape1_1 (String color, int bw) {
		//super();
		//this.color=color;
		//this.bw=bw;
	
	
	//Default Constructor
	public InheritanceShape1_1 () {
		super ();
		System.out.println("inside Default Constructor");
	}
	
	// parameterized constructor
	public InheritanceShape1_1 (String color, int bw, int side) {
		super();
		this.color=color;
		this.bw=bw;
	    this.side=side;
	}
	
	//override method
	 public String toString () {
		 return color+" "+bw+" "+ side;
	 }
	 }




