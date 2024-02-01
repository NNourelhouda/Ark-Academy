package org.arkAcademy.week2.Day6.Ch1;

import java.util.ArrayList;

public class Library {
    //private instance variable Abooks of type ArrayList<Book> :
// used to store instances of the Book class
    private ArrayList<Book> Abooks;
    //constructor for the Library class:
// initializes the books ArrayList when a new Library object is created.
    public Library() {
        //initializes the books ArrayList when a new Library object is created.
        // "this"  used to refer to the current instance of the class.
        this.Abooks = new ArrayList<>();
    }


    //method addBook with parameter of type Book.
    // This method is used to add a Book object to the books ArrayList.
    public void addBook(Book ddbook) {
        //adds the provided Book object to the books ArrayList.
        Abooks.add(ddbook);
    }
    //method is used to display information about all books in the library.
    public void displayAllBooks() {
        //for-each loop that iterates over each Book object in the Abooks ArrayList.
        for (Book book : Abooks) {
            //calls the displayInfo method for each Book object in the loop,
            // which prints information about the book.
            book.displayInfo();
        }
    }
}
