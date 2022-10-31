package in.co.exercise64;

public class StringKeyMethod {
	public static void main(String[] args) {
		
	
	String n= "vijay Aloknath Chauhan";
	
	
	
	
	System.out.println("String Lenght:" + n.length());
	System.out.println("7 character:"+ n.charAt(6));
	System.out.println("index of alok:"+ n.indexOf("Alok"));
	System.out.println("1# pos of i :"+ n.indexOf("i"));
	System.out.println("last position of i :"+ n.lastIndexOf("i") );
	System.out.println("a is replace by b:"+ n.replace("a", "b"));
	System.out.println("Lower Name: "+n.toLowerCase());
	System.out.println("starts with vijay :"+ n.startsWith("vijay"));
	System.out.println("dad name:"+ n.substring(6) );
	
	
	
	
	}
	
}
