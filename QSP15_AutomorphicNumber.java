import java.util.Scanner;
public class QSP15_AutomorphicNumber
{
    public static boolean isAutomorphic(int a)
    {
        int sq = a*a; // 25
        int temp=a; // 5

        while (a>0)
        {
            if (a%10 != sq%10) // 5 , 5
                return false;
            a/=10;
            sq/=10;

        }
        return true;
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
            if (isAutomorphic(a[i])) // print automorphic
//            if (!isAutomorphic(a[i])) // print which is not automorphic

                System.out.println(a[i]+ " is automorphic number");
        }
    }
}
