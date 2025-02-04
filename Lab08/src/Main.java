import Package02.MCQ;

public class Main {
    public static void main(String[] args) {
        MCQ myQ = new MCQ("Variables that are shared by every instance of a class are: ", new String[]{"public variables", "private variables", "instance variables", "class variables"}, "d");

        System.out.println(myQ);
    }
}