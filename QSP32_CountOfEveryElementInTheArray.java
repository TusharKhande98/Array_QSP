import java.util.Scanner;
public class QSP32_CountOfEveryElementInTheArray
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

        for (int i=0; i< arr.length; i++)
        {
            int count = 1;
            if (arr[i]!=0)
            {
                for (int j=i+1; j< arr.length; j++)
                {
                    if (arr[i] == arr[j])
                    {
                        count++;
                        arr[j]=0;
                    }
                }
                System.out.println("Count of entered element "+arr[i]+ " is:- " + count );
            }
        }
    }
}
