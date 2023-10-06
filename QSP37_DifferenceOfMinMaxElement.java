import java.util.Scanner;
public class QSP37_DifferenceOfMinMaxElement
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

        int max = arr[0];
        for (int i=1; i<arr.length; i++)
        {
            if (max<arr[i]) // 90<60 f
                max = arr[i]; // max=90
        }
        System.out.println("Largest element of the array is :- " + max);


        int min = arr[0];
        for (int i=1; i<arr.length; i++)
        {
            if (min>=arr[i]) // 18>=71
                min = arr[i]; // min=18
        }
        System.out.println("Difference is :- " + (max-min));
    }
}
