import Package01.Person;
import Package02.Employee;
import Package02.Student;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Salem", "0504921098");
        Student st1 = new Student("Reem", "0598761234", "202112098", 2.9);
        Employee emp1 = new Employee("Yahya", "0566173312", "200189765", 1500000);

        System.out.println(person1);
        System.out.println(st1);
        System.out.println(emp1);
    }
}