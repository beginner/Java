import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionsRemove {

    public static void main(String[] args) {
        CollectionsRemove problem = new CollectionsRemove();
        problem.removeIndex();
        problem.removeIndex_1();
        problem.removeElement();
    }

    public void removeIndex() {
        List<Integer> list = new ArrayList<Integer>(List.of(1,2,3)); // [1,2,3]
        list.remove(1); // removes at Index
        System.out.println(list); // [1,3]
    }

    public void removeIndex_1() {
        // var would be of type `ArrayList`
        var list = new ArrayList<Integer>(List.of(1,2,3)); // [1,2,3]
        list.remove(1); // removes at Index
        System.out.println(list); // [1,3]
    }

    public void removeElement() {
        Collection<Integer> list = new ArrayList<Integer>(List.of(1,2,3)); // [1,2,3]
        list.remove(1);  // removes Object
        System.out.println(list); // [2,3]
    }
}
