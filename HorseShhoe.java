import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class HorseShhoe{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < 4; i++){
		set.add(in.nextInt());
		}
		System.out.println(4 - set.size());
	}
}

