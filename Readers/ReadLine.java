import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadLine {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\txtgobinath.t\\Documents\\ReadLine.";
        Stream<String> lines = Files.lines(Paths.get(fileName));
        lines.forEach(System.out::println);

    }
}