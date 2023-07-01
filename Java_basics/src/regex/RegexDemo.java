package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".s");//. represents single character
        Matcher m = p.matcher("as");
        boolean b = m.matches();
        System.out.println(b);

        //2nd way
        boolean b2 = Pattern.compile(".s").matcher("as").matches();
        System.out.println(b2);

        //3rd way
        boolean b3 = Pattern.matches(".s", "as");
        System.out.println(b3);

        System.out.println(b + " " + b2 + " " + b3);
        System.out.println("Regex in Java");
        //we prefer the below way
        String regex = "[A-Za-z\\s]*";
        String input = "Java Lessons";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        boolean result = matcher.matches();
        System.out.println(result);

        regex = "h.t";
        input = "hat";
        boolean isMatch = input.matches(regex); // returns true
        System.out.println(isMatch);

        regex = "\\d+";
        input = "123";
        isMatch = input.matches(regex); // returns true
        System.out.println(isMatch);

        regex = "\\D+";
        input = "abc";
        isMatch = input.matches(regex); // returns true
        System.out.println(isMatch);

        regex = "hello\\sworld";
        input = "hello world";
        isMatch = input.matches(regex); // returns true
        System.out.println(isMatch);

        regex = "\\S+";
        input = "hello";
        isMatch = input.matches(regex); // returns true
        System.out.println(isMatch);

        regex = "\\w+";
        input = "hello123";
        isMatch = input.matches(regex); // returns true
        System.out.println(isMatch);

        regex = "\\W+";
        input = "@hello!";
        isMatch = input.matches(regex); // returns false
        System.out.println(isMatch);


        regex = "\\bworld\\b";
        input = "hello world";
        isMatch = input.matches(regex); // returns false
        System.out.println(isMatch);


        regex = "hello\\Bworld";
        input = "helloworld";
        isMatch = input.matches(regex); // returns true
        System.out.println(isMatch);


    }
}
