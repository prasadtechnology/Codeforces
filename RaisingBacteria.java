import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
public class RaisingBacteria{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws Exception{
		int n = Integer.parseInt(in.readLine());
		int bacterias = 1;
		int temp = 0;
		while((temp = 2 * bacterias) <= n){
			bacterias = temp;
		}
		pw.println((n - bacterias) + 1);
		pw.close();
	}
}

