import java.util.HashMap;
import java.util.Map;

public class Inventory {
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
}

    

