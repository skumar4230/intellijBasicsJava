package lambda;

@FunctionalInterface
interface A {
    void greet();
}

@FunctionalInterface
interface B {
    String greetings();
}

@FunctionalInterface
interface C {
    String greets(String message);
}

public class Demo {
    public static void main(String[] args) {
        System.out.println("Lambda Expression is only applicable for functional interfaces");
        System.out.println("Functional interface are interfaces which have only one abstract method--method with no implementation and any number of other methods");

        A obj1 = () -> {System.out.println("Lambda expression with curly braces");};//defining--1st way
        obj1.greet();//calling

        A obj = () -> System.out.println("Lambda expression without curly braces");//defining if there is only one expression then curly braces are not required

        obj.greet();//calling

        B ob = () -> {return "Hi this is lambda expression";};
        String s = ob.greetings();
        System.out.println(s);

        B ob1 = () -> "Hi this is lambda expression";//no need of return keyword and curly braces
        String s1 = ob1.greetings();
        System.out.println(s1);

        C msg = (message) -> "This is message using parameters " + message;//here we removed return keyword and curly braces
        String s2 = msg.greets("it's displayed");
        System.out.println(s2);

        C msg1 = message -> "This is message using parameters " + message;//so parenthesis is also not required for parameter
        String s3 = msg1.greets("it's displayed");
        System.out.println(s3);

        System.out.println("the examples here all are provided using user defined Functional Interface \n we also have someBuilt-In Functional Interface");
        System.out.println("See Tester class for more details and also the Java beyond Basics course");


    }
}

