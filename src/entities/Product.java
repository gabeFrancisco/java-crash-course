package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return quantity * price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "\n------------------\nProduct data:\n\nName:" + this.name + "\nQuantity:" + this.quantity + "\nPrice:" + this.price + "Total value in stock:" + this.totalValueInStock() + "\n------------------\n";
    }
}
