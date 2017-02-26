import java.util.*;
public class ApplemanToastMan{
	public static void main(String[] args) throws Exception{

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		int sum[] = new int[n];
		for(int i = 0; i < n; ++i){
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		for(int k = 0; k < n; ++k){
			if(k == 0){
				sum[k] = a[k];
			}else{
				sum[k] = sum[k-1]+a[k];
			}	
		}
		if(n == 1){
			System.out.println(a[0]);
		}else if(n == 2){
			System.out.println(2*sum[1]);
		}else{
			long total = 0L;
			total = 2*(long)sum[n-1];
			for(int i = 1; i < n-1; i++){
				total += (long)(sum[n-1]-sum[i-1]);
				// System.out.println("temp is : "+(sum[n-1] - sum[i-1]));
			}
			System.out.println(total);
		}
	}
}