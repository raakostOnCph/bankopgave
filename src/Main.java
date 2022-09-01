import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here



        String svar;


//        while (true) {
//            switch (getString("hvad ønsker du")) {
//
//                case "opkonto":
//                    break;
//                    // her skal ske et eller andet
//                case "findkonto":
//                    break;
//                    // her skal noget andet
//                case "hæv":
//                    break;
//                    // sket et eller andet
//                case "indsæt":
//                    break;
//                    // hvad skal der mon sker her
//
//                case "skift sprog":
//                    // skrift
//            }
//        }


        System.out.println(getInt("skriv et tal"));

    }
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
