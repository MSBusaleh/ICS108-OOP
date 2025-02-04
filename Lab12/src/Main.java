import Module01.Student;
import Module02.Undergraduate;
import Module3.Graduate;

public class Main {
    public static void main(String[] args) {
        Student[] stList = new Student[5];

        stList[0] = new Graduate("20216123", 2.3);
        stList[1] = new Graduate("20220003", 3.8);
        stList[2] = new Undergraduate("20201234", 1.1);
        stList[3] = new Undergraduate("20181616", 4.0);
        stList[4] = new Undergraduate("20215908", 2.5);

        for(Student e: stList){
            System.out.println(e+"\n");
        }
    }
}