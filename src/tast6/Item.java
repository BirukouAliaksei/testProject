package tast6;

public class Item {

    private String itemName;
    int cost;
    int weight;

    Item(String itemName, int cost, int weight) {
        this.itemName = itemName;
        this.cost = cost;
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "itemName='" + itemName + '\'' +
                ", cost=" + cost +
                ", weight=" + weight +
                '}';
    }
}
