import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadAllBytes {
    public static void main(String[] args) throws IOException {

        String fileName = "C:\\Users\\gobinath.t\\Documents\\ReadLine.txt";
        byte[] bytes = Files.readAllBytes(Paths.get(fileName));
        String content = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(content);
    }
}