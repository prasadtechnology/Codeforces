import java.util.Scanner;
import java.util.Arrays;
public class MaxInTable{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int sum[] = new int[n];
		Arrays.fill(sum,1);
		for(int i = 0; i < n-1; i++){
			for(int j = 1; j < n; j++){
				sum[j] += sum[j - 1];
			}
		}
		System.out.println(sum[n-1]);
	}
}

