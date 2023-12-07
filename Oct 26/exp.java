import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class exp {
    public static void main(String[] args) {
        List<String> Students = Arrays.asList("Swathi", "joshika", "Gobinath", "praveen", "kavin", "Sangeetha");
        // Students.forEach(System.out::println);
        // Consumer<String> con = (String t) -> System.out.println(t);
        // Students.forEach(S->System.out.println(S));
        Students.forEach(System.out::println);
    }
}
