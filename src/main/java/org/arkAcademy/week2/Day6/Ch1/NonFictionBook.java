package org.arkAcademy.week2.Day6.Ch1;

public class NonFictionBook extends Book {
    private String subject;
    public NonFictionBook(String title, String author, int isbn, String subject) {
        super(title, author, isbn);
        this.subject = subject;
    }
    // Encapsulation: Getter and Setter methods for subject
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Polymorphism: Override displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject + " (Non-Fiction)");
    }
}
