package in.co.oop;

public class EncapsulationAccount3_2 {
	public static void main(String[] args) {
		double d=444.0d;
		EncapsulationAccount3_1 a=  new EncapsulationAccount3_1 ();
        
        a.setNumber("priya");
		String number= a.getNumber () ;
		System.out.println(number);
		
		a.setType("saving");
		String type =a.getType ();
		System.out.println(type);
		
		a.setBalance(d);
        Double balance= a.getBalance();
		System.out.println(balance);
		
		a.deposit(20000);
		System.out.println(a.getBalance());
		
		a.withdraw(1000);
		System.out.println(a.getBalance());
		
	}
}
