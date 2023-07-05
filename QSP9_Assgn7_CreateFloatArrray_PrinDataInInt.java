import java.util.Scanner;

public class QSP9_Assgn7_CreateFloatArrray_PrinDataInInt
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array:- ");
        float [] a = new float[(int) s.nextFloat()];

        for(int i=0; i<a.length; i++)
        {
            System.out.print("Enter value of array element a[" + i + "]:- ");
            a[i] = s.nextFloat();
        }

        for(int i=0; i<a.length; i++)
        {
            System.out.println((int)a[i]);
        }

    }
}
