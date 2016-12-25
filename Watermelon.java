import java.io.*;
import java.util.*;
public class Watermelon{
		static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder("");
	public static void main(String[] args) throws Exception{
		int n = Integer.parseInt(in.readLine());
		if(n < 3){
			System.out.println("NO");
		}
		else if(n % 2 == 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}