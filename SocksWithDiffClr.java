import java.util.Scanner;
public class SocksWithDiffClr{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int red = in.nextInt();
		int blue = in.nextInt();
		int min = Math.min(red,blue);
		System.out.print(min+" ");
		int max = Math.max(red,blue);
		System.out.println((max - min)/2);
	}
}