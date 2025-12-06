import java.util.*;

class Book {
    String title;
    boolean issued;

    Book(String t) { this.title = t; this.issued = false; }
}

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        books.add(new Book("Java"));
        books.add(new Book("Python"));
        books.add(new Book("C Programming"));

        while (true) {
            System.out.println("1. Add  2. Issue  3. Return  4. List  5. Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter title: ");
                books.add(new Book(sc.nextLine()));
            } 
            else if (ch == 2) {
                System.out.print("Enter title: ");
                String t = sc.nextLine();
                for (Book b : books)
                    if (b.title.equalsIgnoreCase(t) && !b.issued) b.issued = true;
            } 
            else if (ch == 3) {
                System.out.print("Enter title: ");
                String t = sc.nextLine();
                for (Book b : books)
                    if (b.title.equalsIgnoreCase(t) && b.issued) b.issued = false;
            } 
            else if (ch == 4) {
                for (Book b : books)
                    System.out.println(b.title + " — " + (b.issued ? "Issued" : "Available"));
            } 
            else break;
        }
    }
}
