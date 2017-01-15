import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
public class ZerosAndOnes{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws Exception{
		int n = Integer.parseInt(in.readLine());
		String str = in.readLine();

		int one = 0;
		int zero = 0;
		for(int i = 0; i < n;i++){
			if(str.charAt(i) == '0'){
				zero++;
			}else{
				one++;
			}
		}
		pw.println(Math.abs(one - zero));
		/** 
		worst approach
		// while(str.contains("1") && str.contains("0")){
		// 	if(str.contains("01")){
		// 	str = str.replaceFirst("01","");				
		// 	}else{
		// 		str = str.replaceFirst("10","");				
		// 	}
		// }
		// pw.println(str.length());
		**/
		pw.close();
	}
}

