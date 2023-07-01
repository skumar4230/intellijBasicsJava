package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Sourav",53,'A'));
        studentList.add(new Student("Sok",01,'B'));
        studentList.add(new Student("Soker",45,'A'));
        studentList.add(new Student("Sokes",27,'C'));
        studentList.add(new Student("Soked",19,'B'));
//        System.out.println(studentList);
        Collections.sort(studentList);
        System.out.println(studentList);

//        Collections.sort(studentList,new secComparator());
        Collections.sort(studentList,new nameComparator());
       System.out.println(studentList);
    }
}
