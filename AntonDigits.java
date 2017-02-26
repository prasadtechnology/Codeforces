import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class AntonDigits{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = 4;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int a[] = {2,3,5,6};
		int min1 = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++){
			int temp = in.nextInt();
			if(i != 1){
				min1 = Math.min(temp,min1);
			}
			map.put(a[i],temp);
		}
		int min2 = Math.min(map.get(3),map.get(2)-min1);
		System.out.println(min1 * 256+min2 * 32);
	}
}