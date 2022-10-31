package in.co.cloning;
           // cloning 
public class Demo implements Cloneable {
	public String name = null;
	public BankAccount account = null;
	
	
	public Demo(String n) {
		name=n;
	    account = new BankAccount(10) ;
	    }
	
	
	public Object clone() throws CloneNotSupportedException{
		Customer c= (Customer)super.clone();
		return c;
		}
	
	public static void main(String[] args) {
		
		Customer c1= new Customer ("abc");
		Customer c2= c1;
		c2.account.balance=99999;
		c2.name="rays tech";
		
		System.out.println(c1.name);
		System.out.println("This is balance of c1:"+c1.account.balance);
		
		
		System.out.println(c2.name);
		System.out.println(c2.account.balance);
		
		
		
		
		
	}

}
