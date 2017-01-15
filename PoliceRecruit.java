import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
public class PoliceRecruit{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws Exception{
		int n = Integer.parseInt(in.readLine());
		String input[] = in.readLine().split(" ");
		int untreated = 0;
		int police = 0;
		for(int i = 0; i < n; i++){
			if(input[i].equals("-1")){
				if(police > 0){
					police--;
				}else{
					untreated++;
				}
			}else{
				police += Integer.parseInt(input[i]);
			}
		}
		pw.println(untreated);
		pw.close();
	}
}

