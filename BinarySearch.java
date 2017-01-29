import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n + 1];
        for(int i = 1; i < n + 1; i++)
            p[i] = p[i - 1] + sc.nextInt();

        System.out.println(Arrays.toString(p));
        int m = sc.nextInt();
        while (m-- > 0){
            int c = sc.nextInt();
            int low = 0;
            int high = p.length;
            while(low + 1 < high){
                int mid = low + (high - low) / 2;
                if(p[mid] < c)
                    low = mid;
                else high = mid;
            }

            System.out.println(high);
        }
    }
}