package jchampions.challenges;

public class PatternMatchingChallenge {
    public static void main(String[] args) {
        test(30);
        test("No");
        test(new IllegalArgumentException("Error!"));
    }

    static void test(Object obj) {
        switch (obj) {
            case Integer number when number % 3 == 0 && number < 50 ->
                System.out.println("Special Integer: " + (number + 10));
            case String text when text.equalsIgnoreCase("YES") ->
                System.out.println("Affirmative String: " + text.length());
            case IllegalArgumentException exception when exception.getMessage().contains("Error") ->
                System.out.println("Exception caught: " + exception.getMessage().toUpperCase());
                default -> System.out.println("Other: " + obj);
        }
    }
}
