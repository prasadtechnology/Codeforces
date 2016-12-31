import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pangram{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder("");
	public static void main(String[] args) throws Exception{
		int n = Integer.parseInt(in.readLine());
		String input = in.readLine();
		boolean visited[] = new boolean[26];
		for(int i = 0; i < input.length(); i++){
			int alphabet = (int)Character.toLowerCase(input.charAt(i)) - 97;
			if(visited[alphabet] == false){
				sb.append(input.charAt(i));
				visited[alphabet] = true;
			}
		}
		String result = (sb.length() == 26) ? "YES" : "NO";
		System.out.println(result);
	}
}

