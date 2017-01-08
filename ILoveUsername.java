import java.util.Scanner;

public class ILoveUsername{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int first = in.nextInt();
		int maxAmaze = first;
		int minAmaze = first;
		int amazing = 0;
		for(int i = 1; i < n; i++){
			int score = in.nextInt();
			if(score > maxAmaze){
				maxAmaze = score;
				amazing++;		
			}else if(score < minAmaze){
				minAmaze = score;
				amazing++;
			}
		}
		System.out.println(amazing);
	}
}

