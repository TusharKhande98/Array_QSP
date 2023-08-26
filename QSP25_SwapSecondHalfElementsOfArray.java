import java.util.Scanner;
public class QSP25_SwapSecondHalfElementsOfArray
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

        for (int i=arr.length/2; i<arr.length; i+=2)
        {
            int temp = arr[i];
            arr[i] =  arr[i+1];
            arr[i+1] = temp;
        }

        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}