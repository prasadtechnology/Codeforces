import java.util.Scanner;
public class Elections{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int cand = in.nextInt();
		int city = in.nextInt();
		int a[] = new int[cand+1];
		for(int i = 0; i < city; i++){
			int max = Integer.MIN_VALUE;
			int maxIndex = Integer.MAX_VALUE;
			for(int j = 1; j <= cand; j++){
				int temp = in.nextInt();
			   if(temp > max){
			   	maxIndex = j;
			   	max = temp;	   	
			   }
			}
			a[maxIndex] = a[maxIndex] + 1;
		}

		int whichCand = 1;
		int max = Integer.MIN_VALUE;
		for(int k = 1; k <= cand; k++){
			if(a[k] > max){
				whichCand = k;
				max = a[k];
			}
		}
		System.out.println(whichCand);
	}
}