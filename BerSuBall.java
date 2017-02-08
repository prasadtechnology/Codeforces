import java.util.Scanner;
import java.util.Arrays;

public class BerSuBall{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int b[] = new int[n];
		for(int j = 0; j < n; j++){
			b[j] = in.nextInt();
		}
		int m = in.nextInt();
		int g[] = new int[m];
		for(int i = 0; i < m; i++){
			g[i] = in.nextInt();
		}

		Arrays.sort(b);
		Arrays.sort(g);
		int paired[] = new int[m];

		int count = 0;
		for(int k = 0; k < n; k++){
			for(int l = 0; l < m; l++){
				if(paired[l] != 1){
				   if(Math.abs(b[k]-g[l]) <= 1){
					count++;
					paired[l] = 1;
					break;
				   }
				}
			}
		}
		System.out.println(count);
	}
}