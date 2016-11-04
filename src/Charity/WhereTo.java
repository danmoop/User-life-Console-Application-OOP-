package Charity;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhereTo
{
    public WhereTo() throws IOException
    {
        sendMoney();
    }

    private static void sendMoney() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Where do you want to charity your money?");
        System.out.println("To schools - print 1");
        System.out.println("To homeless people - print 2");
        int choice = Integer.parseInt(reader.readLine());

        if (choice == 1)
            new ForSchools();
        else if (choice == 2)
            new ToHomeless();
    }
}
