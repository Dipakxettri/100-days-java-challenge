# Day 29: Understanding Methods in Java

## **What is a Method?**
A method is a block of code that performs a specific task. It can be called to execute the code it contains. Methods help in organizing and reusing code.

## **Why Use Methods?**
- **Reusability:** Write once, use multiple times.
- **Modularity:** Break down complex problems into smaller, manageable pieces.
- **Maintainability:** Easier to manage and update code.

## **Syntax of a Method:**
```java
returnType methodName(parameters) {
    // Code to be executed
}
```

**Explanation of the Syntax:**
- **returnType:** The data type of the value the method returns. Use void if the method does not return a value.
- **methodName:** The name of the method.
- **parameters:** A list of input parameters (optional).

## **Example of a Simple Method:**
```java
public class Main {
    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(4, 4); // Calling the add method
        System.out.println("Sum: " + sum);
    }
}
```

## Types of Methods:

**1. Instance Methods:**
- **Belong to an instance of a class.**
- **Called on an object of the class.**
```java
public class Main {
    // Instance method
    public void display() {
        System.out.println("Hello, world!");
    }

    public static void main(String[] args) {
        Main obj = new Main(); // Creating an object
        obj.display(); // Calling the instance method
    }
}
```

**2. Static Methods:**
- **Belong to the class, not any object.**
- **Called using the class name.**
```java
public class Main {
    // Static method
    public static void display() {
        System.out.println("Hello, world!");
    }

    public static void main(String[] args) {
        Main.display(); // Calling the static method
    }
}
```

Thanks for your attention happy Coding ❤️❤️.
