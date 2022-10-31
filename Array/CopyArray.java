package in.co.Array;

public class CopyArray {
	public static void main(String[] args) {
		char[] a= {'A', 'D', 'E'};
		char[] b= new char [2];
		System.arraycopy(a,1 , b, 0, 2);
		System.out.println(b);
		
	}

}
