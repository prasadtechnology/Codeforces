import java.util.Scanner;

public class DreamoonAndStairs{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int f = in.nextInt();
		int min = (int)Math.ceil((double)n / 2);
		int i;
		boolean check = false;
		for(i = min;i <= n;i++){
			if(i % f == 0){
				check = true;
				break;
			}
		}	
		if(check){
		System.out.println(i);
		}else{
			System.out.println(-1);
		}

	}
}


