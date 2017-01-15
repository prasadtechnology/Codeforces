import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class BussinessTrip{
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int a[] = new int[12];
		for(int i = 0; i < 12; i++){
			a[i] = in.nextInt();
		}
		int days = 0;
		int total = 0;
		if(k == 0){
			pw.println(days);

		}else{
			Arrays.sort(a);

			for(int j = 11; j >= 0; j--){
				if(total < k){
					total += a[j];
					days++;
				}else{
					break;
				}
			}
			if(total < k){
				pw.println(-1);
			}else{
				pw.println(days);				
			}
		}

		pw.close();
	}
}

