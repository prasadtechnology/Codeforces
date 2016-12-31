import java.util.Scanner;
public class Cheaptravel{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();

		if(m * a <= b){
			System.out.println(n * a);
		}else{
			int spcl = (n / m) * b;
			int min = Math.min((n % m)*a,b);
			System.out.println(spcl + min);  
		}
	}
}

