package org.gofpatterns.strategy;

import org.gofpatterns.strategy.sort.SortStrategy;

public class CollectionList {
    private SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort() {
        sortStrategy.execute();
    }
}
