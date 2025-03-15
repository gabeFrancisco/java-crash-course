package entities;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return quantity * price;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double value) {
        if (price <= 0) {
            throw new InvalidParameterException();
        }
        this.price = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new InvalidParameterException();
        }
        this.quantity = quantity;
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
