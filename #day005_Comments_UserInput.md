# Day 5: Comments and User Input in Java

Today's lesson introduced how to use comments and different methods for user input in Java.

## Comments in Java

Comments are used to explain the code and make it more readable. They are ignored by the compiler and do not affect the program's execution. There are three types of comments in Java:

1. **Single-line comments**: Used for short explanations or notes.
    ```java
    // This is a single-line comment
    int number = 5; // This comment explains the variable declaration
    ```

2. **Multi-line comments**: Used for longer explanations or disabling blocks of code.
    ```java
    /*
     * This is a multi-line comment.
     * It can span multiple lines.
     */
    int number = 5;
    ```

3. **Javadoc comments**: Used to generate documentation for your code. They are placed before class, method, or field declarations.
    ```java
    /**
     * This is a Javadoc comment.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        int number = 5;
    }
    ```

## User Input in Java

Java provides several ways to handle user input. The most common method is using the `Scanner` class, but there are also other methods such as using `BufferedReader` and `Console`.

### Using Scanner

The `Scanner` class is part of the `java.util` package and is widely used for getting user input from the console.

1. **Import the Scanner class**:
    ```java
    import java.util.Scanner;
    ```

2. **Create a Scanner object**:
    ```java
    Scanner scanner = new Scanner(System.in);
    ```

3. **Read different types of input**:
    ```java
    // Reading a String input
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    // Reading an integer input
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    // Reading a double input
    System.out.print("Enter your salary: ");
    double salary = scanner.nextDouble();

    // Reading a char input
    System.out.print("Enter your gender (M/F): ");
    char gender = scanner.next().charAt(0);

    // Close the scanner
    scanner.close();
    ```

### Class, Object, and Methods in User Input

#### Class

A class in Java is a blueprint for creating objects. It defines a datatype by bundling data and methods that work on the data into one single unit. For example, the `Scanner` class allows you to create `Scanner` objects that can read user input.

#### Object

An object is an instance of a class. When a class is defined, no memory is allocated until an object of that class is created. For example:
```java
Scanner scanner = new Scanner(System.in);
```

#### Methods 

A method in Java is a block of code designed to perform a specific task. It is defined within a class and can be called upon to execute. Methods promote code reuse, modularity, and clarity.

Thanks for your attention Happy coding. 🙏 ❤️ 
