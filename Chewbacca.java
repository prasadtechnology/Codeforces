import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
public class Chewbacca{
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	static StringBuilder sb = new StringBuilder("");
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int temp = 0;
		for(int i = 0; i < str.length(); i++){
			temp = Character.getNumericValue(str.charAt(i));
			if(9-temp == 0 && i == 0){
				sb.append(Integer.toString(temp));
			}
			else if(temp > 4){
				sb.append(Integer.toString(9-temp));
			}else{
				sb.append(Integer.toString(temp));
			}
		}
		pw.println(sb);
		pw.close();
	}
}