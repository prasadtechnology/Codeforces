import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
public class BrainsPhotos{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws Exception{
		String str[] = in.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		boolean colored = false;
		for(int i = 0; i < n; i++){
			String temp = in.readLine();
			if(temp.contains("C") || temp.contains("M") || temp.contains("Y")){
				colored = true;
			}
		}
		if(colored){
			pw.println("#Color");			
		}else{
			pw.println("#Black&White");
		}
		pw.close();
	}
}

