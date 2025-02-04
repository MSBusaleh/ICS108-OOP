import java.util.ArrayList;

public class Container {
    private ArrayList<Integer> weights = new ArrayList<>();
    private int max, sum;

    public Container(int maximum) {
        this.max = maximum;
    }

    public boolean addItem(int itemWeight) {
        boolean fit = false;
        for (int e : weights) {
            sum = +e;
        }

        if (itemWeight + sum <= max) {
            weights.add(itemWeight);
            fit = true;
        }

        return fit;
    }

    public ArrayList<Integer> getWeights() {
        return weights;
    }
}
