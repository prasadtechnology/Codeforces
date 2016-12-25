/**
Check whether you can optimise the solution
**/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class MinCoinsTaken{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		int coins = Integer.parseInt(in.readLine()); 
		int sum[] = new int[coins];
		int input[] = new int[coins];

		String str = in.readLine();
		String values[] = str.split(" ");

		for(int i = 0; i < coins; i++){
			input[i] = Integer.parseInt(values[i]);
		}
		Arrays.sort(input);
		sum[0] = input[0];

		for(int k = 1; k < coins; k++){
			sum[k] = sum[k - 1] + input[k];
		} 


		int coinsTaken = 0;
		int coinsTakenSum = 0;
		int remainingSum = 0;

		for(int j = coins - 1; j > 0; j--){
			remainingSum = sum[j - 1];
			coinsTakenSum = sum[coins - 1] - remainingSum;
			coinsTaken++;
			if(remainingSum < coinsTakenSum){
				break;
			}
		}


		if(remainingSum == coinsTakenSum){
			coinsTaken++;
		}
		System.out.println(coinsTaken);
	}
}