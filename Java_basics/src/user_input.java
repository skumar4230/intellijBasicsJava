import java.util.*;

public class user_input {
    public static void main(String[] args) {
//        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter username");
//
//        String userName = myObj.nextLine();  // Read user input
//        System.out.println("Username is: " + userName);  //
        Map map = new TreeMap();
        map.put("Spring",10);
        map.put("Java",20);
        map.put("spring",20);
        map.put("Java",50);
        System.out.println(map);

    }
}
