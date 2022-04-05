import java.util.Scanner;

public class Bacteria
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many initial bacteria? ");
        int numBacteria = input.nextInt();
        System.out.print("How many hours will the bacteria sit? ");
        int hours = input.nextInt();
        long bacteria = numBacteriaAlive(hours, numBacteria);
        System.out.println("After " + hours + ", there will be " + bacteria + " bacteria");
    }

    public static long numBacteriaAlive(long hour, int bacteria)
    {
        if (hour == 0)
        {
            return bacteria;
        }
        return  2 * numBacteriaAlive(hour - 1, bacteria) + numBacteriaAlive(hour - 1, bacteria);
    }
}

