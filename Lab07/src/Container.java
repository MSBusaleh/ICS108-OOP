import java.util.ArrayList;

public class Container {
    private ArrayList<Integer> weights;
    private int maxWeight, currentWeight;

    public Container(int maximum) {
        this.maxWeight = maximum;
        currentWeight = 0;
        weights = new ArrayList<>();
    }

    public boolean addItem(int itemWeight) {

        boolean fit = false;
        if (itemWeight + currentWeight <= maxWeight) {
            weights.add(itemWeight);
            currentWeight += itemWeight;
            fit = true;
        }

        return fit;
    }

    public ArrayList<Integer> getWeights() {
        return weights;
    }
}
