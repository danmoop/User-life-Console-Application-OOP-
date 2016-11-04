package Charity;

import MainPackage.My;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToHomeless
{
    private static long money;

    public ToHomeless() throws IOException
    {
        sendMoney();
        this.money = My.getMoney();
    }

    private static void sendMoney() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long amount = Long.parseLong(reader.readLine());

        if (amount > money)
            System.out.println("You donate greater than you have!");

        System.out.println("You've successfully donated: $"+amount);

        if (amount < 5000)
        {
            System.out.println("Glory +25");
            System.out.println("Crime - 5");
            My.setGlory(My.getGlory() + 25);
            My.setCrime(My.getCrime() - 5);
        }

        if (amount > 5000)
        {
            System.out.println("Glory +55");
            System.out.println("Crime - 20");
            My.setGlory(My.getGlory() + 55);
            My.setCrime(My.getCrime() - 20);
        }

        if (amount > 15000)
        {
            System.out.println("Glory +80");
            System.out.println("Crime - 35");
            My.setGlory(My.getGlory() + 80);
            My.setCrime(My.getCrime() - 35);
        }
    }
}