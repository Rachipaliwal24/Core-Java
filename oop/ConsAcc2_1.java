package in.co.oop;

public class ConsAcc2_1 {
	private String number;
	private String type;
	private double balance;
	
public 	ConsAcc2_1 () {
	}
public ConsAcc2_1 (String n, String t, double b) {
	number = n;
	type = t;
	balance = b;
}

public String getNumber() {
	return number;
}

public String getType() {
	return type;
}
public double getBalance() {
	return balance;
}


public void deposit( double i) {
	
	balance=(getBalance()+i);
	
}
 public void withdraw(double j) {
	 
	balance=(getBalance()-j);

 }


}

	
	
	
	
	
	
