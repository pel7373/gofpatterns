package org.gofpatterns.iterator.iterator;

import org.gofpatterns.iterator.Book;

import java.util.*;

public class AuthorBookIterator implements BookIterator {
    private int currentIndex = 0;
    private List<Book> bookList;

    public AuthorBookIterator(List<Book> bookList) {
        this.bookList = bookList;
        Collections.sort(bookList, (b1, b2) -> b1.getAuthor().compareTo(b2.getAuthor()));
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