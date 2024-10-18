package org.gofpatterns.iterator;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class GenericIterator<T> implements Iterator<T> {
    private final Iterator<T> iterator;

    public GenericIterator(Collection<T> items, Comparator<T> comparator) {
        iterator = items.stream().sorted(comparator).iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public T next() {
        return iterator.next();
    }

    public static class BookAuthorIterator extends GenericIterator<Book> {
        public BookAuthorIterator(Collection<Book> items) {
            super(items, Comparator.comparing(Book::getAuthor));
        }
    }

    public static class BookTitleIterator extends GenericIterator<Book> {
        public BookTitleIterator(Collection<Book> items) {
            super(items, Comparator.comparing(Book::getTitle));
        }
    }

    public static class BookYearIterator extends GenericIterator<Book> {
        public BookYearIterator(Collection<Book> items) {
            super(items, Comparator.comparing(Book::getYear));
        }
    }
}
