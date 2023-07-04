import java.util.Scanner;
public class QSP9_Assgn6_SumOfOddNo
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array:- ");
        int[] a = new int[s.nextInt()];

        for (int i=0; i<a.length; i++)
        {
            System.out.print("Enter value of array element a[" + i + "]:- ");
            a[i]= s.nextInt();
        }

        int sum = 0;
        System.out.print("[ ");
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
            if (a[i]%2!=0)
                sum+= a[i];
        }
        System.out.print("]");
        System.out.println("\nSum of odd number from this array is: - " + sum);

    }
}
