import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("unsortedStudents.txt");
        ArrayList<Long> data = new ArrayList<>();

        try {
            Scanner fin = new Scanner(file);
            while (fin.hasNextLong()) {
                data.add(fin.nextLong());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Collections.sort(data);

        try (PrintWriter newFile = new PrintWriter("sortedStudents.txt")) {
            for (long i : data) {
                newFile.println(i);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}