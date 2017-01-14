import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.HashMap;

public class RegistrationSystem{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws Exception{
		int n = Integer.parseInt(in.readLine());
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(int i = 0; i < n; i++){
			String temp = in.readLine();
			if(map.containsKey(temp)){
				int freq = map.get(temp);
				pw.println(temp+freq);
				map.put(temp,freq+1);
			}else{
				map.put(temp,1);
				pw.println("OK");
			}
		}
		pw.close();
	}
}

