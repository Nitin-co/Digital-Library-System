import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class LibraryApp {
    private static LibraryService libraryService = new LibraryService();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Consumer<Scanner>> actions = new HashMap<>();
        actions.put("1", s -> {
            System.out.println("Enter Book ID :");
            String BookID = s.nextLine();
            System.out.println("Enter Title:");
            String Title = s.nextLine();
            System.out.println("Enter Author:");
            String Author = s.nextLine();
            System.out.println("Genre");
            String Genre = s.nextLine();
            libraryService = addBook(new Book(BookID, Title, Author, Genre, false));
            
                    });
                    actions.put("2", s -> libraryService.viewAllBooks());
                    actions.put("3", s -> {
                        System.out.println("Enter Book ID or title to Search");
                        String query = s.nextLine();
                        libraryService.searchBook(query);
                    });
                    actions.put("4",  s -> {
                        System.out.println("Enter Book ID or Title to update:");
                        String updateID = s.nextLine();
                        libraryService.updateBook(updateID, s);
                    });
                    actions.put("5", s -> {
                        System.out.println("Enter Book ID to delete:");
                        String deleteId = s.nextLine();
                        libraryService.deleteBook(deleteId);
                    });
                    actions.put("6", s -> {
                        System.out.println(" Exit");
                        s.close();
                        System.exit(0);
                    });
                    while(true) {
                        System.out.println("\n Digital Library System Menu");
                        System.out.println(" 1. Add a Book");
                        System.out.println(" 2. View All Books");
                        System.out.println(" 3. Search a Book");
                        System.out.println(" 4. Update a Book");
                        System.out.println(" 5. Delete a Book");
                        System.out.println(" 6. Exit");
                        System.out.println(" Choose an option");
            
                        String choice = scanner.nextLine().trim();
                        actions.getOrDefault(choice, s -> System.out.println("Invalid option. Try Again")).accept(scanner);
            
                    }
                }
            
                private static LibraryService addBook(Book book) {
                    throw new UnsupportedOperationException("Unimplemented method 'addBook'");
                }
}
