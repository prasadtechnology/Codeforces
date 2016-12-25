import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class BoyOrGirl{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		String str = in.readLine();
		char c[] = str.toCharArray();
		int countDistinct = 0;
		for(char ch : c){
			if(!map.containsKey(ch)){
				map.put(ch, 1);
				countDistinct++;
			}
		}
		if(countDistinct % 2 == 0){
			System.out.println("CHAT WITH HER!");

		}else{
			System.out.println("IGNORE HIM!");
		}
	}
}