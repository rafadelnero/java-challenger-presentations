package jchampions.challenges;

interface Vehicle {}

record Car(String brand, int year) implements Vehicle {}

public class UnnamedVariables {
    public static void main(String[] args) {
        Vehicle vehicle = new Car("Tesla", 2024);

        switch (vehicle) {
            case Car(_, var y) when y > 2025 -> System.out.println("New Car");
            case Car(_, _) -> System.out.println("Old Car");
            default -> System.out.println("Unknown Vehicle");
        }
    }
}

/*
*
A. New Car
B. Old Car
C. Unknown Vehicle
D. Compilation error
*
* */