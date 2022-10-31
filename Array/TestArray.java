package in.co.Array;

public class TestArray {
	public static void main(String[] args) {
		
		int [] table= {10,20,30,40,50};
		
		//int [] table = new int[5];   // 2 method of solving array 
		//table[0]=2; 
		//table [1]=4;
		//table [2]=5;
		//table [3]=9;
		//table [4]=8;
		
		String name = table.getClass().getName();	
		System.out.println(name);
		System.out.println(table [4]);
	
	
		int size = table.length;
		System.out.println(size);
		
	}

}
