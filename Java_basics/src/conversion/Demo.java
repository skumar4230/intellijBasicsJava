package conversion;

public class Demo {
    public static void main(String[] args) {
        String s = "456";
        int i = Integer.parseInt(s);//string to integer
        System.out.println(i);
        System.out.println(s+100);//456100, because "200"+100, here + is a string concatenation operator
        System.out.println(i+100);//556, because 200+100, here + is a binary plus operator
        i = Integer.valueOf(s);
        System.out.println(i);
        System.out.println(s+100);//456100, because "200"+100, here + is a string concatenation operator
        System.out.println(i+100);//556, because 200+100, here + is a binary plus operator
    }
}
