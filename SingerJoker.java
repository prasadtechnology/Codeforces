import java.util.Scanner;
public class SingerJoker{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int songs = in.nextInt();
		int time = in.nextInt();
		int timeForSongs = 0;
		for(int i = 0; i < songs; i++){
			timeForSongs += in.nextInt();
		}
		int minTime = timeForSongs + (songs-1)*10;
		if(time >= minTime){
			System.out.println((time -timeForSongs)/5);
		}else{
			System.out.println("-1");
		}
	}
}