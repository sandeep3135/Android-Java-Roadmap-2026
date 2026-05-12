package Java_Example_Question;

// Implement data from book class also create array list of books and print the data

public class Library{

    public static void findBook(Book[] library, String searchTerm){   // implement search logic to find books

        boolean found = false;
        for (int i = 0; i < library.length; i++){
            if (library[i] != null){
                if (library[i].title.equalsIgnoreCase(searchTerm) || library[i].author.equalsIgnoreCase(searchTerm)){
                    found = true;
                    String status = library[i].isAvailable ? "On Shelf" : "Already Borrowed";
                    System.out.println("Book Found: " + library[i].title + " | Status: " + status);
                }
            }
        }
        if (!found){
            System.out.println("No book found matching: " + searchTerm);
        }
    }

    public static void main(String[] args) {

        Book[] books = new Book[10];

        books[0] = new Book("Half GirlFriend", "Chetan Bhagat");
        books[1] = new Book("One Night Stand","Pratyush");
        books[2] = new Book("Bewfa Ashique","Shubhankar");
        books[3] = new Book("Mere Brother Ki Dulhan","Shubhankar");


        books[2].borrowBook();
        books[0].borrowBook();
        books[2].returnBook();
        books[0].borrowBook();

        System.out.println("-------------------------------------");

        findBook(books, "Mere Brother Ki Dulhan");  // Search for something that doesn't exist
        findBook(books, "Chetan Bhagat"); // Search by Author
        findBook(books, "Half GirlFriend"); // Search by Title
        findBook(books, "Java Programming"); // Search for something that doesn't exist
        findBook(books, "Shubhankar"); // Search by Author

        System.out.println("-------------------------------------");
        for (int i = 0; i < books.length; i++){
            if (books[i] != null) {
                System.out.println("Book Title: " + books[i].title + " Author name: " + books[i].author);
                System.out.println("Status: " + (books[i].isAvailable ? "On Shelf" : "Already Borrowed"));
            }
        }
    }
}
