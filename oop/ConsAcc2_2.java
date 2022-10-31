package in.co.oop;

public class ConsAcc2_2 {
	public static void main(String[] args) {
		
	
	ConsAcc2_1 a = new ConsAcc2_1 ("rachi", "saving", 2000);


	String nubmer = a.getNumber();
	System.out.println(nubmer);
	
	String type = a.getType();
	System.out.println(type);
	
	double balance =a.getBalance();
	System.out.println(balance);
	a.deposit(5000);
	System.out.println(a.getBalance());
	a.withdraw(5000);
	System.out.println(a.getBalance());
	
	}


			 
	
	
	

	
	
	

}
