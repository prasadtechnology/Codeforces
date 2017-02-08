import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rewards{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		String cups = in.readLine();
		String medals = in.readLine();

		String cup[] = cups.split(" ");
		String medal[] = medals.split(" ");

		int shelves = Integer.parseInt(in.readLine());
		int numCups = 0;
		int numMedals = 0;
		for(int i = 0; i < 3; i++){
			numCups += Integer.parseInt(cup[i]); 
			numMedals += Integer.parseInt(medal[i]);
		}
		int shelvesForCups = 0;
		int shelvesForMedals = 0;

		shelvesForCups = (int)Math.ceil((double)numCups/5);
		shelvesForMedals = (int)Math.ceil((double)numMedals/10);			

		if(shelvesForCups + shelvesForMedals <= shelves){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}