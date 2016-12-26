import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class BeautifulYear{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static boolean isDistinct(String st){
		int length = st.length();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i = 0; i < length; i++){
			if(map.containsKey(st.charAt(i))){
				return false;
			}else{
				map.put(st.charAt(i),1);
			}
		}
		return true;
	}
	public static void main(String[] args) throws Exception{
		String str = in.readLine();
		int year = Integer.parseInt(str);
		int next = ++year;
		while(true){
			if(isDistinct(Integer.toString(next))){
				System.out.println(next);
				break;
			}else{
				next++;
			}
		}
	}
}