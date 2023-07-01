package runtimePolymorphism;
public class Animal{
    String bark = "Parent barking";//data member
        void eat(){System.out.println("eating");}
        }
class Dog extends Animal{
    String bark = "Child class 1 barking";
    void eat(){System.out.println("eating fruits");}
}
class BabyDog extends Dog{
    String bark = "child class 2 barking";
    void eat(){System.out.println("drinking milk");}
    public static void main(String args[]){

        Animal  a1=new Animal();
        a1.eat();
        System.out.println(a1.bark);
        //if a method is called using reference of parent class then method of child class is called otherwise for data members parent class is used
        //method of child class only be executed if it is overridden
        Animal  a2=new Dog();
        a2.eat();
        System.out.println(a2.bark);

        Animal  a3=new BabyDog();
        System.out.println(a3.bark);
        a3.eat();


    }
}
