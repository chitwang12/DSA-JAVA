package classes_and_objects;

public class Student {
    public String name ;
    private int rollNumber;
    private static int numStudents;

    public Student(String n , int rollNumber)
    {
                name = n;
                this.rollNumber=rollNumber;
                numStudents++;
    }

    public static int getNumStudents()
    {
        return numStudents;
    }
    public int getRollNumber()
    {
        return  rollNumber;
    }

    public void setRollNumber(int rollNumber) {
       if(this.rollNumber <= 0)
           System.out.println("Invalid RollNumber ");
       else
        this.rollNumber = rollNumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
    public void print()
    {
        System.out.println(name+" : "+rollNumber);
    }
}
