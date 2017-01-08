import java.util.Scanner;
import java.util.Arrays;
public class Drinks{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double total = 0f;
		for(int i = 0; i < n; i++){
			total += (in.nextInt())/100f;
		}
		// System.out.println(total);
		System.out.println((total/n) * 100);
	}
}

