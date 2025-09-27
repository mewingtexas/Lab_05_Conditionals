import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // ask for item price
        System.out.print("Enter the price of the item: ");
        double price = scan.nextDouble();

        double shippingCost;
        double totalCost;

        // conditional logic to calculate shipping
        if (price >= 100) {
            shippingCost = 0;
        } else {
            shippingCost = price * 0.02;

        }

        totalCost = price + shippingCost;

        // output result
        System.out.println("Shipping cost is: $" + String.format("%.2f",  shippingCost ));
        System.out.println("Total cost is: $" + String.format("%.2f", totalCost));
    }

}
