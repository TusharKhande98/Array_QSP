import java.util.Scanner;
public class QSP14_Assgn3_PrintPalindromeNo
{
    public static boolean isPalindrome(int n)
    {
        int rev=0;
        for (int i=n; i!=0; i/=10)
        {
            rev = (rev*10)+i%10;
        }
        return rev==n;
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
            if (isPalindrome(a[i]))
                System.out.print(a[i]+ " ");
        }
    }
}
