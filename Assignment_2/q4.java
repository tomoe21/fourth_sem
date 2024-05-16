import java.util.*;
class Student1 implements Comparable<Student1> {
    String name;
    int rn;
    double totalMark;

    public Student1(String name, int rn, double totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    public int compareTo(Student1 other) {
        return Integer.compare(this.rn, other.rn);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rn=" + rn +
                ", totalMark=" + totalMark +
                '}';
    }
}

public class q4 {
    public static Student1 linearSearch(Student1[] students, int rollNumber) {
        for (Student1 student : students) {
            if (student.rn == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Student1[] students = new Student1[5];
        students[0] = new Student1("Alex", 101, 89.5);
        students[1] = new Student1("Zade", 102, 92.0);
        students[2] = new Student1("Dante", 103, 85.7);
        students[3] = new Student1("Xavier", 104, 90.3);

        int rollNumberToSearch = 103;
        Student1 result = linearSearch(students, rollNumberToSearch);

        if (result != null) {
            System.out.println("Student found: " + result);
        } else {
            System.out.println("Student with roll number " + rollNumberToSearch + " not found.");
        }
    }
}

