// Storing arrays in zigzag position from 2 arrays
import java.util.Scanner;
public class QSP13_StoreArrayInZigZagPosition
{
    public static int [] merge(int []a, int []b)
    { 
        int [] c = new int[a.length + b.length];
        int index = 0;
        int big = a.length>b.length?a.length:b.length;

        for (int i=0; i<big; i++)
        {
            if (i<a.length)
                c[index++] = a[i];
            if (i<b.length)
                c[index++] = b[i];
        }
        return c;
    }

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
}
