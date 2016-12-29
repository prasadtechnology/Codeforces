import java.util.Scanner;

public class IWannaBeGuy{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int pass[] = new int[n];
		int p = in.nextInt();
		for(int i = 0; i < p; i++){
			pass[in.nextInt() - 1] = 1;
		}
		int q = in.nextInt();
		for(int j = 0; j < q; j++){
			pass[in.nextInt() - 1] = 1;
		}
		for(int k = 0; k < n; k++){
			if(pass[k] == 0){
				System.out.println("Oh, my keyboard!");
				return; 		
			}
		}
		System.out.println("I become the guy."); 
	}
}