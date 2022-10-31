package in.co.ExeptionHandling;

public class TestArithmatic {
	public static void main(String[] args) {
		int i=0;
		int j=15;
		
		
		try {
			int value = j/i;
			System.out.println(value);
		}
		 catch (Exception e) {
			 e.printStackTrace();
			//System.out.println("zero sv divide");
			//System.out.println(e.getMessage());
		 }
		finally {
			System.out.println("fanlly");
		}
		
		
		
		
		
	}

}
