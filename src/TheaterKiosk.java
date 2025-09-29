import java.util.Scanner;
public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // prompt for age
        System.out.print("Enter your age");
        int age = scan.nextInt();

        // check if eligible for wristband
        if (age >= 21) {
            System.out.println("You get a wristband.");
        }
        // no output if under 21

    }
}
