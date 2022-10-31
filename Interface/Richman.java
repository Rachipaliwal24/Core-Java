
package in.co.Interface;

public interface Richman {
void earnmoney ();
void donation();
void party();

interface socialworker{
	void helptoother();

public class Bussinessman implements Richman , socialworker {

	@Override
	public void helptoother() {
		// TODO Auto-generated method stub
		System.out.println("Helping Bussiness :)");
	}

	@Override
	public void earnmoney() {
		// TODO Auto-generated method stub
		System.out.println("Earning Bussiness :)");
	}

	@Override
	public void donation() {
		// TODO Auto-generated method stub
		System.out.println("Donating Bussiness :)");
	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
		System.out.println("Bussiness Party :)");
	}

	
}
}
}