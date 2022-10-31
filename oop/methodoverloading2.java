package in.co.oop;

public class methodoverloading2 {
public static void main(String[] args) {
	mep(1,2);
	mep (1,2,3);
	mep ("ram","shyam");	
	
}
private static void mep(int i, int j) {
	System.out.println(i+j);
}


private static void mep (int k, int x, int y) {
	System.out.println(k+x+y);
}


private static void mep (String l, String m) {
	System.out.println("l"+ ","+ "m"+"," );
	}
}
