import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DubStep{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		String remix = in.readLine();
		String original = remix.replaceAll("WUB"," ").trim(); // It will replace WUB with space
		System.out.println(original.replaceAll("( )+"," ")); //It will remove spaces between the string

	}
}