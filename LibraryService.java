import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryService {
    private final Map<String, Book> bookCollection = new HashMap<>();

    public boolean addBook(Book book) {
        if (bookCollection.containsKey(book.getBookID())) {
            System.out.println("Entered Book ID exists in the system");
            return false;
        }
        bookCollection.put(book.getBookID(), book);
        System.out.println("Book ID has been added successfully");
        return true;
    }


public void searchBook(String query) {
    for (Book book : bookCollection.values()) {
        if (book.getBookID().equalsIgnoreCase(query)|| book.getTitle().equalsIgnoreCase(query)) {
            System.out.println(book);
            return;
        }
    }  
    System.out.println("Book not found!");  

}

public boolean updateBook(String BookID, Scanner scanner) {
    if (!bookCollection.containsKey(BookID)) {
        System.out.println("BookID not found");
        return false;
    }
    Book book = bookCollection.get(BookID);

    System.out.println("Enter New Title :");
    String Title = scanner.nextLine();
    if (!Title.isEmpty()) book.setTitle(Title);

    System.out.println("Enter New Author :");
    String Author = scanner.nextLine();
    if (!Author.isEmpty()) book.setAuthor(Author);

    System.out.println("Enter New Genre:");
    String Genre = scanner.nextLine();
    if (!Genre.isEmpty()) book.setGenre(Genre);

    System.out.println("Is the book available (yes/no): ");
    String status = scanner.nextLine();
    book.setAvailable(status.equalsIgnoreCase("yes"));
    
    System.out.println("Book updated successfully!");
    return true;
}

public boolean deleteBook(String BookID) {
    if (bookCollection.remove(BookID) != null) {
        System.out.println("The Book has been deleted successfully!");
        return true;
    }
    System.out.println("Book ID not found!");
    return false;
}


public Object viewAllBooks() {
    throw new UnsupportedOperationException("Unimplemented method 'viewAllBooks'");
}
}