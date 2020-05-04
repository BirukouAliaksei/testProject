package tast6;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private Item[] items;
    private int capacity;

    private Backpack(Item[] items, int capacity) {
        this.items = items;
        this.capacity = capacity;
    }

    private void display() {
        if (items != null  &&  items.length > 0) {
            System.out.println("Backpack ");
            System.out.println("Capacity : " + capacity);
            System.out.println("Items :");

            for (Item item : items) {
                System.out.println("- " + item.toString());
            }
        }
    }

    private Fill solve() {
        int itemNumber = items.length;
        int[][] matrix = new int[itemNumber + 1][capacity + 1];

        for (int i = 0; i <= capacity; i++)
            matrix[0][i] = 0;

        for (int i = 1; i <= itemNumber; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (items[i - 1].weight > j)
                    matrix[i][j] = matrix[i-1][j];
                else
                    matrix[i][j] = Math.max(matrix[i-1][j], matrix[i-1][j - items[i-1].weight]
                            + items[i-1].cost);
            }
        }
        int result = matrix[itemNumber][capacity];
        int w = capacity;
        List<Item> itemsSolution = new ArrayList<>();

        for (int i = itemNumber; i > 0  &&  result > 0; i--) {
            if (result != matrix[i-1][w]) {
                itemsSolution.add(items[i-1]);
                result -= items[i-1].cost;
                w -= items[i-1].weight;
            }
        }
        return new Fill(itemsSolution, matrix[itemNumber][capacity]);
    }

    public static void main(String[] args) {
        Item[] items = {new Item("Book", 4, 6),
                new Item("Gold", 2, 7),
                new Item("Fish", 5, 5),
                new Item("Eggs", 1, 4)};

        Backpack backpack = new Backpack(items, 15);
        backpack.display();
        Fill solution = backpack.solve();
        solution.display();
    }
}
