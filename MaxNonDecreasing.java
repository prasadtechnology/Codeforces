import java.util.Scanner;

public class MaxNonDecreasing{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int input[] = new int[n];

		int maximum = 1;
		int count = 1;
		int prev = 0;
		
		for(int i = 0; i < n; i++){
			input[i] = in.nextInt();
			if(i != 0 && prev <= input[i]){
				count++;
				maximum = Math.max(count,maximum);
			}else{
				count = 1;
			}
			prev = input[i];
		}
		System.out.println(maximum);
	}
}