import java.util.Scanner;
public class CinemaLine{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		int countermoney = 0;
		String change = "YES";
		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
			if(countermoney >= 0){
				if(a[i] == 25){
					countermoney += a[i];
				}else{
					int chng = a[i] - 25;
				    if(chng > countermoney){
						countermoney = countermoney - chng; 
						change = "NO";
					}else{
						countermoney = countermoney - chng + a[i];
					}
				}
			}
		}
		System.out.println(change);
	}
}