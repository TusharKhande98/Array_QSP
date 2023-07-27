import java.util.Scanner;
public class QSP14_Assgn6_PrintVowels
{
    public static boolean isVowel(char c)
    {
        return  c == 'a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array:- ");
        int [] a = new int[s.nextInt()];

        for (int i=0; i<a.length; i++)
        {
            System.out.print("Enter value of array element a[" + i + "]:- ");
            a[i]= s.next().charAt(0);

        }

        for (int i=0; i<a.length; i++)
        {
            if (isVowel((char)a[i]))
            System.out.println((char)a[i] + " is a vowel");
        }
    }
}
