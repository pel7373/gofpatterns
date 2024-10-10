package org.gofpatterns.iterator;

import org.gofpatterns.iterator.iterator.AuthorBookIterator;
import org.gofpatterns.iterator.iterator.BookIterator;
import org.gofpatterns.iterator.iterator.TitleBookIterator;
import org.gofpatterns.iterator.iterator.YearBookIterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("ttttt", "aaaa", 2012));
        bookList.add(new Book("aaaa", "xxxxx", 2010));
        bookList.add(new Book("cccccc", "rrrrr", 1924));
        bookList.add(new Book("dddd", "cccc", 1724));

        System.out.println("=== Title Iterator");
        BookIterator bookIterator = new TitleBookIterator(bookList);
        while(bookIterator.hasNext()) {
            System.out.println(bookIterator.getNext());
        }

        System.out.println();
        System.out.println("=== Author Iterator");
        bookIterator = new AuthorBookIterator(bookList);
        while(bookIterator.hasNext()) {
            System.out.println(bookIterator.getNext());
        }

        System.out.println();
        System.out.println("=== Year Iterator");
        bookIterator = new YearBookIterator(bookList);
        while(bookIterator.hasNext()) {
            System.out.println(bookIterator.getNext());
        }
    }

}