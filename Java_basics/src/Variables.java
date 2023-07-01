public class Variables {
    static int n=100;//static variable
    int p = 45;//instance variable
    void method()
    {
        int p=90;//local variable
        System.out.println(p+ " this is inside a method and printing local variable");
    }
    public static void main(String args[])
    {
//        int n=50;//instance variable
        System.out.println(n+" here we are printing static variable");
//        System.out.println(p +" this is an instance variable as it isn't a local variable");
        Variables m = new Variables();
        m.method();//we are calling method by creating object of class to access local variable
        System.out.println(m.p);//we can't get p directly without an object of class as it's an instance variable not a static variable

    }
}