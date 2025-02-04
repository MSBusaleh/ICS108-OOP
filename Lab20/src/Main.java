import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a list of numbers (put e at the end of the list)");
        while (input.hasNextInt())
            numbers.add(input.nextInt());

        System.out.println("The largest number is:  " + findLargest(numbers));
    }

    public static int findLargest(ArrayList<Integer> nums) {
        if (nums.size() == 1)
            return nums.get(0);

        else if (nums.size() == 0)
            return 0;

        else if (nums.get(0) > nums.get(1)) {
            nums.remove(1);
            return findLargest(nums);

        } else{
            nums.remove(0);
            return findLargest(nums);
        }

    }
}