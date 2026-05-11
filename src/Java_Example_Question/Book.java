package Java_Example_Question;

public class Book {

    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false; // Give it to the user
            System.out.println("Success! You borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is already out.");
        }
    }

    public void returnBook() {
        if (!isAvailable) { // If it was NOT available (meaning someone had it)
            isAvailable = true;
            System.out.println("Thank you for returning: " + title);
        } else {
            System.out.println(title + " was already here in the library.");
        }
    }


    public static void main(String[] args) {

    }
}
