import java.io.*;

public class LongWords{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder("");
	public static void main(String[] args) throws Exception{
		int test = Integer.parseInt(in.readLine());
		for(int i = 0; i < test; i++){
			String str = in.readLine();
			int length = str.length();
			if(length > 10){
				char first = str.charAt(0);
				char last = str.charAt(length-1);
				sb.append(first+Integer.toString((length - 2))+last+"\n");
			}else{
				sb.append(str+"\n");
			}
		}
		System.out.println(sb);
	}
}