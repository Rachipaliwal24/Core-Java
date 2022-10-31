package in.co.cloning;
              //deep cloning 
public class Deep implements Cloneable{
	public String name = null;
	public BankAccount account  = null;
	
	public Deep(String n) {
	name=n;
	account =new BankAccount(10) ;
	}
	
	public Object clone() throws CloneNotSupportedException{
		Deep d = (Deep)super.clone();
	return d;
	}
	
public static void main(String[] args) throws CloneNotSupportedException {
		
		Deep c1= new Deep ("ruchi");
		Deep c2= c1;
		
		c2.account.balance=125;
		c2.name="rakesh";
		
		System.out.println(c1.name);
		System.out.println (c1.account.balance);
		System.out.println(c1.clone());
		System.out.println(c1.hashCode());
		
		System.out.println(c2.name);
		System.out.println(c2.account.balance);
		System.out.println(c2.clone());
		System.out.println(c2.hashCode());
		
		
		
}
	

}




