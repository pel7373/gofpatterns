package org.gofpatterns.strategy.sort;

public class BubbleSortStrategy implements SortStrategy{
    @Override
    public void execute() {
        System.out.println("Doing sort by bubble sort algorithm!");
    }
}
