import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    String name;
    int quantity;
    double pricePerUnit;

    public Product(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double calculateTotalCost() {
        return quantity * pricePerUnit;
    }
}

public class ProductCostCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        List<Product> products = new ArrayList<>();
        double grandTotal = 0.0;

        while (continueInput) {
            // Call the method to get product details
            Product product = getProductDetails(input);
            products.add(product);

            // Calculate the total cost for the current product and update the grand total
            double productTotalCost = product.calculateTotalCost();
            grandTotal += productTotalCost;

            // Show the product name and total price for the current product
            System.out.printf("Added %d units of '%s' at $%.2f each. Total cost for this product: $%.2f%n",
                    product.quantity, product.name, product.pricePerUnit, productTotalCost);

            // Ask the user if they want to continue
            String userResponse;
            while (true) {
                System.out.print("Do you want to enter another product? (yes/no): ");
                userResponse = input.next().trim().toLowerCase();
                input.nextLine(); // Consume the newline left-over

                if (userResponse.equals("no")) {
                    continueInput = false; // Exit the loop
                    break; // Break out of the while loop
                } else if (userResponse.equals("yes")) {
                    break; // Valid response, exit the loop
                } else {
                    System.out.println("Invalid response. Please enter 'yes' or 'no'.");
                }
            }
        }

        // Print the grand total cost after user is done shopping
        System.out.printf("The total cost for all products is: $%.2f%n", grandTotal);

        // Close the scanner
        input.close();
        System.out.println("Thank you for using the Product Cost Calculator!");
    }

    // Method to get product details
    public static Product getProductDetails(Scanner input) {
        System.out.println("Enter the product details: ");
        System.out.print("Enter the product name: ");
        String productName = input.nextLine();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter the price per unit: ");
        double pricePerUnit = input.nextDouble();
        input.nextLine(); // Consume the newline left-over

        return new Product(productName, quantity, pricePerUnit);
    }
}