public class College {
	
    String collegeName,collegeLocation;
    
    public College(String collegeName, String collegeLocation){
        this.collegeName=collegeName;
        this.collegeLocation=collegeLocation;
    }
}
public class Student {
    String studentName;
    int studentId;
    College info;

    public Student(String studentName, int studentId, College info){
        this.studentName=studentName;
        this.studentId=studentId;
        this.info=info;
    }

    public void displayStudentInfo(){
        System.out.println("Student details:");
        System.out.println("Name: "+this.studentName);
        System.out.println("Id: "+this.studentId);
        System.out.println("College Name: "+this.info.collegeName);
        System.out.println("College Location: "+this.info.collegeLocation);
    }

   
}
public class q5 {
    public static void main(String[] args) {
        
        College c1=new College("ITER", "Bhubaneswar");
        College c2=new College("IIT", "Bombay");

        Student s1=new Student("Debadarshi Omkar", 5006, c1);
        Student s2=new Student("Virat Kohli", 5018, c2);

        s1.displayStudentInfo();
        System.out.println();
        s2.displayStudentInfo();
        
    }
    
}
