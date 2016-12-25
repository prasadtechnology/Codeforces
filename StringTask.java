import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringTask{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder("");
	public static void main(String[] args) throws Exception{
		String input = in.readLine();
		char c[] = input.toCharArray();
		for(char ch : c){
			char upper = Character.toUpperCase(ch);
			if(upper != 'A' && upper != 'E' && upper != 'I' && upper != 'O' && upper != 'U' && upper != 'Y'){
				char lower = Character.toLowerCase(ch); 
				sb.append("."+lower);
			}
		}
		System.out.println(sb);
	}
}