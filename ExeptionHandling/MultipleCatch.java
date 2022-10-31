package in.co.ExeptionHandling;

import java.awt.AWTException;

import org.w3c.dom.events.EventException;

public class MultipleCatch {
	public static void main(String[] args) {
		String name ="rachi" ;
		
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(6));
			System.out.println(name.toCharArray());
	
		}
		catch (StringIndexOutOfBoundsException e ){
		System.out.println("small");
		e.printStackTrace();
		
		}
		
		
		catch (NullPointerException e) {
			System.out.println("null data");
			e.printStackTrace();
		}
		
		
		catch (EventException e) {
			System.out.println("awt");
			e.printStackTrace();
		}
		
		finally {
			System.out.println("final");
		}
		}
		
	}
