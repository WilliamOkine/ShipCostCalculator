import java.util.Scanner;
public class ShipCostCalculator {
    public static void main(Strings[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the item: $");
        double price = Scanner.nextDouble();

        double shippingCost;
        if (price >= 100) {
            shipping cost = 0; }
        else { shippingCost = price * 0.02;}
        double totalPrice = price + shippingCost;
        System.out.println("Shipping Cost: $" + shippingCost);
        System.out.println("Total Price: $" + totalPrice);
        scanner.cllose();
        }
}