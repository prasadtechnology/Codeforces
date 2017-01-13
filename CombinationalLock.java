import java.util.Scanner;
public class CombinationalLock{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String given = in.next();
		String act = in.next();
		int minRot = 0;
		for(int i = 0; i < n; i++){
			int diff = Math.abs(Character.getNumericValue(given.charAt(i)) - Character.getNumericValue(act.charAt(i)));
			if(diff < 5){
				minRot += diff;
			}else{
				minRot += 9 - (diff) + 1; 
			}
		}
		System.out.println(minRot);
	}
}