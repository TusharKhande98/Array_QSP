// Merge 2 arrays in 1
import java.util.Scanner;
public class QSP12_Merge2ArraysIn1Array
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of Array-A :- ");
        int [] a = new int[s.nextInt()];
        for (int i=0; i<a.length; i++)
        {
            System.out.print("Enter value of array element a[" + i + "]:- ");
            a[i]=s.nextInt();
        }
 
        System.out.print("\nEnter size of Array-B:- ");
        int [] b = new int[s.nextInt()];
        for (int i=0; i<b.length; i++)
        {
            System.out.print("Enter value of array element b[" + i + "]:- ");
            b[i]=s.nextInt();
        }

        int [] res = merge(a,b);
        System.out.print("[");
        for (int i=0; i<res.length; i++)
        {
            System.out.print(res[i] + " ");
        }
        System.out.print("]");
    }

    public static int [] merge(int [] a, int [] b)
    {
        int [] c = new int[a.length + b.length];
        int index = 0;
        for (int i=0; i<a.length; i++)
        {
            c[index++]=a[i];
        }
        for (int i=0; i<b.length; i++)
        {
            c[index++]=b[i];
        }
        return c;
    }

}
