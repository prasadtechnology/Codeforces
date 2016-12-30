import java.util.Scanner;

public class NewYearTransportation{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int a[] = new int[n];
		for(int i = 1; i < n; i++){
			a[i] = in.nextInt();
		}
		int sum = 1;
		while(sum < t){
			sum += a[sum];
		}
		String s = (sum == t) ? "YES" : "NO";
		System.out.println(s);
	}
}

