import java.io.*;
import java.util.*;
public class CompilationErrors {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n =  in.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int i = 0;
		while(i < n){
			sum1 += in.nextInt();
			i++;
		}
		i = 0;
		while(i < n - 1){
			sum2 += in.nextInt();	
			i++;
		}
		i = 0;
		while(i < n - 2){
			sum3 += in.nextInt();
			i++;
		}

		System.out.println(sum1 - sum2);
		System.out.println(sum2 - sum3);
		
	}
}