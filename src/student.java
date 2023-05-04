import java.util.ArrayList;
import java.util.List;

public class student {
    int studentId;
    String studentName;

    public student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public class Main {
        public static void main(String[] args) {
            List<student> studentList = new ArrayList<student>();
            studentList.add(new student(1, "vidya"));
            studentList.add(new student(2, "balla"));
            studentList.stream().map(i -> i.studentName).forEach(i -> System.out.println(i));
        }
    }
}