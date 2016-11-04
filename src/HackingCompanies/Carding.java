package HackingCompanies;

import MainPackage.My;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Carding
{
    public Carding() throws InterruptedException, IOException
    {
        ifSuccess();
    }

    private static void ifSuccess() throws InterruptedException, IOException
    {
        Random rand = new Random();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int pinfirst = rand.nextInt(9);
        int pinsecond = rand.nextInt(9);
        int pinthird = rand.nextInt(9);
        int lastnumber = rand.nextInt(3);
        System.out.println("You get the pin code from the someone's card");
        Thread.sleep(1200);
        System.out.println("Here it is: "+pinfirst+pinsecond+pinthird+"*");
        System.out.print("You have to guess last number (from 1 to 3): ");
        int yourGuess = Integer.parseInt(reader.readLine());

        if (yourGuess == lastnumber)
        {
            System.out.println("YOU GUESSED IT!");
            System.out.println("You have successfully stolen someone's card");
            System.out.println("Money +22.500");
            System.out.println("Glory +30");
            System.out.println("Crime - 8");

            My.setMoney(My.getMoney() + 22500);
            My.setGlory(My.getGlory() + 30);
            My.setCrime(My.getCrime() - 8);
        }

        else
        {
            System.out.println("YOU HAVEN'T GUESSED IT!");
            System.out.println("You have been detected by the police");
            System.out.println("Money -6500");
            System.out.println("Glory -8");
            System.out.println("Crime +15");

            My.setMoney(My.getMoney() - 3500);
            My.setGlory(My.getGlory() - 8);
            My.setCrime(My.getCrime() + 15);
        }
    }
}
