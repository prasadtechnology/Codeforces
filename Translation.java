import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Translation{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		StringBuilder in1 = new StringBuilder(in.readLine());
		String in2 = in.readLine();
		String temp = new String(in1.reverse());
		if(in2.equals(temp)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}