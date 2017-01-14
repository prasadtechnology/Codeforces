import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.HashMap;

public class MultiplicationTable{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws Exception{
		String input[] = in.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int search = Integer.parseInt(input[1]);

		int count = 0;
		//N solution
		for(int i = 1; i <= n; i++){
			if(search % i == 0 && search/i <= n) {
				count++;
			}
		}
		/** 
		N2 solution 
		// for(int i = 1; i <= n; i++){
		// 	for(int j = 1; j <= n; j++){
		// 		if(i * j == search){
		// 			count++;
		// 		}
		// 	}
		// }
		**/
		pw.println(count);
		pw.close();
	}
}

