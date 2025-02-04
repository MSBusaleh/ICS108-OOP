import exception.InvalidTime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            boolean validTime = false;
            int hour = 0, min = 0;
            String displayedmin = "00"; // this time will be displayed to avoid one number minute display


            while (!validTime) {
                System.out.println("\nEnter time in 24-hour notation");
                try {
                    String time = input.next();
                    hour = Integer.parseInt(String.valueOf(time.charAt(0) + String.valueOf(time.charAt(1))));
                    displayedmin = (String.valueOf(time.charAt(3) + String.valueOf(time.charAt(4))));
                    min = Integer.parseInt(displayedmin);

                    if (hour > 24 || hour < 0 || min > 59 || min < 0)
                        throw new InvalidTime("There is no such time as " + hour + ":" + displayedmin);

                    validTime = true;
                } catch (InvalidTime e) {
                    System.out.println(e.getMessage() + "\nTry again");
                }catch (Exception e){
                    System.out.println("Enter the time as numbers only in hh:mm notion"+ "\nTry again");
                }

            }
            if (hour > 12)
                hour = hour - 12;
            else if (hour == 0)
                hour = 12;


            System.out.println("That is the same as \n" + hour + ":" + displayedmin +"\ncontinue?(y/n)");

        } while (!input.next().equals("n"));

        System.out.println("End of program");
    }
}