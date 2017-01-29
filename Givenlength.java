/**
If you understand logic you will find beauty of DP
**/

import java.util.*;

public class Givenlength {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt(); 
		int sum = scan.nextInt(); 
		int sum1 = sum-1;
		if(sum==0&&length!=1||sum>9*length){
		 	System.out.println("-1 -1");
		 	return;
		}
		String str1 = "",str2 = "";

		for(int i = 0; i < length; i++){
			str1 += Math.min(9,sum);
			sum -= Math.min(9,sum);
		}
		for(int i = 0; i < length-1; i++){
			str2 = Math.min(9,sum1)+str2;
			sum1 -= Math.min(9,sum1);
		}
		System.out.println((sum1+1)+str2+" "+str1);
	}
}