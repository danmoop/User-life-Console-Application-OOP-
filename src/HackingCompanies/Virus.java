package HackingCompanies;


import MainPackage.My;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Virus
{
    public Virus() throws IOException, InterruptedException
    {
        ifSuccess();
    }

    private static void ifSuccess() throws IOException, InterruptedException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Give a name for your virus: ");
        String nameOfTheVirus = reader.readLine();
        System.out.print("Create a code for your virus (For example - 04304013) -> it doesn't matter");
        long codeOfTheVirus = Long.parseLong(reader.readLine());
        Random rand = new Random();
        int result = rand.nextInt(10);

        if (result <= 4)
        {
            System.out.println("20%");
            Thread.sleep(800);
            System.out.println("40%");
            Thread.sleep(800);
            System.out.println("60%");
            Thread.sleep(800);
            System.out.println("80%");
            Thread.sleep(800);
            System.out.println("100%");
            Thread.sleep(800);

            System.out.println("You've successfully created a virus!");
            System.out.println("Money +112.500");
            System.out.println("Glory +500");
            System.out.println("Crime -250");

            My.setMoney(My.getMoney() + 112500);
            My.setGlory(My.getGlory() + 500);
            My.setCrime(My.getCrime() - 250);
        }

        else
        {
            System.out.println("20%");
            Thread.sleep(800);
            System.out.println("40%");
            Thread.sleep(800);
            System.out.println("60%");
            Thread.sleep(800);
            System.out.println("80%");
            Thread.sleep(800);
            System.out.println("100%");
            Thread.sleep(800);

            System.out.println("You failed!");
            System.out.println("Money -20.000");
            System.out.println("Glory -250");
            System.out.println("Crime +500");

            My.setMoney(My.getMoney() - 20000);
            My.setGlory(My.getGlory() - 250);
            My.setCrime(My.getCrime() + 500);
        }
    }
}