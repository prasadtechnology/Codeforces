import java.util.Scanner;
public class GrassHopper{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int count = 0;
		int afterCount = 0;
		int lastOwelIndex = 0;
		for(int i = 0; i < str.length(); i++){
			char temp = str.charAt(i);
			if(temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U' || temp == 'Y'){
				count = Math.max((i+1) - lastOwelIndex,count);
				lastOwelIndex = i+1;
				afterCount = 1;
			}else{
				afterCount++;
			}
		}
		if(count == 0){
			System.out.println(str.length()+1);
		}else if(afterCount > count){
			System.out.println(afterCount);
		}else{
			System.out.println(count);
		}
		
	}
}