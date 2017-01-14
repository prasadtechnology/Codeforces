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

		if(numCups >= 1 && numCups <= 5){
			shelvesForCups = 1;
		}
		if(numMedals >= 1 && numMedals <= 10){
			shelvesForMedals = 1;
		}else{
		shelvesForCups = (int)Math.ceil((double)numCups/5);
		shelvesForMedals = (int)Math.ceil((double)numMedals/10);			
		}

		// System.out.println("No cup selves : "+shelvesForCups);
		// System.out.println("No medal selves : "+shelvesForMedals);
		System.out.println("cup : "+numCups);
		System.out.println("medal: "+numMedals);

		if(shelvesForCups + shelvesForMedals <= shelves){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}

