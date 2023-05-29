import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
   
    private List<Human> humanList;

    public  FamilyTree() {
        childrenList = new ArrayList<>();
    }

    public void addHuman(Human human){
        for (human in childrenList != name){
            childrenList.add(human);
        }
    }


    public String getChildrenList() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Human human: childrenList){
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
