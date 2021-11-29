import classes_and_objects.Student;

import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student s1 = new Student("Rahul",123);
        // If we have provided values in the constructor then there is no need to assign it individually hence commenting them out in the next lines.
         //s1.name="Rahul";
        //System.out.println(s1.name);
        //s1.setRollNumber(123);
        s1.print();
        Student s2 = new Student("Chitwan",124);
        System.out.println(Student.getNumStudents());
        //s2.name = "Chitwan";
        //s2.setRollNumber(124);
        //System.out.println(s2.name);
        s2.print();
    }
}
