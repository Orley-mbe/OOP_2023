import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product twix = new Product("twix", 100);
        Product twix2 = new Product("twix2", 150);
        Product cocaCola = new Bottle("coca-cola", 80, 0.7);

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(twix);
        vendingMachine.addProduct(twix2);
        vendingMachine.addProduct(cocaCola);

        Product findProduct = vendingMachine.findProductByName("twix");
        System.out.println(findProduct);

        System.out.println();
        System.out.println(vendingMachine.getProductList());
    }
}
