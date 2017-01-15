import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
public class NewYearHurry{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws Exception{
		String input[] = in.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int minutes = Integer.parseInt(input[1]);
		int totalMinutes = 240;
		int timeForProblems = totalMinutes - minutes;

		int i = 1;
		int timeConsumed = 5;
		while(timeConsumed  <= timeForProblems){
			i++;
			timeConsumed += i * 5;
		}
		if(i - 1 > n){
			pw.println(n);
		}else{
			pw.println(i - 1);			
		}
		pw.close();
	}
}

