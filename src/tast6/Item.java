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

    @Override
    public String toString() {
        return "itemName='" + itemName + '\'' +
                ", cost=" + cost +
                ", weight=" + weight +
                '}';
    }
}
