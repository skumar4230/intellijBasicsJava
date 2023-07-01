public class Inheritance {
    void method(){
        System.out.println("Method of Inheritance class");
    };
}
 class Level extends Inheritance{
    void method1(){
        System.out.println("method 1 of Level");

    }
}
class Next extends Level{
    void method1(){
        System.out.println("method2 in next");
    }

    public static void main(String[] args) {
        System.out.println("Java supports  Single as well as multilevel inheritance");
       Level n = new Next();
        n.method();
        n.method1();
        n.method1();
    }

}
