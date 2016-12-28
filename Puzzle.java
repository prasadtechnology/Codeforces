import java.util.Scanner;
import java.util.Arrays;
public class Puzzle{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int students = in.nextInt(); 
		int puzzles = in.nextInt(); 
		int puzzleValue[] = new int[puzzles];
		for(int i = 0; i < puzzles; i++){
			puzzleValue[i] = in.nextInt();
		}
		Arrays.sort(puzzleValue);
		int minDiff = Integer.MAX_VALUE;
		int temp = 0;
		for(int j = 0; (temp = j + students) <= puzzles; j++){
			minDiff = Math.min(minDiff, puzzleValue[temp - 1] - puzzleValue[j]);
		}
		if(minDiff == Integer.MAX_VALUE){
		System.out.println(0);
		}else{
			System.out.println(minDiff);
		}
	}
}