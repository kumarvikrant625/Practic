import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class JavaTest {

    public static void main(String[] args) {

        HashMap<String, List<Integer>> map = new HashMap<>();

        map.put("mango", new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));

        System.out.println(map.toString());

        List<Integer> test = map.get("mango");

        test.remove(0);

        System.out.println(map.toString());
    }
}
