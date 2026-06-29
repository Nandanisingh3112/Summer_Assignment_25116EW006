import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//INVENTORY MANAGEMENT SYSTEM
//PRODUCT CLASS
/*public class Product{
      private String id;
    private String name;
    private int quantity;
    private double price;

    public Product(String id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return String.format("ID: %s | Name: %s | Qty: %d | Price: $%.2f", id, name, quantity, price);
    }
}*/
//INVENTORY CLASS
/*public class Inventory{
private Map<String, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    // Add or Restock Product
    public void addProduct(Product product) {
        if (products.containsKey(product.getId())) {
            Product existing = products.get(product.getId());
            existing.setQuantity(existing.getQuantity() + product.getQuantity());
            System.out.println("Product ID exists. Stock updated successfully!");
        } else {
            products.put(product.getId(), product);
            System.out.println("New product added successfully!");
        }
    }

    // Update product details
    public boolean updateProduct(String id, String newName, int newQty, double newPrice) {
        if (products.containsKey(id)) {
            Product product = products.get(id);
            product.setName(newName);
            product.setQuantity(newQty);
            product.setPrice(newPrice);
            return true;
        }
        return false;
    }

    // Remove Product
    public boolean removeProduct(String id) {
        if (products.containsKey(id)) {
            products.remove(id);
            return true;
        }
        return false;
    }

    // Display all products
    public void displayInventory() {
        if (products.isEmpty()) {
            System.out.println("Inventory is currently empty.");
            return;
        }
        System.out.println("\n--- Current Inventory ---");
        for (Product p : products.values()) {
            System.out.println(p);
        }
    }
}*/
//MAIN CLASS

public class Question4 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Inventory Management System!");

        while (running) {
            System.out.println("\n1. Add/Restock Product");
            System.out.println("2. Update Product Details");
            System.out.println("3. Remove Product");
            System.out.println("4. View All Products");
            System.out.println("5. Exit");
            System.out.print("Select an option (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    
                    inventory.addProduct(new Product(id, name, qty, price));
                    break;

                case 2:
                    System.out.print("Enter Product ID to update: ");
                    String uId = scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String uName = scanner.nextLine();
                    System.out.print("Enter New Quantity: ");
                    int uQty = scanner.nextInt();
                    System.out.print("Enter New Price: ");
                    double uPrice = scanner.nextDouble();

                    if (inventory.updateProduct(uId, uName, uQty, uPrice)) {
                        System.out.println("Product updated successfully!");
                    } else {
                        System.out.println("Product ID not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Product ID to remove: ");
                    String rId = scanner.nextLine();
                    if (inventory.removeProduct(rId)) {
                        System.out.println("Product removed successfully!");
                    } else {
                        System.out.println("Product ID not found.");
                    }
                    break;

                case 4:
                    inventory.displayInventory();
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid selection. Try again.");
            }
        }
    }
}
