import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
public class Garden{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int a[] = new int[4];
		for(int i = 0; i < 4; i++){
			a[i] = in.nextInt();
		}
		if(a[0] == a[2]){
			int xshift = Math.abs(a[1]-a[3]);
			pw.println((a[0]+xshift)+" "+ a[1]+" "+(a[2]+xshift)+" "+a[3]);
		}else if(a[1] == a[3]){
			int yshift = Math.abs(a[0]-a[2]);
			pw.println(a[0]+" "+ (a[1]+yshift)+" "+a[2]+" "+(a[3]+yshift));
		}else if(Math.abs(a[0] - a[2]) == Math.abs(a[1] - a[3])){
			pw.println(a[0]+" "+ a[3]+" "+a[2]+" "+a[1]);
		}else{
			pw.println(-1);
		}
		pw.close();
	}
}