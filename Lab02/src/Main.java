import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many letter grades?");

        printNRandomLetterGrades(input.nextInt());
    }

    public static void printNRandomLetterGrades(int n) {
        for (int i = 0; i < n; i++) {
            int randomNum = (int) (Math.random() * 9);

            switch (randomNum) {
                case 0 -> System.out.println("A+");
                case 1 -> System.out.println("A");
                case 2 -> System.out.println("B+");
                case 3 -> System.out.println("B");
                case 4 -> System.out.println("C+");
                case 5 -> System.out.println("C");
                case 6 -> System.out.println("D+");
                case 7 -> System.out.println("D");
                case 8 -> System.out.println("F");
            }
        }
    }
}