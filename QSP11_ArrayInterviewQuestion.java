// Set 5 element in array but given size is 100
// we need to get only prime nos from that array & store it in result
// if we have 7 prime nos, so we also have 93 default value as '0'
// avoid that zeros & store only that 7 nos in separate array & then print
import java.util.Scanner;
public class QSP11_ArrayInterviewQuestion
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

        int [] res = QSP11_SolveThisPart.isPrime(a);

        System.out.print("[");
        for (int i=0; i<res.length; i++)
        {
            System.out.print(res[i] + " ");
        }
        System.out.print("]");
    }
}
