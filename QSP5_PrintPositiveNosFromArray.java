import java.util.Scanner;
public class QSP5_PrintPositiveNosFromArray
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

        System.out.print("[ ");
        for (int i=0; i<a.length; i++)
        {
            if (a[i]>0)
                System.out.print(a[i] + " ");
        }
        System.out.print("]");
    }
}
