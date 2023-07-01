package compare;

import java.util.Comparator;

public class secComparator implements  Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSec().compareTo(o2.getSec());
    }
}
