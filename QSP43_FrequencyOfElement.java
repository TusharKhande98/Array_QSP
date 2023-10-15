public class QSP43_FrequencyOfElement
{
    public static void main(String[] args)
    {
        int [] a = {6,0,6,1,2,2,1,0,9,3,2,3,3};
        int count [] = new int[a.length];

        for (int i = 0; i < count.length; i++)
        {
            int ct = 1;
            for (int j = i+1; j < count.length; j++)
            {
                if (a[i]==a[j])
                {
                    ct++;
                    count[j]=-1;
                }
            }
            if (count[i]!=-1)
            {
                count[i]=ct;
            }
        }
        for (int i = 0; i < count.length; i++)
        {
            if (count[i] != -1)
                System.out.println(a[i] + " is repeated " + count[i] + " times");
        }
    }
}
