package org.gofpatterns.iterator.iterator;

import org.gofpatterns.iterator.Book;

public interface BookIterator {
    boolean hasNext();

    Book getNext();

    void reset();
}
