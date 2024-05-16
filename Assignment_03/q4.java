package generics2;
import java.util.*;

class Student {
    private String name;
    private int age;
    private double mark;
 
    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    } 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
 
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age &&
                Double.compare(student.mark, mark) == 0 &&
                Objects.equals(name, student.name);
    } 
    public int hashCode() {
        return Objects.hash(name, age, mark);
    }
 }

public class q4 {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        Scanner scanner = new Scanner(System.in); 
        students.add(new Student("neha", 20, 85.5));
        students.add(new Student("seno", 22, 90.0));
        students.add(new Student("anshika", 21, 78.3));
 
        System.out.println("List of students:");
        for (Student student : students) {
            System.out.println(student);
        } 
        System.out.println("\nEnter details of the student to search:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Mark: ");
        double mark = scanner.nextDouble();
        scanner.nextLine(); 

        Student searchStudent = new Student(name, age, mark);

        if (students.contains(searchStudent)) {
            System.out.println("The student exists in the list (checked by content).");
        } else {
            System.out.println("The student does not exist in the list.");
        } 
        System.out.println("\nEnter details of the student to remove:");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Age: ");
        age = scanner.nextInt();
        System.out.print("Mark: ");
        mark = scanner.nextDouble();
        scanner.nextLine(); 

        Student removeStudent = new Student(name, age, mark);
        if (students.remove(removeStudent)) {
            System.out.println("The student was removed from the list.");
        } else {
            System.out.println("The student was not found in the list.");
        } 
        System.out.println("\nNumber of students in the list: " + students.size()); 
        System.out.println("\nUpdated list of students:");
        for (Student student : students) {
            System.out.println(student);
    
        }
    }
}
