package ET;

public class CheckoutSystem {
    public static String processOrder(double price, int quantity) {
        if (quantity <= 0) {
            return "Invalid Order";
        }

        double total = price * quantity;

        // Apply discount if total > $100
        if (total >= 100) {
            total *= 0.9;
        }

        // Add shipping fee if total < $10
        if (total < 10) {
            total += 2;
        }
        return "Total Payable: $" + String.format("%.2f", total);
    }
}
