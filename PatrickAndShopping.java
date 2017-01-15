import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
public class PatrickAndShopping{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws Exception{
		String a[] = in.readLine().split(" ");

		int leftHome = Integer.parseInt(a[0]);
		int rightHome = Integer.parseInt(a[1]);
		int direct = Integer.parseInt(a[2]);

		int dist = 0;
		boolean visitedright = true;
		if(leftHome < rightHome){
			dist = leftHome;
			visitedright = false;
		}else{
			dist = rightHome;
		}

		int value = (visitedright) ? leftHome : rightHome;
		int finalDist = Math.min(2*dist+2*direct,Math.min(2*dist + 2*value,(dist+direct+value)));

		pw.println(finalDist);

		pw.close();
	}
}

