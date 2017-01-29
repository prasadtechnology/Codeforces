import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
public class Pashmak{
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
		  a[i] = in.nextInt();
		}
		Arrays.sort(a);
		int max = a[n-1];
		int min = a[0];
		int count1 = 0;
		int count2 = 0;
		pw.print(a[n-1]-a[0] +" ");
		for(int j = 0;j < n; j++){
			if(a[j] == max){
				count1++;
			}else if(a[j] == min){
				count2++;
			}
		}
		if(a[0] == a[n-1])
		{
			System.out.println((long)n/2*(n-1));
		}
		else
		{
			System.out.println(minoc*maxoc);
		}
		pw.close();
	}
}