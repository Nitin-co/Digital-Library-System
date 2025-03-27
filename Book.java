public class Book {
    private final String BookID;
    private String Title;
    private String Author;
    private String Genre;
    private boolean BookAvailable;

    public Book(String BookID, String Title, String Author, String Genre, boolean BookAvailable) {
        this.BookID = BookID;
        this.Title = Title;
        this.Author = Author;
        this.Genre = Genre;
        this.BookAvailable = true;
    }

    public String getBookID() { return BookID;}
    public String getTitle() {return Title;}
    public void setTitle(String Title) {this.Title = Title;}
    public String getAuthor() {return Author;}
    public void setAuthor(String Author) {this.Author = Author;}
    public String getGenre() {return Genre;}
    public void setGenre(String Genre) {this.Genre = Genre;}
    public boolean BookAvailable() {return BookAvailable;}
    public void setAvailable(boolean BookAvailable) {BookAvailable = BookAvailable();}
    
}


