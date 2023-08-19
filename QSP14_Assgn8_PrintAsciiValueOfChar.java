import java.util.Scanner;
public class QSP14_Assgn8_PrintAsciiValueOfChar
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array:- ");
        int [] a = new int[s.nextInt()];
 
        for (int i=0; i<a.length; i++)
        {
            System.out.print("Enter value of array element a[" + i + "]:- ");
            a[i]= s.next().charAt(0);
        }

        for (int i=0; i<a.length; i++)
        {
            System.out.println("ASCII value of " + (char)a[i] + " is:- " + a[i]);
        }
    }
}
