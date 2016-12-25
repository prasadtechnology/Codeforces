import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
class GCD{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder("");
	static int n = 0;
	public static int getGCD(int a,int b){
		int temp = 0;
		int max = Math.max(a,b);
		int min = Math.min(a,b);
		if(a == n){
			return a;
		}
		while((temp = (max % min)) > 0){
			max = min;
			min = temp;
		}
		int result = getGCD(a++,min);
		return result;
	}
	public static void main(String[] args) throws Exception{
		int a = 8;
		int b = 12;
		int max = b;
		int min = a;
		n = 2;
		int ar[] = new int(){8,12};
		int gcd = getGCD(a,b);
		System.out.println("GCD is : "+gcd);
	}
}