package chapter1;

public class PiggyBankExample
{
    public static void main(String[] args)
    {
      PiggyBank myBank = new PiggyBank() ;

        addCoin(new Coin(1, 2010), myBank);
        addCoin(new Coin(5, 2011), myBank);
        addCoin(new Coin(10, 2000), myBank);
        addCoin(new Coin(25, 2012), myBank);

        System.out.println("Removing all the coins:");
        int amountRemove = 0;

        while (!myBank.isEmpty())
        {
            Coin removeCoin = myBank.remove();
            System.out.println("Removed a " + removedCoin.getCoinName() + ".");
            amountRemove = amountRemove + removeCoin.getValue();
        }//end while
        System.out.println("All done. Removed " + amountRemove + "cents.");
    }// end main
    private static void addCoin(Coin aCoin, piggyBank aBank)
    {
        if (aBank.add(aCoin())
            System.out.println("Added a " + aCoin.getCoinName() + ".");
        else
            System.out.println("Tried to add a " + aCoin.getCoinName() +  ", but could't");
    }
}
