// UNSOLVED, SEE IT LATER
import java.util.Scanner;
public class QSP27_PrintEvenNosFirstThenOddInArrayFormat
{
    public static int [] evenOddArray(int [] arrCopy)
    {
        int index = 0;
        int [] updatedArray = new int[arrCopy.length];

        for (int i=0; i<arrCopy.length; i++)
        {
            if(arrCopy[i]%2==1)
            updatedArray[index] = arrCopy[i];
            index++;
            System.out.print(updatedArray[i] + " ");
        }

        for (int i=0; i<arrCopy.length; i++)
        {
            if(arrCopy[i]%2==0)
                updatedArray[index] = arrCopy[i];
                index++;
                System.out.print(updatedArray[i] + " " );
        }

        updatedArray = arrCopy;
        return updatedArray;
    }

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

        int [] b = evenOddArray(arr);
//        System.out.print("[ ");
        for (int i=0; i<b.length; i++)
        {
            System.out.print(b[i] + " ");
//            if (b[i]<b.length)
//                System.out.print(", ");
        }
//        System.out.print("]");
        System.out.println("\nlength of array is:- " + b.length);
    }
}
