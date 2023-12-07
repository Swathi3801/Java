import java.util.Optional;

public class IfPresent {

    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();
        Optional<String> ofnullable = Optional.ofNullable("Value is present");
        Optional<Integer> off = Optional.of(4);

        empty.ifPresent(s -> System.out.println(empty));
        ofnullable.ifPresent(s -> System.out.println(ofnullable));
        off.ifPresent(s -> System.out.println(off));

    }

}