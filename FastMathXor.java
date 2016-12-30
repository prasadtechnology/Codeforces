import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FastMathXor{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder("");
	public static void main(String[] args) throws Exception{
		String temp = in.readLine();
		int length = temp.length();
		String c1 = temp;
		String c2 =  in.readLine();
		
		for(int i = 0; i < length; i++){
			if(c1.charAt(i) != c2.charAt(i)){
				sb.append("1");
			}else{
				sb.append("0");
			}
		}
		System.out.println(sb);
	}
}

