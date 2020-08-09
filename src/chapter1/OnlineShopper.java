package chapter1;

public class OnlineShopper
{
    public static void main(String[] args)
    {
        Item[] items = {new Item("Bird feeder",2050),
                new Item("squirrel guard", 1547),
                new Item("Bird bath", 4499),
                new Item("Sunflower seeds", 1295)}
        BagInterface<Item> ShoppingCart = new Bag<>();
        int totalCost = 0;

        // Statements that add selected items to the shopping cart
        for (int index = 0; index < items.length; index++)
        {
            Item nextItem = items[index];
            ShoppingCart.Add(nextItem);
            totalCost = totalCost + nextItem.getPrice();
        }
    }
}
