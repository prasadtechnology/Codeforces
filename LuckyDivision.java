import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LuckyDivision{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static boolean checkLucky(String temp){
		int length = temp.length();
		for(int i = 0; i < length; i++){
			char c = temp.charAt(i);
			if(c == '4' || c == '7'){
				continue;
			}else{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws Exception{
		String temp = in.readLine();
		int n = Integer.parseInt(temp);
		if(checkLucky(temp)){
			System.out.println("YES");
			return;
		}
		for(int i = 4; i < n; i++){
			if(checkLucky(Integer.toString(i)) && n % i == 0){
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");

	}
}