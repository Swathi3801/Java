import java.util.Optional;

public class Orelseget {
    public static void main(String[] args) {
        
        Optional<Object> empty = Optional.empty();
        Optional<String> ofnullable = Optional.ofNullable("Value is present");
        Optional<Integer> off = Optional.of(4);

        System.out.println(empty.orElseGet(()->"empty value"));
        System.out.println(ofnullable.orElseGet(()->"ofnullable value"));
        System.out.println(off.orElseGet(()->5));
    }
}
