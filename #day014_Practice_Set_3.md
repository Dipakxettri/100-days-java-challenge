# Day 14 : Strings Practice Set 3 Exercises

Today is all about practicing essential Java string manipulations. Below are the questions and their solutions with detailed comments.

## Questions and Solutions

### Q.no 1) Write a Java program to convert a string to lowercase

```java
public class Main {
    public static void main(String[] args) {
        String str = "HELLO, WORLD!";
        // Convert the string to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println(lowerStr); // Output: hello, world!
    }
}
```

## Q.no 2) Write a Java program to find the length of a string

```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello, world!";
        // Find the length of the string
        int length = str.length();
        System.out.println("The length of the string is: " + length); // Output: The length of the string is: 13
    }
}
```

### Q.no 3) Write a Java program to convert a string to uppercase

```java
public class Main {
    public static void main(String[] args) {
        String str = "hello, world!";
        // Convert the string to uppercase
        String upperStr = str.toUpperCase();
        System.out.println(upperStr); // Output: HELLO, WORLD!
    }
}
```

### Q.no 4) Write a Java program to fill a letter template which looks like this:
Letter = "Dear <|name|>, Thanks a lot."

```java
public class Main {
    public static void main(String[] args) {
        String template = "Dear <|name|>, Thanks a lot.";
        String name = "Deepak";
        
        // Replace <|name|> with the actual name
        String filledLetter = template.replace("<|name|>", name);
        System.out.println(filledLetter); // Output: Dear Deepak, Thanks a lot.
    }
}
```

### Q.no 5) Write a Java program to detect double and triple spaces in a string

```java
public class Main {
    public static void main(String[] args) {
        String str = "This string  has double  spaces and   triple spaces.";
        
        // Detect double spaces
        boolean hasDoubleSpaces = str.contains("  ");
        System.out.println("Contains double spaces: " + hasDoubleSpaces); // Output: true
        
        // Detect triple spaces
        boolean hasTripleSpaces = str.contains("   ");
        System.out.println("Contains triple spaces: " + hasTripleSpaces); // Output: true
    }
}
```

### Q.no 6) Write a program to format the given letter using escape sequence characters

```java
public class Main {
    public static void main(String[] args) {
        // Original letter
        String letter = "Dear Deepak,This is a very helpful documentation";
        
        // Format the letter using escape sequence characters
        String formattedLetter = "Dear Deepak,\n\tThis is a very helpful documentation.";
        
        System.out.println(formattedLetter);
        // Output:
        // Dear Deepak,
        //     This is a very helpful documentation.
    }
}
```

Thanks for your attention Happy coding.🙏 ❤️ 
