package MainPackage;

public class My {
    private static long money;
    private static long glory;
    private static long crime;
    private static String location;

    public My() {
        My.money = 500;
        My.glory = 10;
        My.crime = 0;
        My.location = "Garage";
    }

    public static long getMoney() {
        return money;
    }

    public static long getGlory() {
        return glory;
    }

    public static long getCrime() {
        return crime;
    }

    public static String getLocation() {
        return location;
    }

    public static void setMoney(long money) {
        My.money = money;
    }

    public static void setGlory(long glory) {
        My.glory = glory;
    }

    public static void setLocation(String location) {
        My.location = location;
    }

    public static void setCrime(long crime) {
        My.crime = crime;
    }

    public static class OutputInfo
    {
        public static void getInfo()
        {
            System.out.println("Your money: $" + getMoney());
            System.out.println("Your glory: " + getGlory());
            System.out.println("Your crime: " + getCrime());
            System.out.println("Your location: " + getLocation());
            System.out.println();
        }
    }
}