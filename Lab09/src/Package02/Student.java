package Package02;

import Package01.Person;

public class Student extends Person {

    private double gpa;
    private String id;

    public Student(String name, String phoneNum, String id, double gpa) {
        super(name, phoneNum);
        this.gpa = gpa;
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + this.id + ", GPA: " + this.gpa;
    }
}
