package tast6;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    // items of our problem
    private Item[] items;
    // capacity of the bag
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

    // we write the solve algorithm
    private Solution solve() {
        int NB_ITEMS = items.length;
        // we use a matrix to store the max value at each n-th item
        int[][] matrix = new int[NB_ITEMS + 1][capacity + 1];

        // first line is initialized to 0
        for (int i = 0; i <= capacity; i++)
            matrix[0][i] = 0;

        // we iterate on items
        for (int i = 1; i <= NB_ITEMS; i++) {
            // we iterate on each capacity
            for (int j = 0; j <= capacity; j++) {
                if (items[i - 1].weight > j)
                    matrix[i][j] = matrix[i-1][j];
                else
                    // we maximize value at this rank in the matrix
                    matrix[i][j] = Math.max(matrix[i-1][j], matrix[i-1][j - items[i-1].weight]
                            + items[i-1].cost);
            }
        }

        int res = matrix[NB_ITEMS][capacity];
        int w = capacity;
        List<Item> itemsSolution = new ArrayList<>();

        for (int i = NB_ITEMS; i > 0  &&  res > 0; i--) {
            if (res != matrix[i-1][w]) {
                itemsSolution.add(items[i-1]);
                // we remove items value and weight
                res -= items[i-1].cost;
                w -= items[i-1].weight;
            }
        }

        return new Solution(itemsSolution, matrix[NB_ITEMS][capacity]);
    }

    public static void main(String[] args) {
        // we take the same instance of the problem displayed in the image
        Item[] items = {new Item("Book", 4, 6),
                new Item("Gold", 2, 7),
                new Item("Fish", 5, 5),
                new Item("Eggs", 1, 4)};


        Backpack backpack = new Backpack(items, 15);
        backpack.display();
        Solution solution = backpack.solve();
        solution.display();
    }
}

