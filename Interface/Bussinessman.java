package in.co.Interface;

public class Bussinessman implements Richman1, SocialWorker1 {
	
	private String name;
	private String type;
	
	public void donation () {
		System.out.println("giving donation" );
	}

	@Override
	public void helpToOthers() {
		System.out.println("help to other");
		
	}

	@Override
	public void earnMoney() {
		System.out.println("earn mony");
		
	}

	@Override
	public void Party() {
		System.out.println("party");
		
	}
	
	

}
