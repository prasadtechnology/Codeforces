import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bananas{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		String str = in.readLine();
		String input[] = str.split(" ");
		int firstBananaCost = Integer.parseInt(input[0]);
		int havingMoney = Integer.parseInt(input[1]);
		int howManyWant = Integer.parseInt(input[2]);

		int sum = ((howManyWant+1)*howManyWant)/2;
		int totalCost = sum * firstBananaCost;
		
		if(totalCost <= havingMoney){
			System.out.println(0);	
		}else{
			System.out.println(totalCost - havingMoney);
		}
	}
}