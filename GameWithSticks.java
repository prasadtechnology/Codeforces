import java.util.Scanner;

public class GameWithSticks{
	static int a[][];
	static int rows;
	static int cols;
	static String winner = "Malvika";
	static void removeSticks(int row,int col){
		for(int i = row; i < cols; i++){
			a[row][i] = 1;
		}
		for(int j = row; j < rows; j++){
			a[j][col] = 1;
		}
		winner = (winner.equals("Malvika")) ? "Akshat" : "Malvika";
	}
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		rows = in.nextInt();
		cols = in.nextInt();
		a = new int[rows][cols];

		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				if(a[i][j] == 0){
					removeSticks(i,j);
					break;
				}
			}
		}
		System.out.println(winner);
	}
}