import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Taken{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		int friends = Integer.parseInt(in.readLine());
		String gifts = in.readLine();
		String takenBy[] = gifts.split(" ");
		int givenBy[] = new int[friends];

		for(int i = 0; i < friends; i++){
			givenBy[Integer.parseInt(takenBy[i]) - 1] = i+1; 
		}
		for(int j = 0; j < friends; j++){
			System.out.print(givenBy[j] +" ");
		}
	}
}