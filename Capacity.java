import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Capacity{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		int stations = Integer.parseInt(in.readLine());	
		int peopleInsideTram = 0;
		int capacity = 0;
		for(int i = 0; i < stations; i++){
			String tram = in.readLine();
			String outAndIn[] = tram.split(" ");
			int outside = Integer.parseInt(outAndIn[0]);
			int inside = Integer.parseInt(outAndIn[1]);
			peopleInsideTram = (peopleInsideTram - outside) + inside;
			if(peopleInsideTram > capacity){
				capacity = peopleInsideTram;
			}
		}
		System.out.println(capacity);
	}
}