import java.util.Scanner;
public class QSP21_SwapFirstLastElementOfArray
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

        int temp = arr[0];
        arr[0]= arr[arr.length-1];
        arr[arr.length-1] = temp;

        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
