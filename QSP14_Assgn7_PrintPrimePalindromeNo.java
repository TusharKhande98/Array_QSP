import java.util.Scanner;
public class QSP14_Assgn7_PrintPrimePalindromeNo
{
    public static boolean isPrime(int n)
    {
        for (int i=2; i<n; i++)
        {
            if (n%i==0)
                return false;
        }
        return  true;
    }

    public static int isRev(int n)
    {
        int temp=n, rev=0;
        while (temp>0)
        {
            rev = rev*10 +temp%10;
            temp/=10;
        }
        return rev;
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
            if (isPrime(a[i]) && isPrime(isRev(a[i])))
                System.out.print(a[i]+ " ");
        }

    }
}
