import java.util.Scanner;
public class QSP26_PrintEvenNosFirstThenOdd
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array:- ");
        int [] arr = new int[s.nextInt()];

        for (int i=0; i<arr.length; i++)
        {
            System.out.print("Enter element on index arr["+i+"]:- ");
            arr[i]=s.nextInt();
        }

        for (int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
                System.out.print(arr[i] + " ");
        }

        for (int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==1)
                System.out.print(arr[i] + " ");
        }
    }
}
