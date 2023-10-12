public class QSP41_ArrangeDuplicatesOneAfterAnother
{
    public static void main(String[] args)
    {
        int [] a = {2, 1, 1, 2, 1, 2, 2, 3, 1, 3};

        System.out.println("Duplicate has been arranged in one after another sequence");
        for (int i = 0; i < a.length; i++)
        {
            int count=1;
            if (a[i] != 0)
            {
                for (int j = i+1; j < a.length; j++)
                {
                    if (a[i]==a[j])
                    {
                        count++;
                        a[j] = 0;
                    }
                }
                for (int j = 0; j < count; j++)
                {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
}
