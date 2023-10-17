import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    String roll_number;
    float cgpa;

    public Student(String name, String roll_number, float cgpa) {
        this.name = name;
        this.roll_number = roll_number;
        this.cgpa = cgpa;
    }
}

public class Main {
    public static void sort_students(List<Student> students) {
        // Use a custom comparator to sort by CGPA in descending order
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Float.compare(s2.cgpa, s1.cgpa);
            }
        });
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice", "101", 3.8f));
        studentList.add(new Student("Bob", "102", 3.6f));
        studentList.add(new Student("Charlie", "103", 3.9f));
        studentList.add(new Student("David", "104", 3.5f));

        System.out.println("Before sorting:");
        for (Student student : studentList) {
            System.out.println(student.name + " - " + student.cgpa);
        }

        sort_students(studentList);

        System.out.println("\nAfter sorting:");
        for (Student student : studentList) {
            System.out.println(student.name + " - " + student.cgpa);
        }
    }
}