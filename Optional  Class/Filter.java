import java.util.Optional;

public class Filter {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Swathi");
        Optional<String> name1 = Optional.ofNullable("");

        System.out.println(name.filter(s -> s.startsWith("s")));
        System.out.println(name.filter(s -> s.equalsIgnoreCase("SWATHI")));
        System.out.println(name1.filter(s->s.isEmpty()));
    }

}