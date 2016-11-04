package Shop;

import MainPackage.My;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatToBuy
{
    private int reallyWhat;

    public WhatToBuy() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What exactly do you want to buy?: ");

        if (My.getMoney() < 10000)
        {
            System.out.println("A house rent ($3500) - print 1");
        }

        if (My.getMoney() < 25000)
        {
            System.out.println("A house rent ($3500) - print 1");
            System.out.println("A car ($20000) - print 2");
        }
        reallyWhat = Integer.parseInt(reader.readLine());

        if (reallyWhat == 1)
            new Shop.HouseRent.Buy();
        else if (reallyWhat == 2)
            new Shop.Car.Buy();
    }
}
