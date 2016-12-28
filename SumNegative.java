import java.util.Scanner;
import java.math.BigInteger;
public class SumNegative{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		BigInteger bi = new BigInteger(in.next());
		BigInteger even = bi.mod(new BigInteger("2"));

		BigInteger addition =  bi.add(new BigInteger("1"));
		BigInteger result[] = addition.divideAndRemainder(new BigInteger("2"));
		// int value = (int)Math.ceil((n+1)/2);

		if(!even.equals(new BigInteger("0"))){
			result[0] = result[0].multiply(new BigInteger("-1"));
		}
		System.out.println(result[0]);
	}
}