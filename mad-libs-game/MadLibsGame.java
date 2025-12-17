import java.util.Scanner;

public class MadLibsGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String adjective = sc.nextLine();

        System.out.print("Enter a noun: ");
        String noun = sc.nextLine();

        System.out.print("Enter a verb (ending with -ing): ");
        String verb = sc.nextLine();

        System.out.print("Enter a place: ");
        String place = sc.nextLine();

        System.out.println("\n--- Your Mad Libs Story ---");
        System.out.println("Once upon a time, there was a " + adjective + " " + noun +
                " who loved " + verb + ".");
        System.out.println("One day, it went to " + place +
                " and became very famous!");

        sc.close();
    }
}
