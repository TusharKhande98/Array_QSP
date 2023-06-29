import java.util.Scanner;
public class QSP8_SumAndCountOfPositiveNos
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
        int sum = 0, count = 0;

        for (int i=0; i<a.length; i++)
        {
            if (a[i]>=0)
            {
                sum += a[i];
                count++;
            }
        }
        System.out.println("\nSum of positive numbers in this array is:- " + sum);
        System.out.println("there are " + count + " positive numbers in this array");

    }
}
