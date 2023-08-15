// Change element of 1<->2, 3,4,  5<->6, 7,8 9<->10
// o/p--> 2, 1, 3, 4, 6, 5, 7, 8, 10, 9, 11, 12
import java.util.Scanner;
public class QSP23_SwapEveryFourthElementsOfArray
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

        if (arr.length%2==0)
        {
            for (int i=0; i<arr.length; i+=4)
            {
                int temp = arr[i];
                arr[i] =  arr[i+1];
                arr[i+1] = temp;
            }
        }
        else
        {
            for (int i=0; i<arr.length-1; i+=4)
            {
                int temp = arr[i];
                arr[i] =  arr[i+1];
                arr[i+1] = temp;
            }
        }

        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
