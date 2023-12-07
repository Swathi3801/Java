import java.util.Optional;


public class Get {
    public static void main(String[] args) {
        Optional<String> str1 = Optional.of("Swathi");
        Optional<Integer> str2=Optional.empty();
        System.out.println(str1.get());
        System.out.println(str2.get());

    }
    
}
