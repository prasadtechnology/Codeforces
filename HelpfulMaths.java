/**
Learn how to split string with +
**/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class HelpfulMaths{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder("");
	public static void main(String[] args) throws Exception{
		String str = in.readLine();
		int length = 1;
		String input[];

		if(str.contains("+")){
		input = str.split("\\+");
		Arrays.sort(input);
		
		length = input.length;
		for(int i = 0; i < length - 1; i++){
			sb.append(input[i]+"+");
		}
		sb.append(input[length - 1]);
		}else{
		sb.append(""+str.charAt(0));			
		}

		System.out.println(sb);
	}
}