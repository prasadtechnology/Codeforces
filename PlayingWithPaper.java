import java.util.Scanner;
public class PlayingWithPaper{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b  = in.nextLong();

		if(b == 1){
			System.out.println(a);
			return;	
		}

		long count = 0;
		while(b > 0){
			count += a/b;
			long temp = a;
			a = b;
			b = temp % b; 
		}	
		System.out.println(count);
	}
}