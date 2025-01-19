package jchampions.challengers;

class Product {
    protected double price;

    public Product(double price) {
        this.price = price;
        System.out.println("New Product created with price " + price);
    }
}

class Laptop extends Product {
    private String model;

    public Laptop(double price, String model) {
        this.model = model;
        if (price < 500.0) throw new IllegalArgumentException("Laptop price must be >= 500.0");
        super(price);
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop(750.0, "Model X");
        System.out.println("Laptop Model: " + laptop.model);
    }
}