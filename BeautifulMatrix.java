import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
public class BeautifulMatrix{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws Exception{
		int result = -1;
		int row = 0;
		int col = 0;
		for(int i = 0; i < 5; i++){
			String str = in.readLine();
			String temp = str.replaceAll("\\s+","");
			if(str.contains("1")){
				col = temp.indexOf("1")+1;
				row = i+1;
			}
		}
		pw.println(Math.abs(3-(row)) + Math.abs(3-(col)));
		pw.close();
	}
}

