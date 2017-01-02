import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Word{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		String input = in.readLine();
		char c[] = input.toCharArray();
		int lower = 0;
		int upper = 0;
		for(int i = 0; i < c.length; i++){
			if(Character.isUpperCase(c[i])){
				upper++;
			}else{
				lower++;
			}
		}
		if(lower >= upper){
			System.out.println(input.toLowerCase());
		}else{
			System.out.println(input.toUpperCase());
		}
	}

}

