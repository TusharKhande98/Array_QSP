import java.util.Scanner;
public class QSP14_Assgn4_PrintStrongNo
{
    public static boolean isStrong(int n) //145
    {
        int sum=0 ,temp=n; // 0
        while (temp!=0) // 145
        {
            int fact=1;
            for (int j=temp%10; j>=1; j--) //j=1 & fact=120
            {
                fact = fact*j;
            }
            sum+=fact; //0+120=120
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
            if (isStrong(a[i]))
                System.out.println(a[i]+ " is strong number");
         }
    }
}
