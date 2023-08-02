import java.util.Scanner;
public class QSP16_MagicNumber
{
    public static int isSum(int n)
    {
        int sum = 0;
        while (n>0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
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
            int num = a[i];
            while (num>=10)
            {
                num = isSum(num);
            }

            if (num==1)
                System.out.println(a[i]+ " is magic number");
        }
    }
}
