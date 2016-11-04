package Bank;

import MainPackage.My;

public class DepositMoney
{
    private static long money;

    public DepositMoney() throws InterruptedException
    {
        this.money = My.getMoney();
        deposit();
    }

    private static void deposit() throws InterruptedException
    {
        System.out.println("You've deposited: $"+money);
        long bankMoney = (long) (money * 0.0075);
        for (int i = 0; i < 10; i++)
        {
            money = money+bankMoney;
            System.out.println("Your money in a bank: $"+money);
            Thread.sleep(1000);
        }

        My.setMoney(money);
        System.out.println("Your money: $"+My.getMoney());
    }
}
