public class Typecasting {
    public static void main(String[] args) {
        int a = 10;
        float f = a;//this is called widening a smaller datatype to larger data type
        System.out.println(a);
        System.out.println(f);

        long l = 123456789l;
//        a =  l;//will give error
        System.out.println();
         a = (int)l;//narrowing a larger datatype to smaller one
        System.out.println(l);
        System.out.println(a);
    }
}
