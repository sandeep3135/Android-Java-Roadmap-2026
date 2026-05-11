package Java_Example_Question;

// Implement data from book class also create array list of books and print the data

public class Library{



    public static void main(String[] args) {

        Book[] books = new Book[10];

        books[0] = new Book("Half GirlFriend", "Chetan Bhagat");
        books[1] = new Book("One Night Stand","Pratyush");
        books[2] = new Book("Bewfa Ashique","Shubhankar");


        books[2].borrowBook();
        books[0].borrowBook();
        books[2].returnBook();
        books[0].borrowBook();

        System.out.println("-------------------------------------");
        for (int i = 0; i < books.length; i++){
            if (books[i] != null) {
                System.out.println("Book Title: " + books[i].title + " Author name: " + books[i].author);
                System.out.println("Status: " + (books[i].isAvailable ? "On Shelf" : "Borrowed"));
            }
        }
    }
}
