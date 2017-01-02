import java.util.Scanner;

public class VanyaCube{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int temp = 1;
		int height = 0;
		int level = 1;

		while(n >= temp){
			n = n - temp;			
			temp += ++level;
			height++;
		}
		
		System.out.println(height);
	}
}

