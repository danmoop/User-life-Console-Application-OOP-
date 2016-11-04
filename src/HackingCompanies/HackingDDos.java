package HackingCompanies;


import MainPackage.My;

import java.util.Random;

public class HackingDDos
{
    public HackingDDos()
    {
        ifSuccess();
    }

    private void ifSuccess()
    {
        Random rand = new Random();
        if (rand.nextInt() < 7)
        {
            System.out.println("You've successfully done DDOs attack");
            System.out.println("Money +2.500");
            System.out.println("Glory +5");
            System.out.println("Crime -3");
            My.setGlory(My.getGlory() + 5);
            My.setMoney(My.getMoney() + 2500); // EZ money
            My.setCrime(My.getCrime() - 3);
        }

        else
        {
            System.out.println("You've been detected by the police");
            System.out.println("Money -1.100");
            System.out.println("Crime +3");
            System.out.println("Glory -1");
            My.setMoney(My.getMoney() - 1100); // Not so easy money
            My.setCrime(My.getCrime() + 3);
            My.setGlory(My.getGlory() - 1);
        }
    }
}
