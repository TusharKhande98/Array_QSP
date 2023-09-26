public class QSP38_Laptop
{
    String name;
    String color;
    double price;

    public QSP38_Laptop(String name, String color, double price)
    {
        super();
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String toString()
    {
        return "Laptop brand:- " + name + "\nLaptop color:- " + color + "\nLaptop price:- " + price + "\n";
    }
}
