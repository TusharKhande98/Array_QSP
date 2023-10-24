
import java.util.Scanner;
public class QSP14_Assgn5_PrintArmstrongNo
{
    public static boolean isArmstrong(int n) //153
    {
        int sum=0 ,temp=n;
        while (temp!=0) // 145
        {
            int rem = temp%10;
            int arm = rem*rem*rem;
            sum+=arm;
            temp/=10;
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
            if (isArmstrong(a[i]))
                System.out.println(a[i]+ " is armstrong number");
        }
    }
}
