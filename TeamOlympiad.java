/**
Best way is 
Take 3 arraylists
ArrayList prog = new ArrayList();
ArrayList maths = new ArrayList();
ArrayList pe = new ArrayList();
if(1){
	prog.add(index);
}else if(2){
	maths.add(index);
}else{
	pe.add(index);
}
while(team.size){
	prog.get(i)+" "+math.get(i)+" "+pe.get(i);
}
push index of programmer in one arraylist and index of maths in one like that
finally get values by team size
**/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.BufferedOutputStream;

public class TeamOlympiad{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws Exception{
		int n = Integer.parseInt(in.readLine()); 
		String input[] = in.readLine().split(" ");
		int programmer = 0;
		int maths = 0;
		int pe = 0;

		for(int i = 0; i < n; i++){
			int who = Integer.parseInt(input[i]);
			if(who == 1){
				programmer++;
			}else if(who == 2){
				maths++;
			}else{
				pe++;
			}
		}

		if(programmer != 0 && maths != 0 && pe != 0) {
			int min1 = Math.min(programmer,maths);
			int min2 = Math.min(min1,pe);			

			pw.println(min2);
			StringBuilder sb[] = new StringBuilder[min2];
			for(int j = 0; j < min2; j++){
				sb[j] = new StringBuilder("");
			}
			StringBuilder index[] = new StringBuilder[min2];
			for(int j = 0; j < min2; j++){
				index[j] = new StringBuilder("");
			}
			for(int s = 0; s < n; s++){
				// pw.println(input[s]);
				for(int m = 0; m < min2; m++){
					StringBuilder temp = sb[m];
					StringBuilder temp1 = index[m];

					String str = temp.toString();
					if(!str.contains(input[s])){
						temp.append(input[s]+" ");
						temp1.append((s+1)+" ");
						break;
						// pw.println(m +": "+(s+1));
					}					
				}
			}
			for(int p = 0; p < min2; p++){
				pw.println(index[p]);
			} 
		}else{
			pw.println(0);
		}

		pw.close();
	}
}

