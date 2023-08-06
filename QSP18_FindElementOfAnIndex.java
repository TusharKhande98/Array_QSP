import java.util.Scanner;
public class QSP18_FindElementOfAnIndex
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

        System.out.print("Enter index to access its value:- ");
        int ip = s.nextInt();

        for (int i=0; i<arr.length; i++)
        {
            if (i == ip)
                System.out.println("Element present on index arr["+i+"] is:- "+arr[i]);

        }
    }
}
