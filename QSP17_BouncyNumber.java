// NOT WORKING
import java.util.Scanner;
public class QSP17_BouncyNumber
{
    public static boolean isBouncy(int num)
    {
        boolean pos = false;
        boolean neg = false;

        while (num>=10)
        {
            int rem1 = num%10;
            num/=10;
            int rem2 = num%10;

            if (rem1<rem2)
            {
                pos=true;
            }

            if (pos && neg)
            {
                return true;
            }
        }
        return  false;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array:- ");
        int[] a = new int[s.nextInt()];

        for (Integer i=0; i<a.length; i++)
        {
            System.out.print("Enter value of array element a[" + i + "]:- ");
            a[i]= s.nextInt();
        }

        for (int i=0; i<a.length; i++)
        {
            if (isBouncy(a[i]))
                System.out.println(a[i]+ " is bouncy number");
        }
    }
}
