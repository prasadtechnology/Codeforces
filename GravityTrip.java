import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;
public class GravityTrip{
	static StringBuilder sb = new StringBuilder("");
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		for(int j : a){
			sb.append(j +" ");
		}
		System.out.println(sb);
	}
}

