import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NextRound{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		String students = in.readLine();
		String str[] = students.split(" ");
		String mar = in.readLine();
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		String marks[] = mar.split(" ");
		int marksAtKth = Integer.parseInt(marks[k - 1]);
		int count = 0;
		for(int i = 0; i < n; i++){
			int current = Integer.parseInt(marks[i]);
			if(current != 0 && current >= marksAtKth ){
				count++;
			}
		}
		System.out.println(count);
	}
}