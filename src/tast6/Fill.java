package tast6;

import java.util.List;

public class Fill {

    private List<Item> items;
    private int cost;

    Fill(List<Item> items, int cost) {
        this.items = items;
        this.cost = cost;
    }

    void display() {
        if (items != null && !items.isEmpty()) {
            System.out.println("Backpack solution");
            System.out.println("Value = " + cost);
            System.out.println("Items to pick :");

            for (Item item : items) {
                System.out.println("- " + item.toString());
            }
        }
    }
}

