import java.io.BufferedReader;
import java.io.InputStreamReader;
public class HQ{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		String str = in.readLine();
		if(str.contains("H") || str.contains("Q") || str.contains("9")){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}