import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Stones
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		int n = Integer.parseInt(in.readLine());
		String str = in.readLine();
		int removeCount = 0;
		for(int i = 0; i < n-1; i++){
			if(str.charAt(i) == str.charAt(i+1)){
				removeCount++;
			}
		}
		System.out.println(removeCount);
	}
}