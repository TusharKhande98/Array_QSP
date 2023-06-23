import java.util.Scanner;
public class QSP4_RuntimeInputOfArray
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter size of array:- ");
        int [] a = new int[s.nextInt()];

        for (int i=0; i<a.length; i++)
        {
            System.out.print("enter value for array a[" + i+"]:- ");
            a[i] = s.nextInt();
        }

        System.out.print("[");
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]);
            if (i<a.length-1)
            {
                System.out.print(", ");
            }
        }
        System.out.print("]");



    }
}
