public class Constructors {
    String name;
    int age;

    public Constructors(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("The name of the employee is:"+name+" and his age is :"+age);
        System.out.println("Parameterized constructor");
    }
    public Constructors(){
        System.out.println("Default constructor called");
    }

    public static void main(String[] args) {
       Constructors c = new Constructors("Sourav",26);
       Constructors d = new Constructors();


    }
}
