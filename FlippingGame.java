import java.io.*;
import java.util.*;
public class FlippingGame {
	static void flipCoins(int a[],int start,int end){
		for(int i = start; i <= end; i++){
			a[i] = a[i] == 0 ?  1 : 0;
		}
	}
	static int countMaxOne(int a[]){
		int count = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] == 1){
				count++;
			}
		}

		return count;
	}
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n =  in.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
		}
		int temp[] = Arrays.copyOf(a,n);

		int maxOne = Integer.MIN_VALUE;
		for(int o = 0; o < n; o++){
			for(int m = o; m < n; m++){
				flipCoins(a,o,m);
				maxOne = Math.max(maxOne,countMaxOne(a));
				a = Arrays.copyOf(temp,n);
			}
		}
		System.out.println(maxOne);
	}
}