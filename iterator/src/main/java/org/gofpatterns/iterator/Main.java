package org.gofpatterns.iterator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = List.of(
                new Book("George Orwell", "1984", 1949),
                new Book("J.K. Rowling", "Harry Potter and the Chamber of Secrets", 1998),
                new Book("J.R.R. Tolkien", "The Hobbit", 1937),
                new Book("F. Scott Fitzgerald", "The Great Gatsby", 1925),
                new Book("Mark Twain", "The Adventures of Tom Sawyer", 1876),
                new Book("George Orwell", "Animal Farm", 1945),
                new Book("Jane Austen", "Pride and Prejudice", 1813)
        );

        System.out.println("=== Title Iterator ===");
        GenericIterator<Book> bookIterator = new GenericIterator.BookTitleIterator(bookList);
        while(bookIterator.hasNext()) {
            System.out.println(bookIterator.next());
        }

        System.out.println();
        System.out.println("=== Author Iterator ===");
        bookIterator = new GenericIterator.BookAuthorIterator(bookList);
        while(bookIterator.hasNext()) {
            System.out.println(bookIterator.next());
        }

        System.out.println();
        System.out.println("=== Year Iterator ===");
        bookIterator = new GenericIterator.BookYearIterator(bookList);
        while(bookIterator.hasNext()) {
            System.out.println(bookIterator.next());
        }
    }
}