package MainPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hacking
{
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Hacking() throws IOException, InterruptedException
    {
        hack();
    }

    private static void hack() throws IOException, InterruptedException
    {
        System.out.println();
        System.out.println("Make a DDOS attack ($2.500) - print 0  ---> (70% chance)");
        System.out.println("Carding ($22.500) - print 1  ---> (33.[3]% chance) - 15 glory required");
        System.out.println("Create a virus ($112.500) ---> (40% chance) -> print 2 - 50 glory required");

        String command = reader.readLine();

        if (command.equals("0"))
            new HackingCompanies.HackingDDos();
        else if (command.equals("1") && My.getGlory() >= 15)
            new HackingCompanies.Carding();
        else if (command.equals("2") && My.getGlory() >= 50)
            new HackingCompanies.Virus();
        else
            System.out.println("You don't have enough glory - your: "+My.getGlory());
    }
}