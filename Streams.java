import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        // List<String> names = List.of("Bob", "Charlie", "David", "Eve", "Alice", "Frank");
        // List<Integer> nameLengths = names.stream()
        //     .map(name -> name.length())
        //     .collect(Collectors.toList());

        // System.out.println(nameLengths);
        // List<String> names = List.of("Bob", "Charlie", "David", "Eve", "Alice", "Frank");
        // Set<Integer> nameLengths = names
        //     .stream()
        //     .map(name -> name.length())
        //     .collect(Collectors.toSet());

        // System.out.println(nameLengths);
        List<String> names = List.of("Bob", "Charlie", "David", "Eve", "Alice", "Frank");
        Map<String, Integer> nameLengths = names.stream()
            // .map(name -> name.length())
            .collect(Collectors.toMap(
                fruit -> fruit,
                String :: length
            ));
        System.out.println(nameLengths);
        // names.stream()
        // .filter(name -> name.length() > 3)
        // .sorted()
        // .map(name -> name.length())
        //method reference
        // .map(String::length)
        // .map(nameLength -> 2*nameLength)
        // .forEach((name) -> System.out.println("Name: " + name));
        //method reference
        // .forEach(System.out :: println);
        // Stream<String> streams = names.stream();
        // streams
        // .filter(name -> name.length() > 3)
        // .sorted()
        // .map(name -> name.length())
        // .map(nameLength -> 2*nameLength)
        // .forEach((name) -> System.out.println("Name: " + name));
    }

}
