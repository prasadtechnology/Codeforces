import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Hulk{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder("");
	static void buildString(int n){
		if(n == 0){
			return;
		}
		buildString(n - 1);
		if(n % 2 == 0){
			sb.append("I love that ");
		}else{
			sb.append("I hate that ");
		}
	}
	public static void main(String[] args) throws Exception{
		int n = Integer.parseInt(in.readLine());
		buildString(n);			
		String s = sb.substring(0,(sb.length() - 5));
		System.out.println(s+"it");
	}
}