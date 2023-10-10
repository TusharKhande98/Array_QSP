public class QSP39_CountOfDuplicateElement
{
    public static void main(String[] args)
    {
        int [] arr = {1, 1, 1, 2, 3, 4, 4, 5, 3, 7};
        int dup = 0;

        for (int i=0; i< arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

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
                if (count!=1)
                    dup++;
            }
        }
        System.out.println("Count of duplicate element in array is:- " + dup);
    }
}