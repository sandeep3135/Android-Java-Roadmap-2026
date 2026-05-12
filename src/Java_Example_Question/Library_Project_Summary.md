📚 Project: Library Management System
Topic: Object Interaction & Search Algorithms (Composition)

This project simulates a real-world library where a Library class manages a collection of Book objects. It focuses on how different objects interact and how to handle data search efficiently.

🚀 Key Technical Features Demonstrated:
1.Composition ("Has-A" Relationship):

Instead of using inheritance, the Library class manages a collection of Book objects through a Book Array. This represents a real-world relationship where a library "has" books.

2.Object State Management:

Implemented a boolean isAvailable flag.

Created logic to toggle this state through borrowBook() and returnBook() methods, ensuring a book cannot be borrowed if it’s already out.

3.Advanced Search Logic:

Developed a findBook method that searches by both Title and Author.

Used .equalsIgnoreCase() to make the search user-friendly (not case-sensitive).

Implemented Multi-Result Logic: The search continues through the entire array to find all matches by a specific author.

4.Loop & Null Safety:

Used Null Guards (if (books[i] != null)) to prevent NullPointerExceptions when the library array isn't full.

Applied Ternary Operators for clean, professional status reporting.