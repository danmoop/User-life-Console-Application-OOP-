package MainPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    private static long money;
    private static long glory;
    private static long crime;
    private static String location;
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Main() throws IOException, InterruptedException
    {
        new My();
        play();

        this.money = My.getMoney();
        this.glory = My.getGlory();
        this.crime = My.getCrime();
        this.location = My.getLocation();
    }

    private static void play() throws IOException, InterruptedException
    {
        System.out.println("Your money: $" + My.getMoney());
        while (true)
        {
            System.out.println("What do you want to do? --> ");
            String command = reader.readLine();
            if (command.equals("Info"))
                new My.OutputInfo().getInfo();

            else if (command.equals("Hacking"))
                new Hacking();
            else if (command.equals("Bank"))
                new Bank.DepositMoney();
            else if (command.equals("Shop"))
                new Shop.WhatToBuy();
            else if (command.equals("Charity"))
                new Charity.WhereTo();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException
    {
        new Main();
    }
}
