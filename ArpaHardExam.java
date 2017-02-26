import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class ArpaHardExam{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = {6,8,4,2};
		System.out.println((n==0)?1:a[n%4]);
	}
}