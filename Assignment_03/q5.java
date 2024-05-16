package generics2;
import java.util.HashMap;
import java.util.Map;
class Book {
 private int id;
 private String name;
 private String author;
 private int quantity;

 public Book(int id, String name, String author, int quantity) {
     this.id = id;
     this.name = name;
     this.author = author;
     this.quantity = quantity;
 }

 public int getId() {
     return id;
 }

 public String getName() {
     return name;
 }

 public String getAuthor() {
     return author;
 }

 public int getQuantity() {
     return quantity;
 }

}

 class Library {
 private Map<Integer, Book> bookMap;

 public Library() {
     this.bookMap = new HashMap<>();
 }

 public void addBook(Book book) {
     bookMap.put(book.getId(), book);
 }

 public boolean isBookPresent(String bookName) {
     for (Book book : bookMap.values()) {
         if (book.getName().equals(bookName)) {
             return true;
         }
     }
     return false;
 }

 public void removeBook(int id) {
     bookMap.remove(id);
 }

 public void displayBooks() {
     for (Book book : bookMap.values()) {
         System.out.println(book);
     }
 }
public class q5{
 public static void main(String[] args) {
     Library library = new Library();

     Book book1 = new Book(1, "Java Programming", "John Doe", 5);
     Book book2 = new Book(2, "Python Crash Course", "Jane Smith", 3);

     library.addBook(book1);
     library.addBook(book2);

     library.displayBooks();

     System.out.println("Is 'Java Programming' present? " + library.isBookPresent("Java Programming"));
     System.out.println("Is 'C++ Programming' present? " + library.isBookPresent("C++ Programming"));

     library.removeBook(1);

     library.displayBooks();
 }
} 
}