import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.BufferedOutputStream;

public class MishkaGame{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws Exception{
		int rounds = Integer.parseInt(in.readLine());
		int miskaCount = 0;
		int chrisCount = 0;

		for(int i = 0; i < rounds; i++){
			String str[] = in.readLine().split(" ");
			int miskascore = Integer.parseInt(str[0]);
			int chrisscore = Integer.parseInt(str[1]);
			if(miskascore != chrisscore){
				if(miskascore > chrisscore){
				miskaCount++;
				}else{
					chrisCount++;
				}
			}
		}
		if(miskaCount == chrisCount){
			pw.println("Friendship is magic!^^");
		}else if(miskaCount > chrisCount){
			pw.println("Mishka");
		}else{
			pw.println("Chris");
		}
		pw.close();
	}
}

