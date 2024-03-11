import java.util.Arrays;
import java.util.List;

public class ArraysAsListMutability {

    public static void main(String[] args) {
        ArraysAsListMutability problem = new ArraysAsListMutability();
        problem.mutability();
    }

    public void mutability() {
        final List<String> list = Arrays.asList("Akash", "Jain");
        try {
            list.add("temp");
        } catch (final UnsupportedOperationException e) {
            System.out.println("unsupported");
        }
        list.set(1, "surname");
        System.out.println(list);
    }
}
