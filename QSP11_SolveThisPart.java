public class QSP11_SolveThisPart
{
    public static int [] isPrime(int[] num)
    {
        int [] res = new int[100];
        int index = 0;

        for (int i=0; i<num.length; i++)
        {
            if (checkPrime(num[i]))
            {
                res[index] = num[i];
                index++;
            }
        }

        // IF WE REMOVE UPTO RETURN & RETURN A VALUE AS RES, WE GET PRIME & ZEROES
        int[] res1 = new int[isCount(res)];

        for (int i=0; i<res1.length; i++)
        {
            res1[i] = res[i];
        }
        return  res1;
//        return  res;
    }
 
    public static boolean checkPrime(int a)
    {
        if (a==1)
            return false;
        for (int i=2; i<a; i++)
        {
            if (a%i==0)
                return false;
        }
        return true;
    }

    // IF WE REMOVE COUNT METHOD
    public static int isCount(int [] num)
    {
        int count = 0;
        for (int i=0; i<num.length; i++)
        {
            if (num[i] !=0)
                count++;
        }
        return count;
    }
}
