import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AmusingJoke{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder("");
	public static void main(String[] args) throws Exception{
		String first = in.readLine();
		String last  = in.readLine();
		String mixed = in.readLine();


		// Best way is

		String mixedVirtual = first + last;
		char mixedArray[] = mixedVirtual.toCharArray();
		Arrays.sort(mixedArray);
		String mixedVirtualString = new String(mixedArray);

		char mixedreal[] = mixed.toCharArray();
		Arrays.sort(mixedreal);
		String mixedrealString = new String(mixedreal); 

		if(mixedVirtualString.equals(mixedrealString)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}



		// if(mixed.length() == first.length()+last.length()){
		// 	for(int i = 0; i < mixed.length(); i++){
		// 		char c = mixed.charAt(i);
		// 		int firstIndex = first.indexOf(c);
		// 		int lastIndex = last.indexOf(c);

		// 		if(firstIndex != -1){
		// 			first = first.substring(0,firstIndex) + first.substring(firstIndex+1);
		// 		}else if(lastIndex != -1){
		// 			last = last.substring(0,lastIndex) + last.substring(lastIndex+1);
		// 		}else{
		// 			System.out.println("NO");
		// 			return;		
		// 		}
		// 	}
		// 	if(first.length() == 0 && last.length() == 0){
		// 		System.out.println("YES");
		// 	}else{
		// 		System.out.println("NO");
		// 	}

		// }else{
		// 	System.out.println("NO");
		// }

	}
}

