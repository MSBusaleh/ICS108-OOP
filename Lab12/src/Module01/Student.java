package Module01;

public abstract class Student{
    private String id;
    private double gpa;

    public Student(String id,double gpa){
        this.id = id;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public abstract String getStatus();

    @Override
    public final String toString() {
        return "ID: " + this.id + "\nGPA: " + this.gpa + "\nStatus: " + getStatus();
    }
}
