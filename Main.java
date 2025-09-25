public class Main{
    public static void main(String[] args) {
        // Create some books
        Books book1 = new Books("1984", "George Orwell", "1234567890");
        Books book2 = new Books("To Kill a Mockingbird", "Harper Lee", "0987654321");

        // Create some users
        Users user1 = new Users("Alice", "U001");
        Users user2 = new Users("Bob", "U002");

        // Display books and userss
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(user1);
        System.out.println(user2);

        // Simulate borrowing a book
        if (book1.isAvailable()) {
            book1.setAvailable(false);
            System.out.println(user1.getName() + " borrowed " + book1.getTitle());
        } else {
            System.out.println(book1.getTitle() + " is not available.");
        }

        // Display updated book status
        System.out.println(book1);
    }
}