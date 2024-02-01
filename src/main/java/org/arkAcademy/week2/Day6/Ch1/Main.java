package org.arkAcademy.week2.Day6.Ch1;
public class Main {
    public static void main(String[] args) {
        Book fictionBook = new FictionBook("The Hobbit", "J.R.R. Tolkien", 978 - 0 - 261 - 10295 - 7, "Fantasy");
        Book nonFictionBook = new NonFictionBook("Sapiens", "Yuval Noah Harari", 978 - 0 - 06 - 231609 - 7, "History");

        Library library = new Library();
        library.addBook(fictionBook);
        library.addBook(nonFictionBook);

        library.displayAllBooks();
    }
}
