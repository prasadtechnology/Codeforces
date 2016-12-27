import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LCMOfArray{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static int getGCD(int a,int b){
		int max = Math.max(a,b);
		int min = Math.min(a,b);
		int temp = 0;
		while((temp = max % min) > 0){
			max = min;
			min = temp;
		}
		return min;
	}
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);

		int aSetLength = in.nextInt();
		int bSetLength = in.nextInt();
		int a[] = new int[aSetLength];
		int b[] = new int[bSetLength];
		for(int l = 0; l < aSetLength; l++){
			a[l] = in.nextInt();
		}
		for(int m = 0; m < bSetLength; m++){
			b[m] = in.nextInt();
		}
		int LCM = a[0];
		int gcd = 0;
		for(int i = 1; i < a.length; i++){
			int product = LCM*a[i];
			gcd = getGCD(LCM,a[i]);
			LCM = product/gcd;
		}
		// System.out.println("LCM is :"+LCM);
		int value = b[0];
		for(int j = 1; j < b.length; j++){
			value = getGCD(value,b[j]);
		}

		int factor = 0;
		int count = 0;
		for(int k = 1; (factor = k * LCM) <= value; k++){
			if(value % factor == 0){
				count++;
			}
		}
		System.out.println(count);
	}
}