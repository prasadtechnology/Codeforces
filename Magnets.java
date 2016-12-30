import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Magnets{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		int n = Integer.parseInt(in.readLine());
		int group = 1; 
		String prev = "";
		for(int i = 0; i < n; i++){
			if(i != 0){
				String current = in.readLine();
				if(current.charAt(0) == prev.charAt(1)){
					group++;
				}
				prev = current;
			}else{
				prev = in.readLine();
			}
		}
		System.out.println(group);
	}
}