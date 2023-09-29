import java.util.Scanner;
// Desnability Code
public class QSP33_PenDriver
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        QSP33_bag b = new QSP33_bag();

        for ( ; ; ) // infinite loop
        {
            System.out.println("Enter choice to perform action below:-");
            System.out.println("1. Add pen\n2. Remove pen\n3. Display pen\n4 Exit Application ");

            switch (s.nextInt()) {
                case 1:
                    b.addPen();
                    break;

                case 2:
                    b.remove();
                    break;

                case 3:
                    b.displayPen();
                    break;

                case 4:
                    System.err.println("Application has been stopped");
//                    using 'err' msg will be displayed in red color
                    return; // stop infinite for loop
            }
         }
    }
}
