package module5.payment;

import java.util.ArrayList;

public class Receipt {
    private ArrayList<Product> products;
    private double balance;

    public Receipt(ArrayList<Product> products) {
        this.products = products;
        balance = getTotalPrice();
    }

    private double getTotalPrice() {
        double totalPrice = 0;
        for (Product product :
                products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "products=" + products +
                ", balance=" + balance +
                '}';
    }
}
