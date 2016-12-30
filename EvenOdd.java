import java.util.Scanner;

public class EvenOdd{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		long n = Long.parseLong(in.next());
		long k = Long.parseLong(in.next());

		long even = n/2;
		long odd  = even;
		if(n % 2 != 0){
			odd = odd + 1;
		}
		if(k <= odd){
		System.out.println(2*(k - 1) + 1);			
		}else{
		System.out.println(2*(k - odd));			
		}

	}
}

