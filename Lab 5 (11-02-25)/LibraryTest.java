// LibraryTest.java
public class LibraryTest {
    public static void main(String[] args) {
        // Create library items
        Book book = new Book("1984", "George Orwell", 1949);
        DVD dvd = new DVD("The Matrix", "The Wachowskis", 1999);
        Journal journal = new Journal("Nature", "Various", 2020);

        // Display items
        System.out.println(book);
        System.out.println(dvd);
        System.out.println(journal);

        // Test checking out and returning items
        System.out.println("\n-- Testing Check Out / Return --");
        book.checkOut();
        System.out.println("Is the book checked out? " + book.isCheckedOut());
        book.returnItem();
        System.out.println("Is the book checked out? " + book.isCheckedOut());
    }
}
