import java.util.Optional;

public class Orelsethrow {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();
        Optional<String> ofnullable = Optional.ofNullable("Value is present");
        Optional<Integer> off = Optional.of(4);

       //System.out.println(empty.orElseThrow());
        System.out.println(ofnullable.orElseThrow());
        System.out.println(off.orElseThrow());
    }
    
}
