package codeone.challenges;

public class SimpsonTemplateChallenge {
    public static void main(String[] args) {
        String parentName = "Homer";
        int number1 = 10;
        int number2 = 8;
        System.out.println(STR."Hey, I am \{parentName}, I am \{number1 * 3} + \{number2} years old");

        var childName = "Bart";
        String test = "\\{childName} is \\{number1} years old";
        System.out.println(test);
    }
}

/**
 a) Hey, I am Homer, I am 38 years old
    Bart is 10 years old

 b) Hey, I am Homer, I am 30 + 8 years old
    \{childName} is \{number1} years old

 c) Hey, I am Homer, I am 10 * 3 + 8 years old
    Bart is 10 years old

 d) Hey, I am Homer, I am 30 + 8 years old
    Bart is 10 years old
 */
