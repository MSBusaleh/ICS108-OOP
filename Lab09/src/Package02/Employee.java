package Package02;

import Package01.Person;

public class Employee extends Person {
    private double salary;
    private String id;

    public Employee(String name, String phoneNum, String id, double salary) {
        super(name, phoneNum);
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + this.id + ", Salary: " + this.salary;
    }
}
