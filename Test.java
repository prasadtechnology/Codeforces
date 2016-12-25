import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
class Test{
		static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		static StringBuilder sb = new StringBuilder("");
		static List<Long> list = new ArrayList<Long>();

	public static void main(String[] args) throws Exception{
		list.add(0L);
		list.add(0L);
		int n = 2000000;
		int a[] = new int[n+1];
		a[0] = 1;
		a[1] = 1;
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(a[i] == 0){
				int temp ;
				for(int j = i; (temp = i * j) <= n; j++){
					a[temp] = 1;
				}
			}
		}
		
 		for(int k = 2; k <= n; k++){
 			Long prev = list.get(k - 1);
			if(a[k] == 0){
				Long current = prev + k;
				list.add(current);
				sb.append(k+"\n");
			}else{
				list.add(prev);
			}
		}
		System.out.println(list.get(2));
	}
}


// import java.util.*;
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.InputStreamReader;
// class Test{
// 		static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
// 		static StringBuilder sb = new StringBuilder("");
// 	public static void main(String[] args) throws Exception{
// 		List<Long> list = new ArrayList<Long>();
// 		list.add(1000L);
// 		list.add(2000L);
// 		for(int i = 0; i < list.size(); i++){
// 		System.out.println(list.get(i));	
// 		}
// 		Long next = list.get(1) + 1000;
// 		list.add(next);
// 		System.out.println(next);
// 	}
// }