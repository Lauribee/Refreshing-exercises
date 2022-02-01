package com.company;

import java.util.ArrayList;

public class Library {
    public static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {

        Book book1 = new Book(201293, "The Axe", 2007);
        Book book2 = new Book(738407, "The Jungle Book", 2011);
        Book book3 = new Book(407259, "Snow White", 1985);

        books.add(book1);
        books.add(book2);
        books.add(book3);

        Book myBook = new Book(201293, "Be Nice! (Or else..)", 2000);
        Book my2Book = new Book(543890, "The Arts of BRUH", 2022);
        System.out.println(checkBookISBN(myBook));
        System.out.println(checkBookISBN(my2Book));

    }

    public static boolean checkBookISBN(Book myBook) {
        for (Book book : books) {
            if (book.getNumber() == myBook.getNumber()) {
                return true;
            } else return false;
        }
        return false;
    }
}
