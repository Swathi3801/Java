import java.util.Optional;

public class IsPresent {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();
        Optional<String> ofnullable = Optional.ofNullable("Value is present");
        Optional<Integer> off = Optional.of(4);
        if (empty.isPresent()) {
            System.out.println(empty);

        }
        else{
            System.out.println("Default value");
        }
        if (ofnullable.isPresent()) {
            System.out.println(ofnullable);
        }
         else{
            System.out.println("Default value");
        }
        if (off.isPresent()) {
            System.out.println(off);
        }
         else{
            System.out.println("Default value");
        }

    }

}
