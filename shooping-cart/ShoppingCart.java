import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String itemName;
        double price;
        int quantity;
        char currency = '$';

        System.out.print("What woud you like to have Sir/ma'am ?: ");
        itemName = sc.nextLine();

        System.out.print("Enter price per item: ");
        price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        //Buy1 get 1 free.
        int payableQuantity = quantity / 2 + quantity % 2;
        double total = payableQuantity * price;

        double discount = 0;
        if (quantity >= 5) {
            discount = total * 0.5; // 5% off
            total = total - discount;
        }

        System.out.println("\n--- Bill ---");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Payable Quantity (BOGO): " + payableQuantity);

        if (quantity >= 5) {
            System.out.println("Discount Applied: 10%");
        } else {
            System.out.println("Discount Applied: None");
        }

        System.out.println("Total Amount: " + currency + total);

        sc.close();
    }
}
