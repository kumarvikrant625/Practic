import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AAAa {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Cathy", null);

        System.out.println(names.stream().filter(str-> str == null ? false:str.startsWith("A")).map(a-> a.toUpperCase()).collect(Collectors.toList()));
    }
}
