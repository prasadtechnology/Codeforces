import java.io.BufferedReader;
import java.io.InputStreamReader;
class Test{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		String str = "abcaa";
		// System.out.println(str.replaceAll("[bc]","a"));

		System.out.println(str.replaceAll("(.)",".$1"));
		System.out.print(str.next().matches(".*(0{7,}|1{7,}).*") ? "YES" : "NO");
	}
}


