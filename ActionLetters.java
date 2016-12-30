import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

public class ActionLetters{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		String temp = in.readLine();
		String sub = temp.substring(1,temp.length()-1);
		Set<String> unique = new HashSet<String>();
		if(sub.isEmpty()){
			System.out.println(0);	
			return;
		}else if(!sub.contains(",")){
			System.out.println(1);
			return;
		}else{
			String splitted[] = sub.split(", ");
			for(int i = 0; i < splitted.length; i++){
				unique.add(splitted[i]);
			}
		}
		System.out.println(unique.size());
	}
}

