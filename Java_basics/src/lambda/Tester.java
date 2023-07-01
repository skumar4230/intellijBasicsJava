package lambda;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Some of built in functional interfaces are \n" +
                " Function – It represents a function that takes a single input parameter and returns a single value/object. For example:\n" +
                "\n" +
                "Function<Long, Long> addNum = (value) -> value + 10;\n" +
                "Predicate – It represents a function that takes a single value/object as a parameter, and returns true or false. For example:\n" +
                "\n" +
                "Predicate<Integer> checkAge = (age) -> age > 18;\n" +
                "Supplier – It represents a function that produces a value/an object without taking any input parameter. For example:\n" +
                "\n" +
                "Supplier<Integer> generateRandom = ()-> new Integer((int) (Math.random() * 100));\n" +
                "Consumer – It represents a function that consumes or processes a value/an object without returning anything. For example:\n" +
                "\n" +
                "Consumer<String> printValue = (name)-> System.out.println(name);");

    }
}
