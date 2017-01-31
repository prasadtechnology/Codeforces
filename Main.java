import java.io.IOException;

class Main
{
    // Print all subsets of given set[]
    static void printSubsets(char set[])
    {
        int n = set.length;
        for (int i = 0; i < (1<<n); i++)
        {
            System.out.print("{ ");
            for (int j = 0; j < n; j++)

                if ((i & (1 << j)) > 0) //It is logical and operation
                    System.out.print(set[j] + " ");

            System.out.println("}");
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        char set[] = {'a', 'b', 'c'};
        printSubsets(set);
    }
}