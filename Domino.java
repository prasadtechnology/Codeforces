import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Domino{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static int k = 2;
	static int n = 4;

	static String grid[] = new String[n];

	//right product
	static int rightProduct(int row, int start, int end){
		int product = 1;
		String str = grid[row];
		String input[] = str.split(" ");
		for(int i = start; i < end; i++){
			product = Integer.parseInt(input[i]) * Integer.parseInt(input[i+1]);
		}
		return product;
	}

	//bottom product
	static int bottomProduct(int col, int start,int end){
		int product = 1;
		for(int i = start; i < end; i++){
			String str1 = grid[start];
			String input1[] = str1.split(" ");

			String str2 = grid[start+1];
			String input2[] = str2.split(" ");

			product = Integer.parseInt(input1[col]) * Integer.parseInt(input2[col]);
		}
		return product;
	}

	//right diagonal product
	static int righDiagonalProduct(int row, int start, int end){
			int product = 1;

			String str1 = grid[row];
			String input1[] = str1.split(" ");		

			String str2 = grid[row+1];
			String input2[] = str2.split(" ");
		// for(int i = start; i < end; i++){

			product = Integer.parseInt(input1[start]) * Integer.parseInt(input2[start + 1]);
		// }
		return product;	
	}

	//leftDiagonalProduct
	static int leftDiagonalProduct(int row,int start,int end){
			int product = 1;


			String str1 = grid[row];
			String input1[] = str1.split(" ");		

			String str2 = grid[row + 1];
			String input2[] = str2.split(" ");
		// for(int i = start; i < end; i++){

			product = Integer.parseInt(input1[start]) * Integer.parseInt(input2[start - 1]);
		// }
		return product;						

	}

	public static void main(String[] args) throws Exception{
		for(int i = 0; i < n; i++){
		grid[i] = in.readLine();
		}
		int temp = 0;
		// for(int j = 0; (temp = j + k) <= n; j++){
		for(int j = 0; j < n; j++){
			// System.out.println(rightProduct(0,j,temp - 1));
			// System.out.println(bottomProduct(0,j,temp - 1));
			// System.out.println(righDiagonalProduct(0,j,temp - 1));
			if(j >= k - 1){
			System.out.println(leftDiagonalProduct(0,j,temp - 1));				
			}
		}
	}
}