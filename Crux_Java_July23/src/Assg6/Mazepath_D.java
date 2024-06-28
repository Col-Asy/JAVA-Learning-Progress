package Assg6;

public class Mazepath_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mazePathGenerator("", 3, 3);
		System.out.println();
		System.out.println(count);
		

	}
	
	static int count = 0;
	static void mazePathGenerator(String path, int row, int col) {
		if(row==1 && col==1) {
			System.out.print(path + " ");
			count++;
		}
		
		
		if (row>1) {
			mazePathGenerator(path+'V', row-1, col);
		}
		
		if (col>1) {
			mazePathGenerator(path+'H', row, col-1);
		}
		
		if (col>1 && row>1) {
			mazePathGenerator(path+'D', row-1, col-1);
		}
	}

}
