import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class ReadString {    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\gobinath.t\\Documents\\ReadLine.txt";
        List <String> s = Files.readAllLines(Paths.get(fileName));
        s.forEach(System.out::println);
    }

}