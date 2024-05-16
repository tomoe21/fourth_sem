class Student2 implements Comparable<Student2> {
    String name;
    int rn;
    double totalMark;

    public Student2(String name, int rn, double totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    public int compareTo(Student2 other) {
        return Integer.compare(this.rn, other.rn);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rn=" + rn +
                ", totalMark=" + totalMark +
                '}';
    }

public class q5 {
    public static void bubbleSort(Student2[] students) {
        int n = students.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    // Swap students[j] and students[j + 1]
                    Student2 temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        // Creating an array of Student objects
        Student2[] students = new Student2[5];
        students[0] = new Student2("Alex", 105, 89.5);
        students[1] = new Student2("Zade", 101, 92.0);
        students[2] = new Student2("Seno", 104, 85.7);
        students[3] = new Student2("Anshu", 102, 90.3);
        bubbleSort(students);


        System.out.println("Sorted list of students by roll number:");
        for (Student2 student : students) {
            System.out.println(student);
        }
    }
}
}

