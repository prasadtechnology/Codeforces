import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Composite{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static boolean isComposite(int n){
		for(int i = 2; i < n; i++){
			if(n % i == 0){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) throws Exception{
		int n = Integer.parseInt(in.readLine());
		for(int i = 4; i <= n/2; i++){
			if(isComposite(i)){
				int next = n - i;
				if(isComposite(next)){
				System.out.println(i+" "+next);
				break;
				}
			}
		}
	}
}