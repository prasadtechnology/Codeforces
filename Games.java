import java.util.Scanner;

public class Games{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		
		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
			b[i] = in.nextInt();
		}

		int result = 0;
		for(int j = 0; j < n; j++){
			for(int k= 0; k < n; k++){
				if(a[j] == b[k]){
					result++;
				}
			}
		}
		System.out.println(result);
	}
}

