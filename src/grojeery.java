import java.util.*;

public class grojeery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> totalSellingPrice = new HashMap<>();

        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        double totalPrice = 0; // Total selling price of all items
        int itemCount = 0; // Number of distinct item entries

        for (int i = 0; i < n; i++) {
            System.out.println("Enter item " + (i + 1) + " details (name price quantity): ");
            String name = scanner.next();
            double price = scanner.nextDouble();
            int quantity = scanner.nextInt();

            double sellingPrice = price * quantity;
            totalSellingPrice.put(name, totalSellingPrice.getOrDefault(name, 0.0) + sellingPrice);

            totalPrice += sellingPrice;
            itemCount++;
        }

        scanner.close();

        // Find the item with the highest total selling price
        String maxItem = Collections.max(totalSellingPrice.entrySet(), Map.Entry.comparingByValue()).getKey();

        // Calculate the average selling price per item
        double avgSellingPrice = totalPrice / itemCount;

        // Output results
        System.out.println(maxItem);
        System.out.printf("%.2f\n", totalPrice);
        System.out.printf("%.2f\n", avgSellingPrice);
    }
}
