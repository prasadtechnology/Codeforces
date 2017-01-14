/**
Very good problem
**/
import java.util.Scanner;

public class Buttons{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n == 1){
			System.out.println(1);
		}else{
			int faultSteps = 0;
			for(int i = 0; i < n; i++){
				int front = n - i - 1;
				int back = i - 0;
				faultSteps +=  (front * back) + front + 1;
			}
			System.out.println(faultSteps);
		}
	}
}

