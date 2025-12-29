import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
       
        List<String> names = List.of("Bob", "Charlie", "David", "Eve", "Alice", "Frank" );
        Stream<String> streams = names.stream();
        streams
              .filter(name -> name.length() > 3)
              .sorted()
              .map(name -> name.length())
              .map(nameLength -> 2*nameLength)
              .forEach((name) -> System.out.println("Name: " + name));
    }
    
}
