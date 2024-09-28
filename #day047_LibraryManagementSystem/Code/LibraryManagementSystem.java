
//Library Management System

import java.util.Scanner;

class Library {
    
    // Variables
    private String[] availableBooks = {"C++", "Java", "DSA", "Networking", "Physics", "Python", "Maths", "AI", "ML", "App Development"};
    private String[] issuedBooks = new String[10];
    private int issuedCount = 0; // To track the number of issued books
    private Scanner sc = new Scanner(System.in);
    
    // Methods
    public void issueBooks() {
        if (issuedCount >= 10) {
            System.out.println("No more books can be issued.");
            return;
        }
        
        System.out.print("Enter Book Name: ");
        String book = sc.nextLine();
        
        // Check if the book is available
        boolean found = false;
        for (String availableBook : availableBooks) {
            if (availableBook.equalsIgnoreCase(book)) {
                found = true;
                break;
            }
        }
        
        if (found) {
            issuedBooks[issuedCount] = book;
            issuedCount++;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }
    
    public void returnIssuedBooks() {
        System.out.print("Issued Books: ");
        if (issuedCount == 0) {
            System.out.println("No books have been issued.");
        } else {
            for (int i = 0; i < issuedCount; i++) {
                System.out.print(issuedBooks[i] + " ");
            }
        }
        System.out.println();
    }
    
    public void returnAvailableBooks() {
        System.out.print("Available Books: ");
        for (String availableBook : availableBooks) {
            System.out.print(availableBook + " ");
        }
        System.out.println();
    }
    
    public void run() {
        while (true) {
            System.out.println("1. Issue Book");
            System.out.println("2. Return Issued Books");
            System.out.println("3. Show Available Books");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline
            
            switch (choice) {
                case 1:
                    issueBooks();
                    break;
                case 2:
                    returnIssuedBooks();
                    break;
                case 3:
                    returnAvailableBooks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return; // Exit the loop
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.run();
    }
}
