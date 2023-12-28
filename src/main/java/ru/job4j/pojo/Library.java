package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {

        Book book = new Book("Book", 100);
        Book book1 = new Book("Book1", 200);
        Book book2 = new Book("Book2", 300);
        Book book3 = new Book("Clean code", 400);

        Book[] books = new Book[4];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;

        for (int i = 0; i < books.length; i++) {
            Book publication = books[i];
            System.out.println(publication.getName() + " - " + publication.getCount());
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int i = 0; i < books.length; i++) {
            Book publication = books[i];
            System.out.println(publication.getName() + " - " + publication.getCount());
        }

        for (int i = 0; i < books.length; i++) {
            Book publication = books[i];
            if (publication.getName().equals("Clean code")) {
                System.out.println(publication.getName() + " - " + publication.getCount());
            }
        }
    }
}
