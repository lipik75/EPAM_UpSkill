package module5.present.store;

import java.util.List;

public class Present {

    private String name;
    private int weight;
    private double price;
    private Wrap wrap;
    private List<Product> products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Wrap getWrap() {
        return wrap;
    }

    public void setWrap(Wrap wrap) {
        this.wrap = wrap;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    String getProductsLine(){
        if (products.size() == 0){
            return ".";
        }
        StringBuilder stringBuilder = new StringBuilder(".\nProducts list:\n");
        for (Product p :
                products) {
            stringBuilder.append(p).append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Present{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", wrap=" + wrap +
                ", products=" + products +
                '}';
    }
}
