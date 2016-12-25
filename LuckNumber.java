import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LuckNumber{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		String str = in.readLine();
		int length = str.length();
		char c = str.charAt(0);

		int nearLuckyCount = 0;
		
		for(int i = 0; i < length; i++){
			char ch = str.charAt(i);
			if(ch == '4' || ch == '7'){
				nearLuckyCount++;
			}
		}

		if(nearLuckyCount == 4 || nearLuckyCount == 7){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}