import java.util.Scanner;

public class RingRoad{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int houses = in.nextInt();
		int tasks = in.nextInt();
		int task[] = new int[tasks+1];

		int current = 1;
		int target = 1;
		int totalUnit = 0;

		for(int j = 1; j <= tasks; j++){
			task[j] = in.nextInt();
		}

		for(int i = 1; i <= tasks; i++){
			target = task[i];
			if(target >= current){
				totalUnit += target - current;
			}else{
				totalUnit += (houses - current) + target;
			}
			current = target;
		}

		System.out.println(totalUnit);
	}
}

