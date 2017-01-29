import java.util.Scanner;
public class DrizilDate{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int steps = in.nextInt();
		int minSteps = Math.abs(a)+Math.abs(b);
		if(minSteps > steps){
			System.out.println("No");
			return;
		}
		String res = ((minSteps-steps)%2 == 0) ? "yes" : "No";
		System.out.println(res);
	}
}