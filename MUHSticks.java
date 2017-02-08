import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class MUHSticks{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int temp = 0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i < 6; i++){
			temp = in.nextInt();
			if(map.containsKey(temp)){
				map.put(temp,map.get(temp)+1);
			}else{
				map.put(temp,1);
			}
		}
		if(map.size() > 3){
			System.out.println("Alien");
		}
		else if(map.size() == 1){
			System.out.println("Elephant");
		}
		else if(map.size() == 3){
			System.out.println("Bear");
		}else{
			int prevKey = 0;
			int prevValue = 0;
			int currKey = 0;
			int currValue = 0;

			for(Map.Entry<Integer,Integer> entry : map.entrySet()){
				if(prevValue != 0){
					prevKey = entry.getValue();
					prevValue = entry.getKey();
				}else{
					currKey = entry.getValue();
					currValue = entry.getKey();						
				}
			}
			if(prevKey > currKey){
			    System.out.println("Bear");	
			}else{
				System.out.println("Elephant");
			}
		}
	}
}