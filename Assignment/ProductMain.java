package Assignment;

public class ProductMain {

	public static void main(String[] args) {
		Product[] products = new Product[3];

        products[0] = new Product("Laptop", 1200.99, 5);
        products[1] = new Product("Smartphone", 799.49, 10);
        products[2] = new Product("Headphones", 199.99, 15);

        for (Product product : products) {
            product.displayProductDetails();
        }
	}
}
