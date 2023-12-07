import java.util.Optional;

public class Orelse {
    public static void main(String[] args) {
         Optional<Object> empty = Optional.empty();
        Optional<String> ofnullable = Optional.ofNullable("Value is present");
        Optional<Integer> off = Optional.of(4);

        System.out.println(empty.orElse(2));
        System.out.println(ofnullable.orElse("ofnullable"));
        System.out.println(off.orElse(2));
    }
}
