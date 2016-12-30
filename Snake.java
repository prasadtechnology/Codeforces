import java.util.Scanner;
import java.util.Arrays;

public class Snake{
	static StringBuilder sb = new StringBuilder("");
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		int cols = in.nextInt();
		boolean last = true;
		boolean first = false;
		for(int i = 0; i < rows; i++){
			char c[] = new char[cols];
			if(i % 2 == 0){
			Arrays.fill(c,'#');				
			}else{
				Arrays.fill(c,'.');
				if(last){
					c[cols - 1] = '#';
					last = false;
					first = true;
				}else{
					c[0] = '#';
					last = true;
					first = false;
				}
			}
			sb.append(new String(c)+"\n");
		}
		System.out.println(sb);
	}
}

