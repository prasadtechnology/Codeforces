/**
we can do it in 2n complexity
**/
import java.util.*;
public class printRhombus{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		String str[] = new String[n+1];
		for(int i = 0; i <= n; i++){
			if(i == 0){
				String s1 = "0";
				str[i] = s1;
			}else{
				String sb = str[i-1].substring(0,i);
				String sbr = new StringBuilder(sb).reverse().toString();
				str[i]=sb+i+sbr;
			}
		}
		for(int j = 0; j <= n; ++j){
			for(int k = 0; k < n - j; ++k){
				System.out.print("  ");
			}
			System.out.println(str[j].replace(""," ").trim());
		}
		for(int i = n-1; i >= 0; --i){
			for(int k = 0; k <= n-i-1; ++k){
				System.out.print("  ");
			}
			System.out.println(str[i].replace(""," ").trim());
		}
	}
}