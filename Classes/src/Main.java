import com.illiakornyk.student.Student;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        C_11 = 8
        Student[] students = {
                new Student("Alice", 20, 101, 3.5, "Computer Science"),
                new Student("Bob", 22, 101, 3.7, "Mathematics"),
                new Student("Charlie", 21, 103, 3.2, "Physics"),
                new Student("Diana", 19, 104, 3.9, "Biology"),
                new Student("Eve", 23, 105, 3.6, "Chemistry")
        };

        Arrays.sort(students, Comparator.comparingInt(Student::getStudentId)
                .thenComparing(Comparator.comparingInt(Student::getAge).reversed()));

        System.out.println("Students sorted by studentId (ascending) and age (descending):");
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
