import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ChatRoom{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder("");
	public static void main(String[] args) throws Exception{
		String str = in.readLine();
		char input[] = str.toCharArray();
		int len = input.length;

		char helloCharacter[] = {'h','e','l','l','o'};
		boolean b[] = new boolean[5];
		Arrays.fill(b,false);

		int helloPointer = 0;
		for(int i = 0; i < len; i++){
			if(input[i] == helloCharacter[helloPointer]){
				b[helloPointer] = true;
				helloPointer++;
			}
			if(helloPointer == 5){
				break;
			}
		}

		for(int j = 0; j < 5; j++){
			if(!b[j]){
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}