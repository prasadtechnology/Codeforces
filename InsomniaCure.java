import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsomniaCure{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		int k = Integer.parseInt(in.readLine());
		int l = Integer.parseInt(in.readLine());
		int m = Integer.parseInt(in.readLine());
		int n = Integer.parseInt(in.readLine());
		int d = Integer.parseInt(in.readLine());

		if(k == 1){
			System.out.println(d);
			return;
		}


		/**
		Best way is 
		for(int i = 1; i <= d; i++){
			if(i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0){
				beatenCount++;
			}
	
		}
		**/
		
		int a[] = new int[d+1];
		Arrays.fill(a,0);

		int div[] = {k, l, m, n};
		int temp = 0;
		int beatenCount = 0;

		for(int i = 0; i < 4; i++){
			for(int j = 1; (temp = div[i] * j) <= d; j++){
				if(a[temp] == 0){
					a[temp] = 1;
					beatenCount++;
				}
			}	
		}
		System.out.println(beatenCount);

	}
}