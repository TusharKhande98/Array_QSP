public class QSP40_SecondMaxElementInSingleLoop
{
    public static void main(String[] args)
    {
        int a[] = {-2147483648, -2147483648, -10, 0, 2, 98, 10, 148};
        // here we give all possible values of int type of min-max.
        // this code will suitable with all types of values passed by user.
        int fMax = Integer.MAX_VALUE;
        int sMax = a[0];

        for (int i=0; i< a.length; i++)
        {
            if (a[i]>fMax)
            {
                sMax = fMax;
                fMax = a[i];
            }
            else if (a[i] > sMax && a[i] != fMax)
                sMax = a[i];
        }
        System.out.println("First maximum element:- " + fMax);
        System.out.println("Second maximum element:- " + sMax);
    }
}