package extras;

public class Format_Specifier {
    public static void main(String[] args) {
        int number = 42;
        String message = String.format("The answer is %d.", number);
        System.out.println(message); // Output: The answer is 42.

        String name = "Alice";
        String message1 = String.format("Hello, %s!", name);
        System.out.println(message1); // Output: Hello, Alice!


    }
}
