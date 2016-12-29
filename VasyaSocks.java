import java.util.Scanner;

public class VasyaSocks{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int socks = in.nextInt();
		int freq = in.nextInt();
		int days = 0;

		int remsocks = socks;
		while(remsocks >= freq){
			days += freq;
			remsocks = remsocks - freq + 1; 
		}
		days += remsocks;
		System.out.println(days);
	}
}