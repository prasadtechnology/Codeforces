import java.util.Scanner;
public class ArrivalOfGeneral{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		int maxIndex = 0;
		int minIndex = 0;
		for(int i = 0; i < n; i++){
			int value = in.nextInt();
			a[i] = value;
			if(value > a[maxIndex]){
				maxIndex = i;
			}else if(value <= a[minIndex]){
				minIndex = i;
			}
		}
		int swaps = 0;  

		if(minIndex > maxIndex){
			swaps = maxIndex + (n - minIndex - 1);
		}else{
			swaps = maxIndex + (n - minIndex - 2);
		}
		System.out.println(swaps);
	}
}