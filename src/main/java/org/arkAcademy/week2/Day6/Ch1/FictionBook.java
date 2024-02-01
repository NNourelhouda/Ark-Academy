package org.arkAcademy.week2.Day6.Ch1;

public class FictionBook extends Book {
    private String genre;
    public FictionBook(String title, String author, int isbn, String genre) {
        super(title, author, isbn);
        this.genre = genre;
    }

    // Encapsulation: Getter and Setter methods for genre
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Polymorphism: Override displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genre + " (Fiction)");
    }
}
