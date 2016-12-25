import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Taxi{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		int n = Integer.parseInt(in.readLine());
		String input = in.readLine();
		String groups[] = input.split(" ");
		Arrays.sort(groups);

		int leftPointer = 0;
		int totalTaxies = 0;

		for(int i = n - 1; i >= leftPointer ; i--){
			int group = Integer.parseInt(groups[i]);
			if(group < 4){
				while((group = group + Integer.parseInt(groups[leftPointer])) <= 4 && leftPointer < i){
				leftPointer++;					
				}
			}
			if(leftPointer == i){
				totalTaxies++;
				break;
			}
			totalTaxies++;
		}
		System.out.println(totalTaxies);
	}
}