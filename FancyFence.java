/**
Reference
https://www.mathsisfun.com/geometry/regular-polygons.html
**/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
public class FancyFence{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	static StringBuilder sb = new StringBuilder("");
	public static void main(String[] args) throws Exception{
		int n = Integer.parseInt(in.readLine());
		for(int i = 0; i < n; i++){
			int interiorAngle = Integer.parseInt(in.readLine());
			double sides = (double)360/(180 - interiorAngle);
			int afterCeil = (int)Math.ceil(sides);
			if(sides - afterCeil == 0){
				sb.append("YES \n");				
			}else{
				sb.append("NO \n");
			}
 		}
 		pw.println(sb);
		pw.close();
	}
}

