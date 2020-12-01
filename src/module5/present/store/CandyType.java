package module5.present.store;

public enum CandyType implements Type{

    CARAMEL("Caramel", 10),
    CHOCOLATE("Chocolate", 25),
    GUMMIES("Gummies", 15),
    LICORICE("Licorice", 20);

    private String name;
    private double price;

    CandyType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
