package MainPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Main() throws IOException, InterruptedException
    {
        new My();
        play();
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

            else if (command.equals("My.setGlory(500);")) //Cheat code
                My.setGlory(500);
            else if (command.equals("My.setMoney(5000000);")) //Cheat code
                My.setMoney(5000000);
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException
    {
        new Main();
    }
}