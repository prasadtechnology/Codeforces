import java.util.Scanner;
import java.util.Arrays;

public class MaxValue{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		int arr[] = new int[4];

		arr[0] = a + b + c;
		arr[1] = a * b * c;
		arr[2] = (a + b) * c;
		arr[3] = a * (b + c);

		Arrays.sort(arr);

		System.out.println(arr[3]);

	}
}