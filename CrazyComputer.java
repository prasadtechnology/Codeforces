import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
public class CrazyComputer{
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);		
		int n = in.nextInt();
		int c = in.nextInt();
		int a[] = new int[n];
		int countWords = 1;

		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
			if(i != 0){
			  if(a[i] - a[i-1] <= c){
				countWords++;
			  }else{
				countWords = 1;
			  }
			}
		}
		pw.println(countWords);
		pw.close();
	}
}