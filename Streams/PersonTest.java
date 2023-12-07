import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class PersonTest {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35),
                new Person("David", 40),
                new Person("Eve", 45),
                new Person("Frank", 50),
                new Person("Grace", 55),
                new Person("Henry", 60),
                new Person("Isaac", 65),
                new Person("John", 70),
                new Person("Bob", 40));

        // Finding names ending with e
        // Stream<Person> nameendsWithe = persons.stream().filter(x ->
        // x.getName().endsWith("e"));
        // nameendsWithe.filter(x -> x.getAge() > 50).forEach(System.out::println);

        // Find Maximum value
        // persons.stream().max(Comparator.comparing(Person::getName)).ifPresent(System.out::println);

        // Find Minimum value
        // persons.stream().min(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);

        // using filter
        // List<Person> l1 = persons.stream().filter(s ->
        // s.getName().endsWith("e")).collect(Collectors.toList());
        // l1.stream().forEach(System.out::println);

        // count
        // long n = persons.stream().filter(e -> e.getName().endsWith("e")).count();
        // System.out.println("count "+n);

        // distinct
        // List<String> d =
        // persons.stream().map(Person::getName).distinct().collect(Collectors.toList());
        // d.forEach(System.out::println);

        // skip
        // persons.stream().skip(5).forEach(System.out::println);

        // limit
        // persons.stream().limit(3).forEach(System.out::println);

        // allmatch
        // boolean b1 = persons.stream().allMatch(p1 -> p1.getAge() > 30 );
        // System.out.println(b1);

        // nonematch
        // boolean b2 = persons.stream().noneMatch(p1 -> p1.getAge() < 20);
        // System.out.println(b2);

        // anymatch
        // boolean b3 = persons.stream().anyMatch(p1 -> p1.getAge() < 20 ||
        // p1.getName().startsWith("H"));
        // System.out.println(b3);

        // string reduce
        // String[] myArray = { "this", "is", "a", "sentence" };
        // String result = Arrays.stream(myArray).reduce("", (a, b) -> a + b);
        // System.out.println(result);

        // number reduce
        // int[] myArray1 = { 1, 2, 3, 4 };
        // int result1 = Arrays.stream(myArray1).reduce(1, (a, b) -> a + b);
        // System.out.println(result1);

        // find any
        // Optional<Person> anyEmpAbove40 = persons.stream().filter(emp -> emp.getAge()
        // > 20).findAny();
        // if (anyEmpAbove40.isPresent()) {
        // System.out.println("Any Employee above age 20: " + anyEmpAbove40.get());
        // }

        // find first
        // Optional<Person> o1 = persons.stream().filter(emp -> emp.getAge() >
        // 20).findFirst();
        // if (o1.isPresent()) {
        // System.out.println("Any Employee above age 20: " + o1.get());
        // }

        // sort
        // List<Person> slist =
        // persons.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        // slist.forEach(System.out::println);

        // peek
        // List<String> list = Arrays.asList("swathi", "joshika");
        // list.stream().peek(i -> System.out.println(i)).collect(Collectors.toList());

        // toArray
        // Person[] type = persons.stream().filter(s ->
        // s.getName().endsWith("e")).toArray(Person[]::new);
        // Stream.of(type).forEach(System.out::println);

        // map
        // List<Integer> c1 =
        // persons.stream().map(Person::getAge).collect(Collectors.toList());
        // System.out.println(c1);

        // parallelstream
        // Stream<Person> stream = persons.parallelStream();
        // List<Person> evenNumbersArr = stream.filter(emp -> emp.getAge() >
        // 40).collect(Collectors.toList());
        // evenNumbersArr.parallelStream().forEach(System.out::println);

        // maptoint and sum
        // int sum1 = persons.stream().mapToInt(Person::getAge).sum();
        // System.out.println(sum1);

        // maptodouble
        // double sum2 = persons.stream().mapToDouble(Person::getAge).sum();
        // System.out.println(sum2);

        // maptolong
        // long sum3 = persons.stream().mapToLong(Person::getAge).sum();
        // System.out.println(sum3);

        // average
        // double sum4 =
        // persons.stream().mapToDouble(Person::getAge).average().getAsDouble();
        // System.out.println(sum4);

        // collect
        // List<Person> c2 = persons.stream().collect(Collectors.toList());
        // System.out.println(c2);

        // stream builder
        // 1st method
        // Stream.Builder<String> b = Stream.builder();
        // Stream<String> c =
        // b.add("S").add("a").add("david").add("c").add("d").build();
        // List<String> list = c.map(String::toUpperCase).collect(Collectors.toList());
        // System.out.println(list);

        // 2nd method
        // Stream.Builder<String> b = Stream.builder();
        // b.accept("a");
        // b.accept("b");
        // b.accept("c");
        // b.accept("d");
        // Stream<String> s = b.build();
        // s.forEach(System.out::println);

        // flatmap
        String[][] data = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" }};
        Stream<String[]> temp = Arrays.stream(data);
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));
        Stream<String> stream1 = stringStream.filter(x -> "a".equals(x.toString()));
        stream1.forEach(System.out::println);
    }
}