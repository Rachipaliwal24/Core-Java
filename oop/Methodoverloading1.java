package in.co.oop;

public class Methodoverloading1 {
	public static void main(String[] args) {

		display (1,3);
		display (8);
		display ("hey", "hello","hi");
		}
	
	private static void display(int i, int j) {
		System.out.println(i+j);
		}

	private static void display(int s) {
		System.out.println(s);
	}
	
	private static void display(String s, String t, String u) {
		System.out.println(s+","+t+ ","+u);
	}
	
}
