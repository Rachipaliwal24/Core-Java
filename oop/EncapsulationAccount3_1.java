package in.co.oop;

public class EncapsulationAccount3_1 {
	private String number;
	private String type;
	private double balance;
	
	//public EncapsulationAccount3_1() {
		
	//}
	//public EncapsulationAccount3_1(String s,String c,double i) {
		//number=s;
		//type=c;
	//	balance=i;
		//}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void  deposit( double i) {
		
		setBalance(getBalance()+i);
		
	}
	 public void withdraw(double j) {
		 
		 setBalance(getBalance()-j);
    }
	
}
