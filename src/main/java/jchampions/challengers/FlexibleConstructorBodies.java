package jchampions.challengers;

public class FlexibleConstructorBodies {
    public static void main(String[] args) {
        // Create a valid discounted product
        DiscountedProduct discountedProduct = new DiscountedProduct("Laptop", 1000.0, 20.0);
        System.out.println("Product Name: " + discountedProduct.name);
        System.out.println("Discounted Price: $" + discountedProduct.price);

        // Try to create a product with an invalid discount
        try {
            DiscountedProduct invalidProduct = new DiscountedProduct("Phone", 500.0, 60.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}


class DiscountedProduct extends Product {

    public DiscountedProduct(String name, double price, double discount) {
        // Validate the discount in the constructor body
        if (discount < 0 || discount > 50) {
            throw new IllegalArgumentException("Discount must be between 0% and 50%");
        }

        // Calculate the discounted price
        double discountedPrice = price - (price * (discount / 100));

        // Pass the name and discounted price to the superclass constructor
        super(name, discountedPrice);
    }
}