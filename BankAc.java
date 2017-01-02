import java.util.Scanner;

public class BankAc{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		String n = in.next();

		if(n.contains("-")){
		int last = Integer.parseInt(n.substring(0,n.length()-1));
		int lastBtw = Integer.parseInt(n.substring(0,n.length() - 2)+n.charAt(n.length() - 1));
		if(last > lastBtw){
			System.out.println(last);	
		}else{
			System.out.println(lastBtw);			
		}
		}else{
			System.out.println(n);	
		}

	}
}

