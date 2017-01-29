import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.Map;
public class FreeCash{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws Exception{
		int n = Integer.parseInt(in.readLine());
		TreeMap<String,Integer> map = new TreeMap<String,Integer>();
		for(int i = 0; i < n; i++){
			String str = in.readLine();
			if(map.containsKey(str)){
				map.put(str,map.get(str)+1);
			}else{
				map.put(str,1);
			}
		}
		int max = 1;
		for(Map.Entry<String,Integer> entry : map.entrySet()){
			if(entry.getValue() > max){
				max = entry.getValue();
			}
		}
		pw.println(max);
		pw.close();
	}
}