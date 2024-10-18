package org.gofpatterns.strategy.sort;

public class QuickSortStrategy implements SortStrategy{
    @Override
    public void execute() {
        System.out.println("Doing sort by quick sort algorithm!");
    }
}
