import java.util.Scanner;
import java.io.PrintWriter;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
public class LinelandMail{
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	static StringBuilder sb = new StringBuilder("");
	public static void main(String[] args) throws Exception{
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];		
		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
		}
		for(int j = 0; j < n; j++){
			if(j == 0){
				sb.append(Math.abs(a[j] - a[j+1])+" ");
				sb.append(Math.abs(a[j] - a[n-1])+"\n");
			}else if(j == n-1){
				sb.append(Math.abs(a[j] - a[j-1])+" ");
				sb.append(Math.abs(a[j] - a[0]));
			}else{
				sb.append(Math.min(Math.abs(a[j] - a[j-1]),Math.abs(a[j] - a[j+1]))+" ");
				sb.append(Math.max(Math.abs(a[j]-a[n-1]),Math.abs(a[j]-a[0]))+"\n");
			}
		}
		pw.println(sb);
		pw.close();
	}
}