package jchampions.challenges;


import java.util.List;
import java.util.Optional;
import java.util.stream.Gatherers;
import java.util.stream.Stream;

public class StreamGatherer  {

    public static void main(String[] args) {
        List<List<Integer>> windows =
                Stream.of(1,2,3,4,5,6,7,8).gather(Gatherers.windowFixed(3)).toList();

        System.out.println(windows);

        List<List<Integer>> windows2 =
                Stream.of(1,2,3,4,5,6,7,8).gather(Gatherers.windowSliding(2)).toList();

        System.out.println(windows2);

        Optional<String> numberString =
                Stream.of(1,2,3,4,5,6,7,8,9)
                        .gather(
                                Gatherers.fold(() -> "", (string, number) -> string + number)
                        )
                        .findFirst();
        System.out.println(numberString);

        List<String> numberStrings =
                Stream.of(1,2,3,4,5,6,7,8,9)
                        .gather(
                                Gatherers.scan(() -> "", (string, number) -> string + number)
                        )
                        .toList();

        System.out.println(numberStrings);
    }

}
