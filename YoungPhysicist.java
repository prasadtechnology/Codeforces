import java.util.Scanner;
public class YoungPhysicist{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		int total = 3 * test;
		// int eq[] = new int[total];

		int xSum = 0;
		int ySum = 0;
		int zSum = 0;
		
		for(int i = 0; i < total; i = i + 3){
			switch(i % 3){
				case 0 : xSum += in.nextInt();
				case 1 : ySum += in.nextInt();
				case 2 : zSum += in.nextInt();
			}
		}
		if(xSum == 0 && ySum == 0 && zSum == 0){
		System.out.println("YES");	
		}else{
		System.out.println("NO");	
		}
		

		// for(int i = 0; i < total; i++){
		// 	eq[i] = in.nextInt();
		// }
		// for(int j = 0; j < 3; j++){
		// 	int temp = j;
		// 	int tempSum = 0;
		// 	for(int k = 0; k < test && temp < total;k++){
		// 		tempSum += eq[temp];
		// 		temp = temp + 3;
		// 	}
		// 	if(tempSum != 0){
		// 		System.out.println("NO");
		// 		return;
		// 	}
		// }
		// System.out.println("YES");

	}
}