package in.co.Array;

public class MultidimentionArray {
	public static void main(String[] args) {
		
		int[][]tables =new int[3][2]; // 3 raws 2 colum
		
		
		//add value in colum 1 
		tables[0][0]=2;
		tables[1] [0]=4;
		tables [2] [0]=3;
		tables [3][0]=5;
		
		//and add value in colum 2
		tables [0][1]=3;
		tables [1][1]=1;
		tables [2][1]=2;
		tables [3][1]=6;
	for (int row =0; row<tables.length ;  row++) {
		for (int col=0; col<tables[0].length ; col++) {
			System.out.println(tables[row][col]+"\t");
			System.out.println();
			}
		}
}
}
