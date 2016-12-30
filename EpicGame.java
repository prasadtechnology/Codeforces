import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EpicGame{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static int getGCD(int a,int b){
		int maxi = Math.max(a,b);
		int mini = Math.min(a,b);
	
		while(maxi % mini > 0){
			int temp = maxi;
			maxi = temp;
			mini = temp % mini;
		}
		return mini;
	}
	public static void main(String[] args) throws Exception{
		String input = in.readLine();
		String[] str = input.split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int heap = Integer.parseInt(str[2]);

		boolean zeroVsit = true;
		boolean oneVisit = false;
		while(true){
			if(zeroVsit){
				if(heap == 0){
					System.out.println(1);
					break;
				}
				int toTake = getGCD(a,heap);
				if(toTake > heap){
					System.out.println(1);
					break;	
				}else{
					heap -= toTake;
				}
				zeroVsit = false;
				oneVisit = true;
			}else{
				if(heap == 0){
					System.out.println(0);
					break;
				}
				int toTake = getGCD(b,heap);
				if(toTake > heap){
					System.out.println(0);
					break;	
				}else{
					heap -= toTake;
				}
				zeroVsit = true;
				oneVisit = false;
			}
		}
		
		// System.out.println(getGCD(5,0));

	}
}