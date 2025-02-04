import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> containers = new ArrayList<>();
        containers.add(new ArrayList<>());

        System.out.println("Enter number of objects: ");
        int items = input.nextInt();
        System.out.println("Enter the weights of the objects: ");

        for (int i = 0; i < items; i++) {
            int weight = input.nextInt();
            boolean fit = false;
            int contNumber = 0;

            while (!fit && contNumber < containers.size()) {
                int sum = 0;
                for (int k = 0; k < containers.get(contNumber).size(); k++)
                    sum += (int) containers.get(contNumber).get(k);

                if (weight + sum <= 10) {
                    containers.get(contNumber).add(weight);
                    fit = true;
                }
                contNumber++;
            }

            if (!fit) {
                containers.add(new ArrayList<Integer>());
                containers.get(contNumber).add(weight);
            }
        }

        for (int i = 0; i < containers.size(); i++) {
            System.out.print("Container " + (i + 1) + " contains objects with weight ");
            for (int j = 0; j < containers.get(i).size(); j++) {
                System.out.print(containers.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}