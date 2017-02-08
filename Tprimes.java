import java.util.Scanner;
import java.util.Arrays;
public class Tprimes{
	static StringBuilder sb = new StringBuilder("");
	public static void main(String[] args) throws Exception{
		int primes[] = new int[10000001];
		Arrays.fill(primes,1);
		primes[0] = 0;
		primes[1] = 0;

		for(int i = 2; i < Math.sqrt(10000000); i++){
			if(primes[i] == 1){
				for(int j = i; i*j < primes.length;j++){
					primes[i*j] = 0;
				}
			}
		}

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double temp = 0;

		for(int i = 0; i < n; i++){
			temp = Double.parseDouble(in.next());
			double sqr = Math.sqrt(temp);
			if(sqr == (int)sqr && primes[(int)sqr] == 1){
				   sb.append("YES"+"\n");
			}else{
				   sb.append("NO"+"\n");
			}
		}
		System.out.println(sb);
	}
}