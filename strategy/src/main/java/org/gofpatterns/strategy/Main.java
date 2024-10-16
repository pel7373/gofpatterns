package org.gofpatterns.strategy;

import org.gofpatterns.strategy.sort.BubbleSortStrategy;
import org.gofpatterns.strategy.sort.QuickSortStrategy;

public class Main {
    public static void main(String[] args) {
        CollectionList collectionList = new CollectionList();
        collectionList.setSortStrategy(new BubbleSortStrategy());
        collectionList.sort();

        collectionList.setSortStrategy(new QuickSortStrategy());
        collectionList.sort();
    }
}