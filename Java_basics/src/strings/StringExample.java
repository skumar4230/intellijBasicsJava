package strings;

public class StringExample {
    public static void main(String args[]){
        String s1="java";//creating string by Java string literal
        char ch[]={'s','t','r','i','n','g','s'};
        String s2=new String(ch);//converting char array to string
        String s3=new String("example");//creating Java string by new keyword
        String s7= "example";
        System.out.println(s7.equals(s3));//will verify values
        System.out.println(s7==s3);//will verify memory locations
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        String s4 = s3;
        System.out.println(s4==s3);//true
        String s5 = "a string";
        String s6 = "a string";
        System.out.println(s5.equals(s6));
    }
}
