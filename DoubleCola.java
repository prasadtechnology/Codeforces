/**
Very good problem
**/
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class DoubleCola{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		Map<Integer,String> names = new HashMap<Integer,String>();
		names.put(1,"Sheldon");
		names.put(2,"Leonard");
		names.put(3,"Penny");
		names.put(4,"Rajesh");
		names.put(5,"Howard");

		int stage = 1;
		int last = 5;
		int size = 5;
		int first = 1;

		while(n > last){
			size = 2 * size;
			last = size + last; 
			stage++;
		}
		first = last - size + 1;

		int step = (int)Math.pow(2,stage - 1);
		int block = 1;

		for(int i = first; i <= last; i = i + step){

			if(n >= i && n <= i + step - 1){
				System.out.println(names.get(block));
				break;
			}
			block++;
		}
	}
}