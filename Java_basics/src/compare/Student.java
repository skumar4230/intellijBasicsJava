package compare;

public class Student implements Comparable<Student> {
   private String name;
   private Integer roll;
   private Character sec;

    public Student(String name, Integer roll, Character sec) {
        this.name = name;
        this.roll = roll;
        this.sec = sec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public Character getSec() {
        return sec;
    }

    public void setSec(Character sec) {
        this.sec = sec;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", sec=" + sec +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getRoll()-o.getRoll();
    }
}
