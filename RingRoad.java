// Analyse
import java.util.Arrays;
import java.util.Scanner;
public class RingRoad 
{

    public static void main(String[] args) 
    {
        int n,m;
        long sum=0;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        int[] tasks=new int[m];
        for(int i=0;i<m;i++)
        {
            tasks[i]=in.nextInt();
        }
        for(int i=0;i<m;i++)
        {
             if (i == 0)
                 sum += tasks[i] - 1;
                 else {
                 if (tasks[i] >= tasks[i - 1])
                 sum += tasks[i] - tasks[i - 1];
                 else
                 sum += (n - tasks[i - 1]) + tasks[i];
                 }
            
        }
        System.out.println(sum);
        in.close();

    }

}