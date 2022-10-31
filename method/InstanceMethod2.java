package in.co.method;

public class InstanceMethod2 {
	public static void main(String[] args) {
		int a=50;
		int b=30;
		InstanceMethod2 obj = new InstanceMethod2();
		int s= obj.sum(a,b);
		
		System.out.println(s);
		
	}
	
	public static int sum (int m, int n) {
		return m+n;
	}

}
