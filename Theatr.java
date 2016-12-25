import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Theatr{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		String input = in.readLine();
		String st[] = input.split(" ");
		Long m  = Long.parseLong(st[0]);
		Long n = Long.parseLong(st[1]);
		Long a = Long.parseLong(st[2]);

		Long rows = m / a;
		Long cols = n / a;

		if(m % a > 0){
			rows += 1L; 
		}
		if(n % a > 0){
			cols += 1L;
		}
		System.out.println(rows * cols);
	}
}