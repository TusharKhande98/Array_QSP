import java.util.Scanner;
public class QSP20_RemoveSpecificIndex_PrintRemaining
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

        System.out.print("Enter index no yu want to remove:- ");
        int remInd = s.nextInt();

        for (int i=0; i<arr.length; i++)
        {
            if (i == remInd)
                continue;
            else
                System.out.print(arr[i] + " ");
        }
    }
}
