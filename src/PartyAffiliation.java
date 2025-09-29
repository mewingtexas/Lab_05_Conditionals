import java.util.Scanner;
public class PartyAffiliation {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        // display menu
        System.out.println("Choose your party afilliation");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.println(" Enter your party: ");
        String choice = scan.nextLine().toUpperCase();

        // read and normalize input
        if (choice.equals("D")) {
            System.out.println("You get a Democrat Donkey.");
        }else if (choice.equals("R")) {
            System.out.println("You get a Republican Elephant");
        }else if (choice.equals("I")) {
            System.out.println("You get a Independent Person");
        }else{
            System.out.println("Other Party.");
        }

    }
}
