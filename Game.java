import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.BufferedOutputStream;

public class Game{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws Exception{
		String input[] = in.readLine().split(" ");
		int p1b = Integer.parseInt(input[0]); 
		int p2b = Integer.parseInt(input[1]);
		int p1p = Integer.parseInt(input[2]);
		int p2p = Integer.parseInt(input[3]);
		if(p1b == p2b || p1b < p2b){
			pw.println("Second");
		}else if(p2b < p1b){
			pw.println("First");
		}
		pw.close();
	}
}

