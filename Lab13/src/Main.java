import Module01.City;

public class Main {
    public static void main(String[] args) {
        City[] list = new City[6];

        list[0] = new City("Riyadh", 40);
        list[1] = new City("Mubarraz", 39);
        list[2] = new City("Dammam", 25);
        list[3] = list[2].clone();
        list[4] = new City("Jeddah", 40);
        list[5] = list[1].clone();

        for(City e: list){
            System.out.println(e+"\n");
        }

        System.out.println(list[1].compareTo(list[4]) + "\n"
                         + list[4].compareTo(list[0]) + "\n"
                         + list[5].equals(list[1])    + "\n"
                         + list[3].equals(list[0])    + "\n");
    }
}