package in.co.ExeptionHandling;

public class TestLoginException {
public static void main(String[] args) throws LoginException { //main method
	

	TestLoginException t = new TestLoginException (); //object
	
	
	
	try {
		t.authenticate ("adm");
		System.out.println("no exception found");  //try 
		}
	
	
	catch (LoginException e ) {
		System.out.println("user acces denied");  //catch
		}
	
	
	finally {
		System.out.println("this is finally block ");  //finally
		
	}
}
	
        public void authenticate(String name) throws LoginException {
		if (!"admin".equals (name)) {
		LoginException e =new LoginException ();
		throw e;                                   //new method authenticate
	}
	}
}
