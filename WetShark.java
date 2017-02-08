import java.util.Scanner;
public class WetShark{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		long sum[] = new long[n];
		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
			if(i != 0){
				sum[i] = sum[i-1]+a[i];
			}else{
				sum[i] = a[i];
			}
		}
		if(sum[n-1] % 2 == 0){
			System.out.println(sum[n-1]);
		}else{
			long maxEven = 0L;
			for(int j = 0; j < n; j++){
				long temp = sum[n-1] - a[j];
			 	if((temp)%2 == 0 && maxEven < temp){
			 		maxEven = temp;
			 	}
			}
			System.out.println(maxEven);
		}

	}
}
