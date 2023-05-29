public class Product {
    private static int global_id;
    private int id;
    private String name;
    private Date Year_f_Birth;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        id = global_id++;
    }

    public Product(){
        this("default", -1);
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", price: " + price;
    }
}
