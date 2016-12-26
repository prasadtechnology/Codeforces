import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QueueAtSchool{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		String input1 = in.readLine();
		String input2 = in.readLine();

		String str1[] = input1.split(" ");
		char c[] = input2.toCharArray();

		int n = Integer.parseInt(str1[0]);
		int t = Integer.parseInt(str1[1]);


		/**
		Best Approach
		for(int i = 0; i< t; i++){
			input2.replace("BG","GB");
		}
		**/
		for(int j = 0; j < t; j++){
			for(int i = 0; i < n - 1;){
				if(c[i] == 'B' && c[i+1] == 'G'){
						char temp = c[i];
						c[i] = c[i+1];
						c[i + 1] = temp;
						i = i + 2;
				}else{
					i = i + 1;
				}
			}
		}
		System.out.println(new String(c));
	}
}