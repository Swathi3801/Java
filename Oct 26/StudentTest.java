import java.util.Arrays;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student(1, "swathi"),
                new Student(2, "joshika"),
                new Student(3, "gobinath"),
                new Student(4, "praveen"),
                new Student(5, "kavin"),
                new Student(6, "sangeetha"));
        students.stream().map(s -> s.getName()).forEach(System.out::println);
        students.stream().map(s -> s.getRollno()).forEach(System.out::println);

    }
}
