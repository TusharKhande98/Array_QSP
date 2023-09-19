import java.util.Scanner;
public class QSP33_bag
{
    QSP33_Pen p;
    Scanner s = new Scanner(System.in);

    public void addPen()
    {
        if (p==null)
        {
            System.out.print("Pen:- ");
            String pName = s.next();
            System.out.print("Color:- ");
            String pColor = s.next();
            System.out.print("Price:-");
            double pPrice = s.nextDouble();

            p = new QSP33_Pen(pName, pColor, pPrice);
            System.out.println("Pen added");
        }
        else
        {
            System.out.println("Pen already existed");
        }
    }

    public void remove()
    {
        if (p==null)
        {
            System.out.println("first add pen");
        }
        else
        {
            System.out.println("Pen is removed");
        }
    }

    public void displayPen()
    {
        if (p==null)
        {
            System.out.println("Pen not available! add first");
        }
        else
        {
            System.out.println(p.pName);
            System.out.println(p.pColor);
            System.out.println(p.pPrice);
        }
    }
}
