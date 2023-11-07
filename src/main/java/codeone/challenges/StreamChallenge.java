package codeone.challenges;
//Planet JDK 8 - The unknown Order
import java.util.Arrays;
import java.util.List;

public class StreamChallenge {
  public static void main(String... crewOrder) {
    List<String> crew = Arrays.asList("Homer", "Bart", "Lisa");
    
    crew.stream()
      .peek(e -> System.out.println(e + ":peek"))
      .limit(2)
      .forEach(System.out::println);
  }
  
}
