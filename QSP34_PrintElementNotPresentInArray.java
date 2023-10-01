public class QSP34_PrintElementNotPresentInArray
{
    public static void main(String[] args)
    {
        int [] a =  { 1, 2, 5, 0, 8};
        int b = 0;

        for (int i=0; i< a.length; i++)
        {
            if (b==a[i])
            {
                b++;
                i=-1; // loop will start again from '0'
            }
        }
        System.out.println(b);
    }
}
