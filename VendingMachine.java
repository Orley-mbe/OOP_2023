import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
   
    private Human;

    public  FamilyTree() {
        childrenList = new ArrayList<>();
    }

    public void addHuman(Human human){
        if (childrenList.name != name){
            childrenList.add(human);
        }
    }

    public Product findProductByName(String name){
        for (Product product: productList){
            if (product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        return null;
    }

    public String getProductList() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Product product: productList){
            stringBuilder.append(product);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
