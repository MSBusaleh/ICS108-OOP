import module01.Person;
import module02.Student;

import java.util.ArrayList;

public class Lab10 {
    public static void main(String[] args) {
        ArrayList<Person> personList = createPersonList();
//1. This method prints the employees only
        printEmployees(personList);

//2. This method finds the average salary of employees
        double avgSalary = avgSalary(personList);
        System.out.println("avg salary of = " + avgSalary);

//3. This method prints the students only
           printStudents(personList);

//4. This method finds the average GPA of students
        double avgGpa = avgGpa(personList);
        System.out.println("avg GPA of students = " + avgGpa);
    }

    private static ArrayList<Person> createPersonList() {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Employee("Saad", "0563428255", 200003, 16000));
        personList.add(new Student("Reem", "0564448202", 20000, 3.6));
        personList.add(new Employee("Salem", "0501331845", 200001, 9000));
        personList.add(new Student("Hasan", "0594448202", 20002, 2.8));
        return personList;
    }

    static void printEmployees(ArrayList<Person> people){
        System.out.println("List of Employees");
        System.out.println("Name    Phone       ID      Salary");
        System.out.println("__________________________________");
        for(Person i:people){
            if(i instanceof Employee){
                System.out.println(i);
            }
        }
    }

    static double avgSalary(ArrayList<Person> people){
        double salarySum = 0;
        int employees =0;

        for(Person i:people){
            if(i instanceof Employee){
                salarySum += ((Employee) i).getSalary();
                employees += 1;
            }
        }

        return salarySum/employees;
    }


    static void printStudents(ArrayList<Person> people){
        System.out.println("\nList of Students");
        System.out.println("Name    Phone       ID      GPA");
        System.out.println("__________________________________");
        for(Person i:people){
            if(i instanceof Student){
                System.out.println(i);
            }
        }
    }

    static double avgGpa(ArrayList<Person> people){
        double gpaSum = 0;
        int students =0;

        for(Person i:people){
            if(i instanceof Student){
                gpaSum += ((Student) i).getGpa();
                students += 1;
            }
        }

        return gpaSum /students;
    }
}


