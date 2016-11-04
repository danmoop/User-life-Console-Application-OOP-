package Charity;

import MainPackage.My;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForSchools
{
    private static long money;

    public ForSchools() throws IOException
    {
        this.money = My.getMoney();
        sendMoney();
    }

    private static void sendMoney() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How much do you want to donate?");
        long amount = Long.parseLong(reader.readLine());
        if (amount > money)
            System.out.println("You donate greater than you have!");

        System.out.println("You've successfully donated: $"+amount);

        if (amount < 5000 && amount > 0)
        {
            System.out.println("Glory +35");
            System.out.println("Crime - 15");
            My.setGlory(My.getGlory() + 35);
            My.setCrime(My.getCrime() - 15);
            My.setMoney(My.getMoney() - amount);
        }

        if (amount > 5000 && amount < 15000)
        {
            System.out.println("Glory +70");
            System.out.println("Crime - 35");
            My.setGlory(My.getGlory() + 70);
            My.setCrime(My.getCrime() - 35);
            My.setMoney(My.getMoney() - amount);
        }

        if (amount > 15000)
        {
            System.out.println("Glory +100");
            System.out.println("Crime - 45");
            My.setGlory(My.getGlory() + 100);
            My.setCrime(My.getCrime() - 45);
            My.setMoney(My.getMoney() - amount);
        }
    }
}
