package superKeyword;

class Animal{
    Animal(){System.out.println("animal is created");}
}
class Dog extends Animal{
    Dog(){
//        super();//super keyword is on the move implicitly even if we don't provide it you can check by commenting this line of code
        System.out.println("dog is created");
    }
}
class TestSuper4{
    public static void main(String args[]){
        Dog d=new Dog();
    }}
