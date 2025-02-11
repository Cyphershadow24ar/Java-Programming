// Create a class hierarchy for a library system with classes such as LibraryItem, Book, DVD, and Journal. Implement methods for checking out and returning items.

// LibraryItem.java
public class LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean checkedOut;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
        checkedOut = true;
        System.out.println(getTitle() + " has been checked out.");
    }

    public void returnItem() {
        checkedOut = false;
        System.out.println(getTitle() + " has been returned.");
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + year + ")";
    }
}
