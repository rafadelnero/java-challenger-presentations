package jchampions.challengers;
class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public static void main(String[] args) {
        // Create a valid discounted product
        DiscountedProduct discountedProduct = new DiscountedProduct("Laptop", 1000.0, 20.0);
        System.out.println("Product Name: " + discountedProduct.name + " Price: " + discountedProduct.price);
    }
}

class DiscountedProduct extends Product {

    public DiscountedProduct(String name, double price, double discount) {
        double discountedPrice = price - (price * (discount / 100));
        super(name, discountedPrice);
    }
}