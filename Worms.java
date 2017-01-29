import java.util.Scanner;
public class Worms{

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[2000000];
		int sum = 0;
		int j = 1;
		for(int i = 0; i < n; i++){
			sum += in.nextInt();
			while(j <= sum){
				a[j] = i+1;
				j++;
			}
		}
		int sweet = in.nextInt();
		for(int k = 0; k < sweet; k++){
			System.out.println(a[in.nextInt()]);
		}

		/**
		Worst approach
		**/
		// int temp = 0;
		// for(int i = 0; i < n; i++){
		// 	temp = in.nextInt();
		// 	if(i != 0){
		// 		a[i] = a[i-1]+temp;
		// 	}else{
		// 		a[i] = temp;
		// 	}
		// }

		// int juiceWorms = in.nextInt();
		// for(int j = 0; j < juiceWorms; j++){
		// 	temp = in.nextInt();
		// 	binarySearch(a,0,n);
		// 	int k = 0;
		// 	while(temp > a[k]){
		// 		k++;
		// 	}
		// 	System.out.println(k+1);
		// }
	}
}