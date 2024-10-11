package Assignment;

public class Product {
	String productName;
    double price;
    int quantity;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}
