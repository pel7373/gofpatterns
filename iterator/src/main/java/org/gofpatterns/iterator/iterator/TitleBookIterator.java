package org.gofpatterns.iterator.iterator;

import org.gofpatterns.iterator.Book;

import java.util.*;

public class TitleBookIterator implements BookIterator {
    private int currentIndex = 0;
    private List<Book> bookList;

    public TitleBookIterator(List<Book> bookList) {
        this.bookList = bookList;
        Collections.sort(bookList, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
    }

    @Override
    public boolean hasNext() {
        if (currentIndex < bookList.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Book getNext() {
        if (!hasNext()) {
            throw new NoSuchElementException("There is not next element in the bookList");
        }
        return bookList.get(currentIndex++);
    }

    @Override
    public void reset() {
        currentIndex = 0;
    }
}