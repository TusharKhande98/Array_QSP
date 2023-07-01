import java.util.Scanner;
public class QSP9_Assgn3_CountOfEvenNo
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array:- ");
        int [] a = new int[s.nextInt()];
        for (int i=0; i<a.length; i++)
        {
            System.out.print("Enter value of array element a[" + i + "]:- ");
            a[i]=s.nextInt();
        }
        int count = 0 ;

        System.out.print("[ ");
        for (int i=0; i<a.length; i++)
        {
                System.out.print(a[i] + " ");
                if (a[i]%2==0)
                    count++;
        }
        System.out.print("]");
        System.out.println("\nThere are " + count + " even numbers in this array");

    }
}
