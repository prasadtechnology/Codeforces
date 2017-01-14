import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BusToUdayaland{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder("");
	public static void main(String[] args) throws Exception{
		int n = Integer.parseInt(in.readLine());
		boolean find = false;

		/**
		Best solution is first build string builder

		if(sb.contains("OO")){
			System.out.println("YES");
			System.out.println(sb.replaceFirst("OO","++"));
		}else{
			System.out.println("NO");
		}
		**/

		for(int i = 0; i < n; i++){
			String in1 = in.readLine();

			if(!find){
				String left = in1.substring(0,2);
				String right = in1.substring(3);
			if(left.equals("OO")){
				left = "++";
				in1 = left+"|"+right;
				find = true;
			}
			else if(right.equals("OO")){
				right = "++";
				in1 = left+"|"+right;
				find = true;
			}				
			}
			sb.append(in1+"\n");
		}
		if(!find){
			System.out.println("NO");
		}else{
			System.out.println("YES"+"\n"+sb);
		}
	}
}

