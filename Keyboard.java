import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
public class Keyboard{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	static StringBuilder sb = new StringBuilder("");
	public static void main(String[] args) throws Exception{
		String temp = "qwertyuiopasdfghjkl;zxcvbnm,./";

		String shift = in.readLine();
		String input = in.readLine();
		int length = input.length();
		int value = (shift.equals("R")) ? -1 : 1;

		for(int i = 0; i < length; i++){
				int index = temp.indexOf(input.charAt(i));
				if(index != -1){
					sb.append(temp.charAt(index + value));
				}
		}
		pw.println(sb);
		pw.close();
	}
}

