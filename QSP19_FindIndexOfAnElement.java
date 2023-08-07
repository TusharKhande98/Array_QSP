import java.util.Scanner;
public class QSP19_FindIndexOfAnElement
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

        System.out.print("Enter element to find its index:- ");
        int element = s.nextInt();

        for (int i=0; i<arr.length; i++)
        {
            if (arr[i] == element)
                System.out.println("Element "+element+" is present on index:- arr["+i+"]");
        }
    }
}
