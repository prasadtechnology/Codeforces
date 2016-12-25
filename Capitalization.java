import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Capitalization{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		String str = in.readLine();
		char c = Character.toUpperCase(str.charAt(0));
		System.out.println(c+str.substring(1)); 
	}
}