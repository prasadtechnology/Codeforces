import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Accommodation{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		int n = Integer.parseInt(in.readLine());
		int freeRooms = 0;
		for(int i = 0; i < n; i++){
			String str = in.readLine();
			String input[] = str.split(" ");
			int alreadyPeople = Integer.parseInt(input[0]);
			int capacity = Integer.parseInt(input[1]);
			if(capacity - alreadyPeople >= 2){
				freeRooms++;
			}
		}
		System.out.println(freeRooms);
	}
}