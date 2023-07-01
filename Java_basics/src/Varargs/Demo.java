package Varargs;

public class Demo {
    static int sum(int... arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        int p = sum(45, 4, 1, 5, 5, 6, 2, 6, 6, 63, 6, 3, 4,654,656,5,55,15,5,9);
        System.out.println(p);

    }
}
