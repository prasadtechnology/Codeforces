import java.util.Scanner;
import java.util.Arrays;
public class MeetingFriends{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int a[] = new int[3];
		a[0] = in.nextInt();
		a[1] = in.nextInt();
		a[2] = in.nextInt();
		Arrays.sort(a);
		int firstFriend = a[1] - a[0];
		int thirdFriend = a[2] - a[1];
		System.out.println(firstFriend + thirdFriend);
	}
}

