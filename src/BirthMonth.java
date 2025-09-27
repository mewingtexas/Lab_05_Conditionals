import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        // create a scanner object to read user input
        Scanner scan = new Scanner(System.in);

        // ask user for birth month
        System.out.print("Enter your birth month (1-12): ");
        int month = scan.nextInt();

        // ensure input is within valid range
        if (month >= 1 && month <= 12) {
            System.out.println("Your birth month is: " + month);
        }  else {
            System.out.println("Invalid month");
        }

    }
}
