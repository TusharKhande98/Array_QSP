public class QSP35_PrintLengthWithoutLengthMethod
{
    public static void main(String[] args)
    {
        int [] a = {1, 33, 2, 34, 3, 23};
        int count  = 0;

        try
        {
            int i=0;
            while (true)
            {
                a[i] = a[i]; // here on 1 point it will throw error
                i++;         // that exception will be handled in catch block with a printing msg also
                count++;
            }
        }
        catch (ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("total elements in array is:- " + count);
        }

    }
}
