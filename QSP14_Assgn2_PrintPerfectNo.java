import java.util.Scanner;
public class QSP14_Assgn2_PrintPerfectNo
{
    public static boolean isPerfect(int n)
    {
        int sum=0;
        for (int i=1; i<=n/2; i++)
        {
            if (n%i==0)
                sum+=i;
        }
        return sum==n;
    }


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

        for (int i=0; i<a.length; i++)
        {
            if (isPerfect(a[i]))
                System.out.print(a[i]+ " ");
        }

    }
}
