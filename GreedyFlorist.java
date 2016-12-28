/**
It is wrong check in hackerrank 
**/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class GreedyFlorist{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int flowers = in.nextInt();
		int friends = in.nextInt();

		ArrayList<Long> flowersCost = new ArrayList<Long>();
		ArrayList<Long> sum = new ArrayList<Long>();
		for(int i = 0; i < flowers; i++){
			Long cost = in.nextLong();
			flowersCost.add(cost);
			if(i > 0){
			sum.add(sum.get(i - 1)+ cost);				
			}else{
				sum.add(cost);
			}
		}
		Collections.sort(sum);
		Collections.sort(flowersCost);

		if(friends >= flowers){
			System.out.println(sum.get(flowers - 1));			
		}else{
			Long after = sum.get(flowers - 1) - sum.get(flowers - 2 - 1);
			int count = 0;
			int tempCount = 2;
			Long tempSum = 0L;
			Long realSum = after;
			for(int i = flowers - friends - 1; i >= 0; i--){
				if(count == friends){					
					realSum += tempCount * tempSum;
					tempSum = 0L;
					count = 0;
					tempCount++;
				}
					tempSum += flowersCost.get(i);
					count++;

			}
			if(count != 0){
				realSum += tempCount * tempSum;
				System.out.println("Temp : "+realSum);
			}
			// System.out.println(realSum);
		}
	}
}