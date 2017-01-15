import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.HashMap;
public class ABChess{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws Exception{
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		map.put('Q',9);
		map.put('R',5);
		map.put('B',3);
		map.put('N',3);
		map.put('P',1);
		map.put('K',0);

		int white = 0;
		int black = 0;

		for(int i = 0; i < 8; i++){
			String str = in.readLine();
			for(int j = 0; j < str.length(); j++){
				char temp = str.charAt(j);
				if(temp != '.'){
					if(Character.isUpperCase(temp)){
						white += map.get(temp);
					}else{
						black += map.get(Character.toUpperCase(temp));
					}
				}
			}

		}
		if(white == black){
			pw.println("Draw");
		}else if(white > black){
			pw.println("White");
		}else{
			pw.println("Black");			
		}
		pw.close();
	}
}

