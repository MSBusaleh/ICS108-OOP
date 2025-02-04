import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Container> myContainers = new ArrayList<>();
        myContainers.add(new Container(10));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of objects: ");
        int n = input.nextInt();
        System.out.println("Enter the weights of the objects: ");
        
        for(int i = 0; i<n; i++){
            boolean fit = false;
            int t = 0, item = input.nextInt();


            while(!fit && t<myContainers.size()){
                fit = myContainers.get(t).addItem(item);
                t++;
            }

            if(!fit){
                myContainers.add(new Container(10));
                myContainers.get(t).addItem(item);
            }
        }

        for(int i = 0; i<myContainers.size(); i++){
            System.out.println("Container " + i + " contains objects with weights " + myContainers.get(i).getWeights());
        }
    }
}