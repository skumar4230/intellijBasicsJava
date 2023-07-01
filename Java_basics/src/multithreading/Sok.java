package multithreading;

public class Sok extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread in Sok");
    }}
class Soker extends Thread {
    @Override
    public void run() {
        System.out.println("thread in Soker");
    }
}
class Test{
    public static void main(String[] args) {
        Sok s = new Sok();
    Soker s1 = new Soker();
    s.start();
    s1.start();    }
}
