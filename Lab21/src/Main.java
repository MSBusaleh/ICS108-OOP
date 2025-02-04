import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(1);
        myList.add(3);
        myList.add(1);

        System.out.println("Original List:  "+ myList);
        remove(myList,1);
        System.out.println("New List:  "+ myList);

    }

    public static void remove(ArrayList<Integer> list, Integer target){
        if(list.contains(target)){
            list.remove(target);
            remove(list,target);
        }
    }
}