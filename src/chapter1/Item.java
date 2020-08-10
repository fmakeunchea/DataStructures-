package chapter1;

public class Item
{
    private String description;
    private int price;

    public Item(String productDescription, int productPrice)
    {
        description = productDescription;
        price = productPrice;
    }// end constructor

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public String toString()
    {
        return description + "\t$" + price/100 + "." + price % 100;
    }
}
