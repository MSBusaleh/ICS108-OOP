import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean valid;

        System.out.println("Enter the size of the array: ");
        int[] numbers = new int[input.nextInt()];

        System.out.println("Enter the contents of the array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        valid = isValid(numbers);
        if (valid)
            System.out.println("The Array is valid!");
        else
            System.out.println("The Array is not valid!");
    }


    public static boolean isValid(int[] numbers) {
        int sum1 = 0, sum2 = 0; //sum1 is the sum of the given array while sum2 is sum of the needed list

        for(int e: numbers){
            if(e<1 || e>numbers.length)
                return false;
        }

        for (int i = 0; i < numbers.length; i++) {
            sum1 += numbers[i];
            sum2 += i+1;
        }

        return sum1==sum2;
    }
}