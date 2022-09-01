import java.util.Scanner;

public class Input
{
    public static String getString(String s) {

        System.out.println(s + " : ");
        Scanner scanner = new Scanner(System.in);


        return scanner.nextLine();
    }

    public static int getInt(String s) {

        int i = 0;

        while (true) {
            try {
                i = Integer.parseInt(getString(s));
                return i;   // springe linjen over ved pars fejl.
            } catch (NumberFormatException e) {
                System.out.println("husk det skal være et tal");
            }
        }





    }
}
