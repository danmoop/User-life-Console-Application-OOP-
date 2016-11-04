package Shop.Car;

import MainPackage.My;

public class Buy
{
    public Buy()
    {
        BuyACar();
    }

    private static void BuyACar()
    {
        System.out.println("You've successfully bought a car");
        System.out.println("Your location has been updated");
        My.setMoney(My.getMoney() - 20000);
        My.setLocation(My.getLocation()+" | I have a CAR");
    }
}
