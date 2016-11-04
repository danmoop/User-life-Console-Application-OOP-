package Shop.HouseRent;


import MainPackage.My;

public class Buy
{
    public Buy()
    {
        BuyAHouse();
    }

    private static void BuyAHouse()
    {
        System.out.println("You've successfully bought a house");
        System.out.println("");
        System.out.println("Your new location: A House");
        My.setMoney(My.getMoney() - 3500);
        My.setLocation("");
        My.setLocation("A House");
    }

}
