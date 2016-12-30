import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Elephant{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		int n = Integer.parseInt(in.readLine());
		int bigsteps = n / 5;
		int result = bigsteps;

		if(n % 5 != 0){
			result = result + 1;			
		}
		System.out.println(result);
	}
}

