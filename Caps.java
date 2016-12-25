import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Caps{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		String str = in.readLine(); 
		String upper = str.toUpperCase();
		char ch = Character.toLowerCase(upper.charAt(0));
		String exceptFirst = ch + upper.substring(1);
		if(str.equals(upper)){
			System.out.println(str.toLowerCase());
		}
		else if(str.equals(exceptFirst)){
			String temp = upper.substring(1);
			System.out.println(upper.charAt(0) + temp.toLowerCase());
		}else{
			System.out.println(str);
		}
	}
}