public class QSP2_PrintElementsFromArray
{
    public static void main(String[] args)
    {
        int [] a = {1,2,3,4,5,56,};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[5]);
//        System.out.println(a[6]);
// we will get runtime error, syntax is okay but array index is out of bound.
    }
}
