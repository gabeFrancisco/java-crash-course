package oop;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return quantity * price;
    }

    public void AddProducts(int quantity){
        
    }

    public void RemoveProducts(int quantity){

    }
}
