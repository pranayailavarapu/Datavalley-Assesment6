import java.util.Scanner;

public class CalculateExpenses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: $");
        double pricePerItem = scanner.nextDouble();

        if (quantity < 0 || pricePerItem < 0) {
            System.out.println("Please enter positive values for quantity and price.");
        } else {
            double total = calculateExpenses(quantity, pricePerItem);
            System.out.printf("Total expenses after discount: $%.2f%n", total);
        }

        scanner.close();
    }

    public static double calculateExpenses(int quantity, double pricePerItem) {
        double totalCost = quantity * pricePerItem;
        double discount;

        if (quantity > 50) {
            discount = 0.10;  // 10% discount for quantity > 50
        } else if (quantity >= 25 && quantity <= 50) {
            discount = 0.05;  // 5% discount for 25 <= quantity <= 50
        } else {
            discount = 0;  // No discount for quantity < 25
        }

        double discountAmount = totalCost * discount;
        double totalExpenses = totalCost - discountAmount;

        return totalExpenses;
    }
}


