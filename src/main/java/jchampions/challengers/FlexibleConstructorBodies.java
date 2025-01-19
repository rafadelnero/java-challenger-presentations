package jchampions.challengers;

class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("New Product created " + name);
    }

    public static void main(String[] args) {
        new Laptop("Laptop C101", 500.0);
    }
}

class Laptop extends Product {

    public Laptop(String name, double price) {
        if (price < 500.0) throw new IllegalArgumentException("Laptop price must be >= 500.0");
        super(name, price);
    }
}