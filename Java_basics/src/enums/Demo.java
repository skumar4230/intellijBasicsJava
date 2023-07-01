package enums;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Demo {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
        //we can also iterate enums using for each loop
        for (Level enums : Level.values()) {
            System.out.println(enums);
        }
    }
}
